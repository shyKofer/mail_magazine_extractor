/**
 * 
 */
package jp.co.abccooking.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import jp.co.abccooking.constant.HeaderColumn;

/**
 * @author sanghyun.yoo
 *
 */
public class PoiUtil {
	
	public Workbook createWorkbook() {
		return new HSSFWorkbook();
	}
	
	public Sheet createSheet(final Workbook wb, final String sheetName) {
		return  (Sheet) wb.createSheet(sheetName);
	}
	
	public Row createHeaderRow(final Sheet sheet) {
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue(HeaderColumn.MEMBER_NO.getColumnName());
		row.createCell(1).setCellValue(HeaderColumn.LAST_NAME_KANJI.getColumnName());
		row.createCell(2).setCellValue(HeaderColumn.FIRST_NAME_KANJI.getColumnName());
		row.createCell(3).setCellValue(HeaderColumn.LAST_NAME_KANA.getColumnName());
		row.createCell(4).setCellValue(HeaderColumn.FIRST_NAME_KANA.getColumnName());
		row.createCell(6).setCellValue(HeaderColumn.MAIL_ADDRESS.getColumnName());
		row.createCell(7).setCellValue(HeaderColumn.BIRTHDAY.getColumnName());
		row.createCell(8).setCellValue(HeaderColumn.STUDIO_NAME.getColumnName());
		return row;
	}

	public void writeExcelFile(final Workbook wb, final String fileDestination) {
		try  (final OutputStream fileOut = new FileOutputStream(fileDestination)) {
			wb.write(fileOut);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
