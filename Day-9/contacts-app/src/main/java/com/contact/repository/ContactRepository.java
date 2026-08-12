package com.contact.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contact.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    List<Contact> findByFavouriteTrue();

}