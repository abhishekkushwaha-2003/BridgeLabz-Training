package com.fundoo.export.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fundoo.export.dto.NoteResponseDTO;

@Component
public class NotesClient {

	private final RestTemplate restTemplate;

	private static final String NOTES_SERVICE_URL = "http://notes-service/notes";

	public NotesClient(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public List<NoteResponseDTO> getNotes(String authHeader) {

		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", authHeader);

		HttpEntity<Void> entity = new HttpEntity<>(headers);

		ResponseEntity<NoteResponseDTO[]> response = restTemplate.exchange(NOTES_SERVICE_URL, HttpMethod.GET, entity,
				NoteResponseDTO[].class);

		return Arrays.asList(response.getBody());
	}
}