package fan.core.util.demo.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.Test;
import fan.core.util.MapUtil;
import fan.core.util.helper.Testing;
// Window --> Show View --> Outline
public class MapUtilTest {

	@Test
	public void isEmpty(){
		Map<String, Object> map1 = new HashMap<String, Object>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put(null, null);
		Testing.printlnObject(MapUtil.isEmpty(null));
		Testing.printlnObject(MapUtil.isEmpty(map1));
		Testing.printlnObject(MapUtil.isEmpty(map2));
	}
	
	@Test
	public void findKey(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		String key = MapUtil.findKey(map, "value2");
		Testing.printlnObject(key);
	}
	
	@Test
	public void reverseKeyValue(){
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("key1", "value1");
		map1.put("key2", "value2");
		map1.put("key3", "value3");
		Map<Object, String> map2 = MapUtil.reverseKeyValue(map1);
		Testing.printlnObject(map2);
	}
	
	@Test
	public void newMap(){
		Map<String, Set<List<Object>>> map = MapUtil.newMap();
		Testing.printlnObject(map);
	}
	
	@Test
	public void mapKeyAsList(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		List<String> keys = MapUtil.mapKeyAsList(map);
		Testing.printlnObject(keys);
	}
	
	@Test
	public void mapValueAsList(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		List<Object> values = MapUtil.mapValueAsList(map);
		Testing.printlnObject(values);
	}
	
}