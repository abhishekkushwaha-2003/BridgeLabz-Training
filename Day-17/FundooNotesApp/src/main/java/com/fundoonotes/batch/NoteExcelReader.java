package com.fundoonotes.batch;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.springframework.batch.item.ItemReader;
import org.springframework.stereotype.Component;

import com.fundoonotes.dto.NoteImportRow;

@Component
public class NoteExcelReader implements ItemReader<NoteImportRow> {

	private Iterator<Row> rowIterator;
	private boolean initialized = false;
	private Workbook workbook;

	private void init() throws Exception {
		FileInputStream fileInputStream = new FileInputStream("notes-import.xlsx");

		workbook = new XSSFWorkbook(fileInputStream);

		Sheet sheet = workbook.getSheetAt(0);
		rowIterator = sheet.iterator();

		if (rowIterator.hasNext()) {
			rowIterator.next(); // skip header row
		}

		initialized = true;
	}

	@Override
	public NoteImportRow read() throws Exception {

		if (!initialized) {
			init();
		}

		if (!rowIterator.hasNext()) {
			workbook.close();
			return null;
		}

		Row row = rowIterator.next();

		NoteImportRow item = new NoteImportRow();

		item.setTitle(row.getCell(0).getStringCellValue());
		item.setContent(row.getCell(1).getStringCellValue());
		item.setUserId((int) row.getCell(2).getNumericCellValue());

		return item;
	}
}