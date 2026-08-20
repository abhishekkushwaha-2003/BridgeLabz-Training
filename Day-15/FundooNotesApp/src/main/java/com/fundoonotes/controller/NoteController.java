package com.fundoonotes.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import com.fundoonotes.dto.request.NoteRequest;
import com.fundoonotes.dto.request.TagRequest;
import com.fundoonotes.dto.response.NoteResponseDTO;
import com.fundoonotes.entity.Note.NoteState;
import com.fundoonotes.service.NoteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/notes")
public class NoteController {

	private final NoteService noteService;

	public NoteController(NoteService noteService) {
		this.noteService = noteService;
	}

	private int currentUserId() {
		String userId = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		return Integer.parseInt(userId);
	}

	@PostMapping
	public ResponseEntity<NoteResponseDTO> createNote(@Valid @RequestBody NoteRequest request) {
		return ResponseEntity.status(HttpStatus.CREATED).body(noteService.createNote(currentUserId(), request));
	}

	@GetMapping
	public List<NoteResponseDTO> getNotes(@RequestParam(required = false) String state,
			@RequestParam(required = false) Boolean pinned, @RequestParam(required = false) String tag) {

		return noteService.getNotes(currentUserId(), state, pinned, tag);
	}

	@GetMapping("/search")
	public List<NoteResponseDTO> searchNotes(@RequestParam(required = false) String title,
			@RequestParam(required = false) String state, @RequestParam(required = false) String tag) {

		NoteState noteState = null;

		if (state != null && !state.isBlank()) {
			noteState = NoteState.valueOf(state.toUpperCase());
		}

		return noteService.searchNotes(currentUserId(), title, noteState, tag);
	}

	@PatchMapping("/{id}/archive")
	public ResponseEntity<NoteResponseDTO> archiveNote(@PathVariable int id) {
		return ResponseEntity.ok(noteService.archiveNote(id, currentUserId()));
	}

	@PatchMapping("/{id}/trash")
	public ResponseEntity<NoteResponseDTO> trashNote(@PathVariable int id) {
		return ResponseEntity.ok(noteService.trashNote(id, currentUserId()));
	}

	@PatchMapping("/{id}/restore")
	public ResponseEntity<NoteResponseDTO> restoreNote(@PathVariable int id) {
		return ResponseEntity.ok(noteService.restoreNote(id, currentUserId()));
	}

	@PatchMapping("/{id}/pin")
	public ResponseEntity<NoteResponseDTO> pinNote(@PathVariable int id) {
		return ResponseEntity.ok(noteService.pinNote(id, currentUserId()));
	}

	@PatchMapping("/{id}/unpin")
	public ResponseEntity<NoteResponseDTO> unpinNote(@PathVariable int id) {
		return ResponseEntity.ok(noteService.unpinNote(id, currentUserId()));
	}

	@PostMapping("/{id}/tags")
	public ResponseEntity<NoteResponseDTO> addTagToNote(@PathVariable int id, @Valid @RequestBody TagRequest request) {

		return ResponseEntity.ok(noteService.addTagToNote(id, currentUserId(), request.getName()));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteNote(@PathVariable int id) {
		noteService.deleteNote(id, currentUserId());
		return ResponseEntity.noContent().build();
	}
}