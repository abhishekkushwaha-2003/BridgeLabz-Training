package com.fundoonotes.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tags")
@Data
@NoArgsConstructor
public class Tag {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tagId;

	@Column(nullable = false, unique = true)
	private String name;

	public Tag(String name) {
		this.name = name;
	}
}