package com.fundoonotes.mapper;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.fundoonotes.dto.response.NoteResponseDTO;
import com.fundoonotes.dto.response.TagResponseDTO;
import com.fundoonotes.entity.Note;
import com.fundoonotes.entity.Tag;

@Component
public class NoteMapper {

    public NoteResponseDTO toResponseDTO(Note note) {
        return new NoteResponseDTO(
                note.getNoteId(),
                note.getTitle(),
                note.getContent(),
                note.getCreatedAt(),
                note.getState(),
                note.isPinned(),
                mapTags(note.getTags())
        );
    }

    private Set<TagResponseDTO> mapTags(Set<Tag> tags) {
        return tags.stream()
                .map(tag -> new TagResponseDTO(tag.getTagId(), tag.getName()))
                .collect(Collectors.toSet());
    }
}