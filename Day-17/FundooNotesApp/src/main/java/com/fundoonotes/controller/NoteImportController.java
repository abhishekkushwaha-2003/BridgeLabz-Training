package com.fundoonotes.controller;

import java.util.Map;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteImportController {

	private final JobLauncher jobLauncher;
	private final Job importNotesJob;

	public NoteImportController(JobLauncher jobLauncher, Job importNotesJob) {
		this.jobLauncher = jobLauncher;
		this.importNotesJob = importNotesJob;
	}

	@PostMapping("/notes/import")
	public ResponseEntity<Map<String, String>> importNotes() throws Exception {

		JobParameters jobParameters = new JobParametersBuilder().addLong("startTime", System.currentTimeMillis())
				.toJobParameters();

		jobLauncher.run(importNotesJob, jobParameters);

		return ResponseEntity.ok(Map.of("message", "Notes import started"));
	}
}