package com.fundoo.notes.specification;

import org.springframework.data.jpa.domain.Specification;

import com.fundoo.notes.entity.Note;
import com.fundoo.notes.entity.Note.NoteState;
import com.fundoo.notes.entity.Tag;

import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.Predicate;

public class NoteSpecifications {

	public static Specification<Note> search(int ownerId, String title, NoteState state, String tag) {

		return (root, query, criteriaBuilder) -> {

			Predicate predicate = criteriaBuilder.equal(root.get("ownerId"), ownerId);

			if (title != null && !title.isBlank()) {
				predicate = criteriaBuilder.and(predicate, criteriaBuilder
						.like(criteriaBuilder.lower(root.get("title")), "%" + title.toLowerCase() + "%"));
			}

			if (state != null) {
				predicate = criteriaBuilder.and(predicate, criteriaBuilder.equal(root.get("state"), state));
			}

			if (tag != null && !tag.isBlank()) {
				Join<Note, Tag> tagJoin = root.join("tags", JoinType.INNER);
				predicate = criteriaBuilder.and(predicate,
						criteriaBuilder.equal(criteriaBuilder.lower(tagJoin.get("name")), tag.toLowerCase()));
			}

			return predicate;
		};
	}
}