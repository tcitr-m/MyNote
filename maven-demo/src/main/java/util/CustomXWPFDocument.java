package util;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author by PIG
 * 2022/7/1 17
 */
public class CustomXWPFDocument extends XWPFDocument {
	public CustomXWPFDocument(InputStream in) throws IOException {
		super(in);
	}

	public CustomXWPFDocument() {
		super();
	}

	public CustomXWPFDocument(OPCPackage pkg) throws IOException {
		super(pkg);
	}
}
