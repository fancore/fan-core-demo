package fan.core.util.demo.test;

import java.lang.reflect.Method;
import java.util.List;
import org.junit.Test;
import fan.core.util.demo.model.Bar;
import fan.core.util.MethodUtil;
import fan.core.util.helper.Testing;
// Window --> Show View --> Outline
public class MethodUtilTest {

	@Test
	public void invokeSetterMethod(){
		MethodUtil.invokeSetterMethod(Bar.class, "var", 1.1);
		Bar bar = new Bar("Hi there");
		MethodUtil.invokeSetterMethod(bar, "baz", 1);
		Testing.printlnObject(bar);
	}
	
	@Test
	public void invokeGetterMethod(){
		double var = MethodUtil.invokeGetterMethod(Bar.class, "var");
		Bar bar = new Bar("Hi there");
		int baz = MethodUtil.invokeGetterMethod(bar, "baz");
		Testing.printlnObject(var);
		Testing.printlnObject(baz);
	}
	
	@Test
	public void invokeConstructor_object_type(){
		// success
		Bar bar1 = MethodUtil.invokeConstructor(Bar.class, "Hi there");
		// fail, if you really do that, you will get a NoShcuMethodException
		Bar bar2 = MethodUtil.invokeConstructor(Bar.class, 13800, "Hi there");
		Testing.printlnObject(bar1);
		Testing.printlnObject(bar2);
	}
	
	@Test
	public void invokeConstructor_defined_type(){
		Object[] args = {13800, "Hi there"};
		Class<?>[] types = {int.class, String.class};
		Bar bar = MethodUtil.invokeConstructor(Bar.class, args, types);
		Testing.printlnObject(bar);
	}
	
	@Test
	public void invokeMethod_object_type(){
		double var = MethodUtil.invokeMethod(Bar.class, "getVar");
		Testing.printlnObject(var);
		Bar bar = new Bar("Hi there");
		// success
		MethodUtil.invokeMethod(bar, "setQux", "one piece");
		// fail, if you really do that, you will get a NoShcuMethodException
		MethodUtil.invokeMethod(bar, "setBaz", 10086);
		Testing.printlnObject(bar);
	}
	
	@Test
	public void invokeMethod_defined_type(){
		Bar bar = new Bar("Hi there");
		Object[] args = {10086};
		Class<?>[] types = {int.class};
		MethodUtil.invokeMethod(bar, "setBaz", args, types);
		Testing.printlnObject(bar);
	}
	
	@Test
	public void getAccessibleMethod(){
		Method setVarMethod = MethodUtil.getAccessibleMethod(Bar.class, "setVar", double.class);
		Bar bar = new Bar();
		Method setBazMethod1 = MethodUtil.getAccessibleMethod(bar, "setBaz", int.class);
		// you do not need to create a instance, in fact.
		Method setBazMethod2 = MethodUtil.getAccessibleMethod(Bar.class, "setBaz", int.class);
		Testing.printlnObject(setVarMethod);
		Testing.printlnObject(setBazMethod1);
		Testing.printlnObject(setBazMethod2);
	}
	
	@Test
	public void getDeclaredMethods(){
		List<Method> methods = MethodUtil.getDeclaredMethods(Bar.class);
		Testing.printlnObject(methods);
	}
	
	@Test
	public void getDeclaredMethodNames(){
		List<String> methodNames = MethodUtil.getDeclaredMethodNames(Bar.class);
		Testing.printlnObject(methodNames);
	}
	
	@Test
	public void getAllMethods(){
		List<Method> methods = MethodUtil.getAllMethods(Bar.class);
		Testing.printlnObject(methods);
	}
	
	@Test
	public void getAllMethodNames(){
		List<String> methodNames = MethodUtil.getAllMethodNames(Bar.class);
		Testing.printlnObject(methodNames);
	}
	
}