package com.fundoonotes.specification;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;

import com.fundoonotes.entity.Note;
import com.fundoonotes.entity.Note.NoteState;
import com.fundoonotes.entity.User;

import jakarta.persistence.criteria.Predicate;

public class NoteSpecifications {

	public static Specification<Note> search(User owner, String title, NoteState state, String tagName) {
		return (root, query, criteriaBuilder) -> {

			List<Predicate> predicates = new ArrayList<>();

			predicates.add(criteriaBuilder.equal(root.get("owner"), owner));

			if (title != null && !title.isBlank()) {
				predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get("title")),
						"%" + title.toLowerCase() + "%"));
			}

			if (state != null) {
				predicates.add(criteriaBuilder.equal(root.get("state"), state));
			}

			if (tagName != null && !tagName.isBlank()) {
				predicates.add(criteriaBuilder.equal(root.join("tags").get("name"), tagName));
			}

			return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
		};
	}
}