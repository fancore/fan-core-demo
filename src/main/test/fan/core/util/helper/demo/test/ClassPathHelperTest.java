package fan.core.util.helper.demo.test;

import java.io.File;
import org.junit.Test;
import fan.core.util.helper.ClassPathHelper;
import fan.core.util.helper.Testing;

public class ClassPathHelperTest {

	@Test
	public void getClassPathFile(){
		File result = ClassPathHelper.getClassPathFile("ClassPathHelperTest.class");
		Testing.printlnObject(result);
	}
	
}