package fan.core.util.demo.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import fan.core.util.ArrayUtil;
import fan.core.util.helper.Testing;
// Window --> Show View --> Outline
public class ArrayUtilTest {

	@Test
	public void asArray_variableArgs(){
		String[] strings;
		strings = ArrayUtil.asArray("fan", "core", "util");
		Testing.printObject(strings);
	}

	@Test
	public void asArray_collection(){
		List<String> list = new ArrayList<String>();
		list.add("fancore");
		list.add("util");
		String[] strings = ArrayUtil.asArray(list);
		Testing.printObject(strings);
	}
	
	@Test
	public void contains_e(){
		String[] strings = {"fan", "core", "util"};
		Testing.printlnObject(ArrayUtil.contains(strings, "core"));
		Testing.printlnObject(ArrayUtil.contains(strings, "fancore"));
		Testing.printlnObject(ArrayUtil.contains(strings, null));
		Testing.printlnObject(ArrayUtil.contains(null, "fancore"));
	}
	
	@Test
	public void contains_char(){
		char[] ch = {'a', 'b', 'd'};
		Testing.printlnObject(ArrayUtil.contains(ch, 'a'));
		Testing.printlnObject(ArrayUtil.contains(ch, 'c'));
	}
	
	@Test
	public void getArrayElementType(){
		Object[] objects = new Object[2];
		String[] strings = {"fan", "core", "util"};
		Testing.printlnObject(ArrayUtil.getArrayElementType(null));
		Testing.printlnObject(ArrayUtil.getArrayElementType(strings));
		Testing.printlnObject(ArrayUtil.getArrayElementType(objects));
	}
	
	@Test
	public void toString_object(){
		Object[] objects = null;
		Double[] doubles = new Double[2];
		String[] strings = {"fan", "core", "util"};
		Testing.printlnObject(ArrayUtil.toString(objects));
		Testing.printlnObject(ArrayUtil.toString(doubles));
		Testing.printlnObject(ArrayUtil.toString(strings));
	}
	
	@Test
	public void toString_byte(){
		byte[] bytes1 = null;
		byte[] bytes2 = new byte[2];
		byte[] bytes3 = { 1, 2, 7 };
		Testing.printlnObject(ArrayUtil.toString(bytes1));
		Testing.printlnObject(ArrayUtil.toString(bytes2));
		Testing.printlnObject(ArrayUtil.toString(bytes3));
	}
	
	@Test
	public void toSimpleString_object(){
		Object[] objects = null;
		Double[] doubles = new Double[2];
		String[] strings = {"fan", "core", "util"};
		Testing.printlnObject(ArrayUtil.toSimpleString(objects));
		Testing.printlnObject(ArrayUtil.toSimpleString(doubles));
		Testing.printlnObject(ArrayUtil.toSimpleString(strings));
	}
	
	@Test
	public void toSimpleString_byte(){
		byte[] bytes1 = null;
		byte[] bytes2 = new byte[2];
		byte[] bytes3 = { 1, 2, 7 };
		Testing.printlnObject(ArrayUtil.toSimpleString(bytes1));
		Testing.printlnObject(ArrayUtil.toSimpleString(bytes2));
		Testing.printlnObject(ArrayUtil.toSimpleString(bytes3));
	}
}