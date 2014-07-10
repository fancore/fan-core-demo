package fan.core.util.demo.test;

import org.junit.Test;
import fan.core.util.demo.model.Foo;
import fan.core.util.ConvertUtil;
import fan.core.util.FieldUtil;
import fan.core.util.helper.Testing;
// Window --> Show View --> Outline
public class ConvertUtilTest {

	@Test
	public void objectValue_error(){
		String value = "10086";
		Foo foo = new Foo();
		// you can not do this
		// if you really do that, you will get a IllegalArgumentException: 
		// Can not set int field fan.core.test.model.Foo.bar to java.lang.String
		FieldUtil.setFieldValue(foo, "bar", value);
		Testing.printlnObject(foo);
	}

	@Test
	public void objectValue_corret(){
		String value = "10086";
		Foo foo = new Foo();
		// you should do it like this:
		Class<?> type = FieldUtil.getFieldType(foo, "bar");
		FieldUtil.setFieldValue(foo, "bar", ConvertUtil.objectValue(value, type));
		Testing.printlnObject(foo);
	}
}