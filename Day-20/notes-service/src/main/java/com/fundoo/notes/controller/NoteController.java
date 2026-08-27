package com.fundoo.notes.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import com.fundoo.notes.dto.request.NoteRequest;
import com.fundoo.notes.dto.request.ReminderRequest;
import com.fundoo.notes.dto.request.TagRequest;
import com.fundoo.notes.dto.response.NoteResponseDTO;
import com.fundoo.notes.entity.Note.NoteState;
import com.fundoo.notes.service.NoteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/notes")
public class NoteController {

	private final NoteService noteService;

	public NoteController(NoteService noteService) {
		this.noteService = noteService;
	}

	private int currentUserId() {
		return Integer.parseInt(SecurityContextHolder.getContext().getAuthentication().getName());
	}

	@PostMapping
	public ResponseEntity<NoteResponseDTO> createNote(@Valid @RequestBody NoteRequest request) {
		return ResponseEntity.status(HttpStatus.CREATED).body(noteService.createNote(currentUserId(), request));
	}

	@PutMapping("/{noteId}")
	public ResponseEntity<NoteResponseDTO> updateNote(@PathVariable int noteId,
			@Valid @RequestBody NoteRequest request) {

		return ResponseEntity.ok(noteService.updateNote(noteId, currentUserId(), request));
	}

	@GetMapping
	public ResponseEntity<List<NoteResponseDTO>> getNotes(@RequestParam(required = false) String state,
			@RequestParam(required = false) Boolean pinned, @RequestParam(required = false) String tag) {

		return ResponseEntity.ok(noteService.getNotes(currentUserId(), state, pinned, tag));
	}

	@GetMapping("/search")
	public ResponseEntity<List<NoteResponseDTO>> searchNotes(@RequestParam(required = false) String title,
			@RequestParam(required = false) NoteState state, @RequestParam(required = false) String tag) {

		return ResponseEntity.ok(noteService.searchNotes(currentUserId(), title, state, tag));
	}

	@DeleteMapping("/{noteId}")
	public ResponseEntity<Void> deleteNote(@PathVariable int noteId) {
		noteService.deleteNote(noteId, currentUserId());
		return ResponseEntity.noContent().build();
	}

	@PatchMapping("/{noteId}/archive")
	public ResponseEntity<NoteResponseDTO> archiveNote(@PathVariable int noteId) {
		return ResponseEntity.ok(noteService.archiveNote(noteId, currentUserId()));
	}

	@PatchMapping("/{noteId}/trash")
	public ResponseEntity<NoteResponseDTO> trashNote(@PathVariable int noteId) {
		return ResponseEntity.ok(noteService.trashNote(noteId, currentUserId()));
	}

	@PatchMapping("/{noteId}/restore")
	public ResponseEntity<NoteResponseDTO> restoreNote(@PathVariable int noteId) {
		return ResponseEntity.ok(noteService.restoreNote(noteId, currentUserId()));
	}

	@PatchMapping("/{noteId}/pin")
	public ResponseEntity<NoteResponseDTO> pinNote(@PathVariable int noteId) {
		return ResponseEntity.ok(noteService.pinNote(noteId, currentUserId()));
	}

	@PatchMapping("/{noteId}/unpin")
	public ResponseEntity<NoteResponseDTO> unpinNote(@PathVariable int noteId) {
		return ResponseEntity.ok(noteService.unpinNote(noteId, currentUserId()));
	}

	@PostMapping("/{noteId}/tags")
	public ResponseEntity<NoteResponseDTO> addTagToNote(@PathVariable int noteId,
			@Valid @RequestBody TagRequest request) {

		return ResponseEntity.ok(noteService.addTagToNote(noteId, currentUserId(), request.getName()));
	}

	@PostMapping("/{noteId}/reminder")
	public ResponseEntity<NoteResponseDTO> setReminder(@PathVariable int noteId,
			@Valid @RequestBody ReminderRequest request) {

		return ResponseEntity.ok(noteService.setReminder(noteId, currentUserId(), request.getReminderAt()));
	}
}