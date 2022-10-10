package jdk_api;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author by PIG
 * @date 2021/7/22 21
 */
public class MyTest {

	@Test
	public void test2(){
		String s = "a,b,c,d";
		String reduce = Arrays.stream(s.split(",")).reduce("", (prev, curr) -> {
			prev += String.format("'%s'", curr);
			prev += ",";
			return prev;
		});
		System.out.println("reduce = " + reduce);
	}

    @Test
    public void test(){
        File file = new File("F:\\Job\\亚信\\部署文件\\全网变更流程优化\\新建 Microsoft Word 文档.docx");
        System.out.println(file.length());
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            int available = fileInputStream.available();
            if (available == 0) {
                System.out.println("file empty");
            } else {
                byte[] by = new byte[1000];
                int len = fileInputStream.read(by);
                System.out.println(new String(by,0,len));
            }

            FileReader fileReader = new FileReader(file);
            int read = fileReader.read();
            System.out.println("read = " + read);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
