package com.fundoo.notes.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TagResponseDTO {

	private int tagId;
	private String name;
}