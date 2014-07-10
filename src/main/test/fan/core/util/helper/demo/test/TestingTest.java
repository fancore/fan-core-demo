package fan.core.util.helper.demo.test;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.Test;
import fan.core.util.helper.Testing;
// Window --> Show View --> Outline
public class TestingTest {

	@Test
	public void list(){
		List<String> list = new ArrayList<String>();
		list.add("fan");
		list.add("core");
		list.add("util");
		list.add("helper");
		Testing.printObject(list);
		Testing.printlnObject(list);
	}
	
	@Test
	public void set(){
		Set<String> set = new HashSet<String>();
		set.add("fan");
		set.add("core");
		set.add("util");
		set.add("helper");
		Testing.printObject(set);
		Testing.printlnObject(set);
	}
	
	@Test
	public void map(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("author", "fancore");
		map.put("email", "fancore@126.com");
		Testing.printObject(map);
		Testing.printlnObject(map);
	}
	
	@Test
	public void array(){
		char[] chars = "fancore".toCharArray();
		Testing.printObject(chars);
		Testing.printlnObject(chars);
	}
	
	@Test
	public void openFile(){
		Testing.openFile(new File("src/main/test/resources/image.jpg"));
	}
}