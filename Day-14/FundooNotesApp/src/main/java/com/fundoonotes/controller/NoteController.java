package com.fundoonotes.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fundoonotes.entity.Note;
import com.fundoonotes.service.NoteService;

@RestController
@RequestMapping("/notes")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    private int currentUserId() {
        String userId = (String) SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal();

        return Integer.parseInt(userId);
    }

    @PostMapping
    public ResponseEntity<Note> createNote(@RequestBody Map<String, String> body) {

        Note note = noteService.createNote(
                currentUserId(),
                body.get("title"),
                body.get("content")
        );

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(note);
    }

    @GetMapping
    public List<Note> getMyNotes() {
        return noteService.findByOwner(currentUserId());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNote(@PathVariable int id) {

        boolean deleted = noteService.deleteNote(id, currentUserId());

        return deleted
                ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }
}