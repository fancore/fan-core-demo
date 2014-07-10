package fan.core.util.demo.test;

import java.util.List;
import org.junit.Test;
import fan.core.util.demo.model.Animal;
import fan.core.util.demo.model.Parrot;
import fan.core.util.demo.model.Tiger;
import fan.core.util.ClassUtil;
import fan.core.util.helper.Testing;
// Window --> Show View --> Outline
public class ClassUtilTest {

	@Test
	public void getInstance(){
		Animal animal = ClassUtil.getInstance(Animal.class);
		Testing.printlnObject(animal);
	}
	
	@Test
	public void forName(){
		Class<?> animalClass = ClassUtil.forName("fan.core.test.model.Animal");
		Testing.printlnObject(animalClass);
	}
	
	@Test
	public void isInstanceOf_object_class(){
		Tiger tiger = new Tiger();
		Animal animal = new Animal();
		Testing.printlnObject(ClassUtil.isInstanceOf(tiger, Tiger.class));
		Testing.printlnObject(ClassUtil.isInstanceOf(tiger, Animal.class));
		Testing.printlnObject(ClassUtil.isInstanceOf(animal, Animal.class));
		Testing.printlnObject(ClassUtil.isInstanceOf(animal, Tiger.class));
		Testing.printlnObject(ClassUtil.isInstanceOf(10086, int.class));
		Testing.printlnObject(ClassUtil.isInstanceOf(10086, Integer.class));
	}
	
	@Test
	public void isInstanceOf_class_class(){
		Testing.printlnObject(ClassUtil.isInstanceOf(Tiger.class, Tiger.class));
		Testing.printlnObject(ClassUtil.isInstanceOf(Tiger.class, Animal.class));
		Testing.printlnObject(ClassUtil.isInstanceOf(Animal.class, Tiger.class));
		Testing.printlnObject(ClassUtil.isInstanceOf(String.class, Object.class));
		Testing.printlnObject(ClassUtil.isInstanceOf(Object.class, String.class));
	}
	
	@Test
	public void getSuperclassGenericType(){
		new Parrot();
	}
	
	@Test
	public void getSuperclasses(){
		List<Class<?>> superClasses = ClassUtil.getSuperclasses(Tiger.class);
		Testing.printlnObject(superClasses);
	}
	
	@Test
	public void getObjectTypes(){
		Object o1 = "";
		Object o2 = 2;
		Object o3 = false;
		Object o4 = "".getBytes();
		Testing.printlnObject(ClassUtil.getObjectTypes(o1, o2, o3, o4));
	}
	
	@Test
	public void getSimpleClassName(){
		Testing.printlnObject(ClassUtil.getSimpleClassName(Animal.class));
		Testing.printlnObject(ClassUtil.getSimpleClassName(new Animal()));
	}
	
}