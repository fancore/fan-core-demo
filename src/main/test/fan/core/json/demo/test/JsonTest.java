package fan.core.json.demo.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.junit.BeforeClass;
import org.junit.Test;
import com.google.gson.reflect.TypeToken;
import fan.core.json.Json;
import fan.core.json.demo.model.Person;
import fan.core.util.ConvertUtil;
import fan.core.util.FileUtil;
import fan.core.util.MethodUtil;
import fan.core.util.code.DateFormatCode;
import fan.core.util.helper.Testing;
// Window --> Show View --> Outline
public class JsonTest {

	private static Person person;
	private static String[] jsons;
	private static final List<Person> persons = new ArrayList<Person>();
	
	// init data
	@BeforeClass
	public static void prepare(){
		jsons = FileUtil.readLineFile("src/main/test/resources/person.json");
		String[] lines = FileUtil.readLineFile("src/main/test/resources/person.data");
		Class<?>[] types = {String.class, String.class, String.class, Date.class};
		for(String line : lines){
			String[] datas = line.split("	");
			Object[] values = ConvertUtil.objectValues(datas, types);
			persons.add(MethodUtil.invokeConstructor(Person.class, values, types));
		}
		person = persons.get(0);
	}
	
	// simple
	@Test
	public void toJson(){
		String json = Json.getDefault().toJson("<p>Hi there</p>");
		Testing.printlnObject(json);
	}
	
	// pojo to json
	@Test
	public void toJson_eg1(){
		String json = Json.getDefault().toJson(person);
		Testing.printlnObject(json);
	}
	
	// pojos to json
	@Test
	public void toJson_eg2(){
		String json = Json.getDefault().toJson(persons);
		Testing.printlnObject(json);
	}
	
	// key & value to json
	@Test
	public void toJson_eg3(){
		String json = Json.getDefault().toJson("person", person);
		Testing.printlnObject(json);
	}
	
	// key & values to json
	@Test
	public void toJson_eg4(){
		String json = Json.getDefault().toJson("persons", persons);
		Testing.printlnObject(json);
	}
	
	// date format pattern 
	@Test
	public void toJson_eg5(){
		String pattern = DateFormatCode.SHORT_VIRGULE.toCode();
		String json = Json.getDefault().setDateFormat(pattern).toJson(person);
		Testing.printlnObject(json);
	}
	
	// skip fields
	@Test
	public void toJson_eg6(){
		String json = Json.getDefault().setExclusions("sex").toJson(person);
		Testing.printlnObject(json);
	}
	
	// skip types
	@Test
	public void toJson_eg7(){
		String json = Json.getDefault().setExclusions(String.class).toJson(person);
		Testing.printlnObject(json);
	}
	
	// json to pojo
	@Test
	public void fromJson_eg1(){
		String json = jsons[0];
		Person person = Json.getDefault().fromJson(json, Person.class);
		Testing.printlnObject(json);
		Testing.printlnObject(person);
	}
	
	// json to pojo list
	@Test
	public void fromJson_eg2(){
		String json = jsons[1];
		List<Person> person = Json.getDefault().fromJson(json, new TypeToken<List<Person>>(){});
		Testing.printlnObject(json);
		Testing.printlnObject(person);
	}
	
	// json to pojo map
	@Test
	public void fromJson_eg3(){
		String json = jsons[2];
		Map<String, List<Person>> map = Json.getDefault().fromJson(json, new TypeToken<Map<String, List<Person>>>(){});
		Testing.printlnObject(json);
		Testing.printlnObject(map.get("persons"));
	}
	
	// skip
	@Test
	public void fromJson_eg4(){
		String json = jsons[0];
		Person person = Json.getDefault().setExclusions("sex").fromJson(json, Person.class);
		Testing.printlnObject(json);
		Testing.printlnObject(person);
	}
	
}