package com.fundoo.export.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fundoo.export.service.ExportService;

@RestController
@RequestMapping("/exports")
public class ExportController {

	private final ExportService exportService;

	public ExportController(ExportService exportService) {
		this.exportService = exportService;
	}

	@GetMapping("/notes")
	public ResponseEntity<byte[]> exportNotes(@RequestHeader("Authorization") String authHeader) {

		byte[] fileData = exportService.exportNotes(authHeader);

		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=notes-export.xlsx")
				.contentType(MediaType.APPLICATION_OCTET_STREAM).body(fileData);
	}
}