package com.fundoonotes.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import com.fundoonotes.dto.NoteImportRow;
import com.fundoonotes.entity.Note;

@Configuration
public class NoteImportJobConfig {

	@Bean
	public Step importNotesStep(JobRepository jobRepository, PlatformTransactionManager transactionManager,
			NoteExcelReader reader, NoteImportProcessor processor, NoteImportWriter writer) {

		return new StepBuilder("importNotesStep", jobRepository).<NoteImportRow, Note>chunk(100, transactionManager)
				.reader(reader).processor(processor).writer(writer).build();
	}

	@Bean
	public Job importNotesJob(JobRepository jobRepository, Step importNotesStep) {

		return new JobBuilder("importNotesJob", jobRepository).start(importNotesStep).build();
	}
}