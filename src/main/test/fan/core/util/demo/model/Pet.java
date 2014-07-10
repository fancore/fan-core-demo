package fan.core.util.demo.model;

import fan.core.util.ClassUtil;
import fan.core.util.helper.Testing;

public class Pet <E> {
	
	public Pet(){
		Testing.printlnObject(toString());
		Class<?> clazz = ClassUtil.getSuperclassGenericType(this.getClass());
		Testing.printlnObject(clazz);
	}

	@Override
	public String toString() {
		return "I am not a pet!";
	}
	
}