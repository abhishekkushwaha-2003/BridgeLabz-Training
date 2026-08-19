package com.fundoonotes.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fundoonotes.entity.Note;
import com.fundoonotes.entity.User;
import com.fundoonotes.repository.NoteRepository;
import com.fundoonotes.repository.UserRepository;

@Service
public class NoteService {

    private final NoteRepository noteRepository;
    private final UserRepository userRepository;

    public NoteService(NoteRepository noteRepository, UserRepository userRepository) {
        this.noteRepository = noteRepository;
        this.userRepository = userRepository;
    }

    public Note createNote(int userId, String title, String content) {

        User owner = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        Note note = new Note();
        note.setTitle(title);
        note.setContent(content);
        note.setOwner(owner);

        return noteRepository.save(note);
    }

    public List<Note> findByOwner(int userId) {

        User owner = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        return noteRepository.findByOwner(owner);
    }

    public boolean deleteNote(int noteId, int requestingUserId) {

        User owner = userRepository.findById(requestingUserId)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        return noteRepository.findByNoteIdAndOwner(noteId, owner)
                .map(note -> {
                    noteRepository.delete(note);
                    return true;
                })
                .orElse(false);
    }
}