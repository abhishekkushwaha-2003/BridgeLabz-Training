package com.fundoo.export.service;

import java.io.ByteArrayOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.fundoo.export.client.NotesClient;
import com.fundoo.export.dto.NoteResponseDTO;

@Service
public class ExportService {

	private final NotesClient notesClient;

	public ExportService(NotesClient notesClient) {
		this.notesClient = notesClient;
	}

	public byte[] exportNotes(String authHeader) {

		try {
			List<NoteResponseDTO> notes = notesClient.getNotes(authHeader);

			Workbook workbook = new XSSFWorkbook();
			Sheet sheet = workbook.createSheet("Notes");

			Row header = sheet.createRow(0);
			header.createCell(0).setCellValue("Note ID");
			header.createCell(1).setCellValue("Title");
			header.createCell(2).setCellValue("Content");
			header.createCell(3).setCellValue("Created At");
			header.createCell(4).setCellValue("Reminder At");
			header.createCell(5).setCellValue("State");
			header.createCell(6).setCellValue("Pinned");
			header.createCell(7).setCellValue("Tags");

			int rowIndex = 1;

			for (NoteResponseDTO note : notes) {
				Row row = sheet.createRow(rowIndex++);

				row.createCell(0).setCellValue(note.getNoteId());
				row.createCell(1).setCellValue(note.getTitle());
				row.createCell(2).setCellValue(note.getContent());
				row.createCell(3).setCellValue(note.getCreatedAt() == null ? "" : note.getCreatedAt().toString());
				row.createCell(4).setCellValue(note.getReminderAt() == null ? "" : note.getReminderAt().toString());
				row.createCell(5).setCellValue(note.getState());
				row.createCell(6).setCellValue(note.isPinned() ? "Yes" : "No");
				row.createCell(7).setCellValue(note.getTags() == null ? "" : String.join(", ", note.getTags()));
			}

			for (int i = 0; i <= 7; i++) {
				sheet.autoSizeColumn(i);
			}

			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			workbook.write(outputStream);
			workbook.close();

			return outputStream.toByteArray();

		} catch (Exception e) {
			throw new RuntimeException("Failed to export notes: " + e.getMessage());
		}
	}
}