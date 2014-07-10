package fan.core.util.demo.test;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import org.junit.Test;
import fan.core.util.FileUtil;
import fan.core.util.helper.Testing;

public class FileUtilTest {

	@Test
	public void copyFile(){
		InputStream in = FileUtil.getFileInputStream("src/main/test/resources/image.jpg");
		OutputStream out = FileUtil.getFileOutputStream("src/main/test/fan/core/util/test/img.jpg");
		// please press F5 to refresh fan.core.util.test
		FileUtil.copyFile(in, out);
	}
	
	@Test
	public void readFile(){
		String result = FileUtil.readFile("src/main/test/resources/user.data");
		Testing.printlnObject(result);
	}
	
	@Test
	public void readLineFile(){
		String[] lines = FileUtil.readLineFile("src/main/test/resources/user.data");
		Testing.printlnObject(lines);
	}
	
	@Test
	public void listFiles(){
		List<File> list = FileUtil.listFiles(new File("src/main/test"));
		Testing.printlnObject(list);
	}
	
	@Test
	public void listFiles_(){
		List<File> list = FileUtil.listFiles(new File("src/main/test"), ".java");
		Testing.printlnObject(list);
	}
	
	@Test
	public void createDir(){
		FileUtil.createDir("src/main/test/temp/tempdir");
	}
	
	@Test
	public void delete(){
		FileUtil.delete(new File("src/main/test/temp"));
	}
	
	@Test
	public void findFile(){
		File file = FileUtil.findFile("src/main/test", "FileUtilTest.java");
		Testing.printlnObject(file);
	}
}