package com.fundoonotes.service;

import java.io.ByteArrayOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.springframework.stereotype.Service;

import com.fundoonotes.entity.Note;

@Service
public class NoteExportService {

	public byte[] exportToExcel(List<Note> notes) throws Exception {

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("My Notes");

		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("Note Id");
		header.createCell(1).setCellValue("Title");
		header.createCell(2).setCellValue("Content");
		header.createCell(3).setCellValue("State");
		header.createCell(4).setCellValue("Pinned");
		header.createCell(5).setCellValue("Created At");
		header.createCell(6).setCellValue("Reminder At");

		int rowNum = 1;

		for (Note note : notes) {
			Row row = sheet.createRow(rowNum++);

			row.createCell(0).setCellValue(note.getNoteId());
			row.createCell(1).setCellValue(note.getTitle());
			row.createCell(2).setCellValue(note.getContent());
			row.createCell(3).setCellValue(note.getState().toString());
			row.createCell(4).setCellValue(note.isPinned());
			row.createCell(5).setCellValue(note.getCreatedAt() != null ? note.getCreatedAt().toString() : "");
			row.createCell(6).setCellValue(note.getReminderAt() != null ? note.getReminderAt().toString() : "");
		}

		for (int i = 0; i <= 6; i++) {
			sheet.autoSizeColumn(i);
		}

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		workbook.write(outputStream);
		workbook.close();

		return outputStream.toByteArray();
	}
}