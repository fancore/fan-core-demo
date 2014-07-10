package fan.core.util.demo.test;

import java.lang.reflect.Field;
import java.util.List;
import org.junit.Test;
import fan.core.util.demo.model.Foobar;
import fan.core.util.FieldUtil;
import fan.core.util.helper.Testing;
// Window --> Show View --> Outline
public class FieldUtilTest {

	@Test
	public void setFieldValue(){
		FieldUtil.setFieldValue(Foobar.class, "version", 1.1);
		Foobar foobar = new Foobar();
		FieldUtil.setFieldValue(foobar, "bar", 1);
		FieldUtil.setFieldValue(foobar, "baz", "Hi there");
		Testing.printlnObject(foobar);
	}

	@Test
	public void getFieldValue(){
		FieldUtil.setFieldValue(Foobar.class, "version", 1.1);
		Foobar foobar = new Foobar();
		FieldUtil.setFieldValue(foobar, "baz", "Hi there");
		double version = FieldUtil.getFieldValue(Foobar.class, "version");
		String baz = FieldUtil.getFieldValue(foobar, "baz");
		Testing.printlnObject(version);
		Testing.printlnObject(baz);
	}
	
	@Test
	public void getAccessibleField(){
		Field versionField = FieldUtil.getAccessibleField(Foobar.class, "version");
		Foobar foobar = new Foobar();
		Field barField = FieldUtil.getAccessibleField(foobar, "bar");
		// you do not need to create a instance, in fact.
		Field bazField = FieldUtil.getAccessibleField(Foobar.class, "baz");
		Testing.printlnObject(versionField);
		Testing.printlnObject(barField);
		Testing.printlnObject(bazField);
	}
	
	@Test
	public void getFieldType(){
		Class<?> versionType = FieldUtil.getFieldType(Foobar.class, "version");
		Foobar foobar = new Foobar();
		Class<?>  barType = FieldUtil.getFieldType(foobar, "bar");
		// you do not need to create a instance, in fact.
		Class<?>  bazType = FieldUtil.getFieldType(Foobar.class, "baz");
		Testing.printlnObject(versionType);
		Testing.printlnObject(barType);
		Testing.printlnObject(bazType);
	}
	
	@Test
	public void getDeclaredFields(){
		List<Field> fields = FieldUtil.getDeclaredFields(Foobar.class);
		Testing.printlnObject(fields);
	}
	
	@Test
	public void getDeclaredFieldNames(){
		List<String> fieldNames = FieldUtil.getDeclaredFieldNames(Foobar.class);
		Testing.printlnObject(fieldNames);
	}
	
	@Test
	public void getAllFields(){
		List<Field> fields = FieldUtil.getAllFields(Foobar.class);
		// Object have no field
		Testing.printlnObject(fields);
	}
	
	@Test
	public void getAllFieldNames(){
		List<String> fieldNames = FieldUtil.getAllFieldNames(Foobar.class);
		// Object have no field
		Testing.printlnObject(fieldNames);
	}
	
}