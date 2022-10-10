package thirdPartJar;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.TemplateExportParams;
import entity.Actress;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author by PIG
 * 2022/7/8 10
 */
public class EasyPoiTest {

	private static String tmpPath = "F:\\Job\\神州良实\\部署\\telpment.xlsx";

	private static String outputPath = "F:\\Job\\神州良实\\部署";

	@Test
	public void test() throws IOException {
		Map<String, Object> map = new HashMap<>();

		ArrayList<Map<String, Object>> actressList = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			Map<String, Object> lm = new HashMap<>();
			lm.put("id", 1 + i);
			lm.put("name", "lily" + i);
			lm.put("birth", "1997-02-0" + i);
			lm.put("height", 151.5 + i);
			actressList.add(lm);
		}
		map.put("dataList", actressList);
		String titleName = "理想";
		map.put("titleName", titleName);

		TemplateExportParams params = new TemplateExportParams(tmpPath);
		Workbook workbook = ExcelExportUtil.exportExcel(params, map);

		File savefile = new File(outputPath);
		if (!savefile.exists()) {
			savefile.mkdirs();
		}

		FileOutputStream fos = new FileOutputStream(outputPath + "\\map.xlsx");
		workbook.write(fos);
		fos.close();
	}
}
