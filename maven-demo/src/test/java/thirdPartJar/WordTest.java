package thirdPartJar;

import org.apache.poi.hssf.record.MergeCellsRecord;
import org.apache.poi.ooxml.POIXMLDocumentPart;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xwpf.usermodel.*;
import org.junit.Test;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDocument1;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTc;
import util.CustomXWPFDocument;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * @author by PIG
 * 2022/7/1 17
 */
public class WordTest {

	private static String filePath = "F:\\Job\\神州良实\\部署\\202213宝坻市级储备（小麦）包干轮换协议.docx";
	private static String outFile = "F:\\Job\\神州良实\\部署\\202213宝坻市级储备（小麦）包干轮换协议1.docx";

	@Test
	public void test() throws IOException {
		File wordFile = new File(filePath);
		FileInputStream inputStream = new FileInputStream(wordFile);
		CustomXWPFDocument doc = new CustomXWPFDocument(inputStream);
		List<XWPFEndnote> endnotes = doc.getEndnotes();
//		for (XWPFEndnote endnote : endnotes) {
//			endnote.getParagraphs();
//		}
		List<IBodyElement> bodyElements = doc.getBodyElements();
//		for (IBodyElement bodyElement : bodyElements) {
//			IBody body = bodyElement.getBody();
//		}

		XWPFTable xwpfTable = doc.getTableArray(0);
		List<XWPFTableRow> rows = xwpfTable.getRows();
		for (XWPFTableRow row : rows) {
			XWPFTableCell cell1 = row.getCell(1);
			CTTc ctTc = cell1.getCTTc();
			String cellText = cell1.getText();
			System.out.println(cellText);


		}

		CellRangeAddress cellAddresses = new CellRangeAddress(1,1,1,1);
//		MergeCellsRecord mergeCellsRecord = new MergeCellsRecord();

//		List<XWPFParagraph> paragraphs = doc.getParagraphs(); // 包含页眉页脚 文本段落
//		for (XWPFParagraph paragraph : paragraphs) {
//			String text = paragraph.getText();
//			System.out.println(text);
//		}
		CTDocument1 document = doc.getDocument();

//		File file = new File(outFile);
//		if (!file.exists()) {
//			System.out.println("文件");
//			boolean newFile = file.createNewFile();
//		}

//		FileOutputStream fos = new FileOutputStream(outFile);
//		doc.write(fos);
//		fos.close();
	}
}
