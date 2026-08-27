package com.fundoo.notes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.fundoo.notes.entity.Note;
import com.fundoo.notes.entity.Note.NoteState;

public interface NoteRepository extends JpaRepository<Note, Integer>, JpaSpecificationExecutor<Note> {

	List<Note> findByOwnerId(int ownerId);

	Optional<Note> findByNoteIdAndOwnerId(int noteId, int ownerId);

	List<Note> findByOwnerIdAndState(int ownerId, NoteState state);

	List<Note> findByOwnerIdAndPinnedTrueAndStateNot(int ownerId, NoteState state);

	List<Note> findByOwnerIdAndTagsName(int ownerId, String tagName);
}