package fan.core.util.helper.demo.test;

import org.junit.Test;
import fan.core.util.code.SystemCode;
import fan.core.util.helper.SystemHelper;
import fan.core.util.helper.Testing;
// Window --> Show View --> Outline
public class SystemHelperTest {

	@Test
	public void getSystemFileEncoding(){
		Testing.printlnObject(SystemHelper.getSystemFileEncoding());
	}
	
	@Test
	public void getClassPathDir(){
		Testing.printlnObject(SystemHelper.getClassPathDir());
	}
	
	@Test
	public void getProjectDir(){
		Testing.printlnObject(SystemHelper.getProjectDir());
	}
	
	@Test
	public void getProperty(){
		Testing.printlnObject(SystemHelper.getProperty(SystemCode.OS_NAME));
	}
	
}