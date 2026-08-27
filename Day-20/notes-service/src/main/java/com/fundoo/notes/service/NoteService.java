package com.fundoo.notes.service;

import java.time.LocalDateTime;
import java.util.List;

import com.fundoo.notes.dto.request.NoteRequest;
import com.fundoo.notes.dto.response.NoteResponseDTO;
import com.fundoo.notes.entity.Note.NoteState;

public interface NoteService {

	NoteResponseDTO createNote(int userId, NoteRequest request);

	NoteResponseDTO updateNote(int noteId, int userId, NoteRequest request);

	List<NoteResponseDTO> getNotes(int userId, String state, Boolean pinned, String tag);

	boolean deleteNote(int noteId, int userId);

	NoteResponseDTO archiveNote(int noteId, int userId);

	NoteResponseDTO trashNote(int noteId, int userId);

	NoteResponseDTO restoreNote(int noteId, int userId);

	NoteResponseDTO pinNote(int noteId, int userId);

	NoteResponseDTO unpinNote(int noteId, int userId);

	NoteResponseDTO addTagToNote(int noteId, int userId, String tagName);

	List<NoteResponseDTO> searchNotes(int userId, String title, NoteState state, String tag);

	NoteResponseDTO setReminder(int noteId, int userId, LocalDateTime reminderAt);
}