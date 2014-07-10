package fan.core.util.demo.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.BeforeClass;
import org.junit.Test;
import fan.core.util.demo.model.User;
import fan.core.util.CollectionUtil;
import fan.core.util.ConvertUtil;
import fan.core.util.FileUtil;
import fan.core.util.MethodUtil;
import fan.core.util.helper.Testing;
// Window --> Show View --> Outline
public class CollectionUtilTest {

	@Test
	public void isEmpty(){
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		list2.add(null);
		Testing.printlnObject(CollectionUtil.isEmpty(null));
		Testing.printlnObject(CollectionUtil.isEmpty(list1));
		Testing.printlnObject(CollectionUtil.isEmpty(list2));
	}
	
	@Test
	public void toArray(){
		List<String> list = new ArrayList<String>();
		list.add("fancore");
		list.add("util");
		String[] strings = CollectionUtil.toArray(list);
		Testing.printObject(strings);
	}
	
	@Test
	public void asList_e(){
		List<String> list = CollectionUtil.asList("fan", "core", "util", "fan");
		Testing.printlnObject(list);
	}
	
	@Test
	public void asList_collection(){
		Set<String> set = new HashSet<String>();
		set.add("fan");
		set.add("core");
		set.add("util");
		List<String> list = CollectionUtil.asList(set);
		Testing.printlnObject(list);
	}
	
	@Test
	public void asSet_e(){
		Set<String> set = CollectionUtil.asSet("fan", "core", "util", "fan");
		Testing.printlnObject(set);
	}
	
	@Test
	public void asSet_collection(){
		List<String> list = new ArrayList<String>();
		list.add("fan");
		list.add("core");
		list.add("util");
		list.add("fan");
		Set<String> set = CollectionUtil.asSet(list);
		Testing.printlnObject(set);
	}
	
	@Test
	public void newList(){
		List<Map<String, Set<Object>>> list = CollectionUtil.newList();
		Testing.printlnObject(list);
	}
	
	private static final List<User> users = new ArrayList<User>();
	
	@BeforeClass
	public static void prepare(){
		String[] lines = FileUtil.readLineFile("src/main/test/resources/user.data");
		Class<?>[] types = {int.class, String.class, String.class, boolean.class, Date.class};
		for(String line : lines){
			String[] datas = line.split("	");
			Object[] values = ConvertUtil.objectValues(datas, types);
			users.add(MethodUtil.invokeConstructor(User.class, values, types));
		}
	}
	
	@Test
	public void sortByAsc(){
		Testing.printlnObject("------ origin ------");
		Testing.printlnObject(users);
		Testing.printlnObject("------ sorted ------");
		CollectionUtil.sortByAsc(users, "id");
//		CollectionUtil.sortByAsc(users, "sex");
//		CollectionUtil.sortByAsc(users, "name");
//		CollectionUtil.sortByAsc(users, "valid");
//		CollectionUtil.sortByAsc(users, "registerTime");
		Testing.printlnObject(users);
	}
	
	@Test
	public void sortByDesc(){
		Testing.printlnObject("------ origin ------");
		Testing.printlnObject(users);
		Testing.printlnObject("------ sorted ------");
		CollectionUtil.sortByDesc(users, "id");
//		CollectionUtil.sortByDesc(users, "sex");
//		CollectionUtil.sortByDesc(users, "name");
//		CollectionUtil.sortByDesc(users, "valid");
//		CollectionUtil.sortByDesc(users, "registerTime");
		Testing.printlnObject(users);
	}
}