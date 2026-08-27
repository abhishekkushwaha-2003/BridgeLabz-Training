package com.fundoo.notes.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fundoo.notes.entity.Tag;

public interface TagRepository extends JpaRepository<Tag, Integer> {

    Optional<Tag> findByNameAndOwnerId(String name, int ownerId);
}