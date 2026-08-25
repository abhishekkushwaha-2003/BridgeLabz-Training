package com.fundoonotes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.fundoonotes.entity.Note;
import com.fundoonotes.entity.User;
import com.fundoonotes.entity.Note.NoteState;

@Repository
public interface NoteRepository extends JpaRepository<Note, Integer>, JpaSpecificationExecutor<Note> {

	List<Note> findByOwner(User owner);

	Optional<Note> findByNoteIdAndOwner(int noteId, User owner);

	List<Note> findByOwnerAndState(User owner, NoteState state);

	List<Note> findByOwnerAndPinnedTrueAndStateNot(User owner, NoteState state);

	List<Note> findByOwnerAndTagsName(User owner, String tagName);
}