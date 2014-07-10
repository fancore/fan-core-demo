package fan.core.util.demo.test;

import org.junit.Test;
import fan.core.util.RandomSeedUtil;
import fan.core.util.helper.Testing;
// Window --> Show View --> Outline
public class RandomSeedUtilTest {

	@Test
	public void intSeed(){
		Testing.printlnObject(RandomSeedUtil.intSeed(5));
		Testing.printlnObject(RandomSeedUtil.intSeed(2, 5));
	}

	@Test
	public void longSeed(){
		Testing.printlnObject(RandomSeedUtil.longSeed(5));
		Testing.printlnObject(RandomSeedUtil.longSeed(2, 5));
	}
	
	@Test
	public void floatSeed(){
		Testing.printlnObject(RandomSeedUtil.floatSeed(0.5f));
		Testing.printlnObject(RandomSeedUtil.floatSeed(0.2f, 0.5f));
	}
	
	@Test
	public void doubleSeed(){
		Testing.printlnObject(RandomSeedUtil.doubleSeed(0.5));
		Testing.printlnObject(RandomSeedUtil.doubleSeed(0.2, 0.5));
	}
	
	@Test
	public void boolSeed(){
		Testing.printlnObject(RandomSeedUtil.boolSeed());
	}
	
	@Test
	public void charSeed(){
		Testing.printlnObject(RandomSeedUtil.charSeed('0', '9'));
		Testing.printlnObject(RandomSeedUtil.charSeed('a', 'z'));
		Testing.printlnObject(RandomSeedUtil.charSeed('A', 'Z'));
	}
	
}