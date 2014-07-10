package fan.core.util.demo.test;

import org.junit.Test;
import fan.core.util.StringUtil;
import fan.core.util.code.EncodingCode;
import fan.core.util.helper.Testing;
// Window --> Show View --> Outline
public class StringUtilTest {

	@Test
	public void isEmpty(){
		Testing.printlnObject(StringUtil.isEmpty(""));
		Testing.printlnObject(StringUtil.isEmpty(null));
		Testing.printlnObject(StringUtil.isEmpty(" "));
	}
	
	@Test
	public void substring(){
		String source = "An explorer is a friend to all, be it plants or fish or tiny mole.";
		Testing.printlnObject(StringUtil.substring(source, 3));
		Testing.printlnObject(StringUtil.substring(source, -10));
		Testing.printlnObject(StringUtil.substring(source, 3, -10));
		Testing.printlnObject(StringUtil.substring(source, -5, -1));
	}
	
	@Test
	public void substringBefore(){
		String source = "An explorer is a friend to all, be it plants or fish or tiny mole.";
		Testing.printlnObject(StringUtil.substringBefore(source, " or "));
	}
	
	@Test
	public void substringBeforeWith(){
		String source = "An explorer is a friend to all, be it plants or fish or tiny mole.";
		Testing.printlnObject(StringUtil.substringBeforeWith(source, " or "));
	}
	
	@Test
	public void substringBeforeLast(){
		String source = "An explorer is a friend to all, be it plants or fish or tiny mole.";
		Testing.printlnObject(StringUtil.substringBeforeLast(source, " or "));
	}
	
	@Test
	public void substringBeforeLastWith(){
		String source = "An explorer is a friend to all, be it plants or fish or tiny mole.";
		Testing.printlnObject(StringUtil.substringBeforeLastWith(source, " or "));
	}
	
	@Test
	public void substringAfter(){
		String source = "An explorer is a friend to all, be it plants or fish or tiny mole.";
		Testing.printlnObject(StringUtil.substringAfter(source, " or "));
	}
	
	@Test
	public void substringAfterWith(){
		String source = "An explorer is a friend to all, be it plants or fish or tiny mole.";
		Testing.printlnObject(StringUtil.substringAfterWith(source, " or "));
	}
	
	@Test
	public void substringAfterLast(){
		String source = "An explorer is a friend to all, be it plants or fish or tiny mole.";
		Testing.printlnObject(StringUtil.substringAfterLast(source, " or "));
	}
	
	@Test
	public void substringAfterLastWith(){
		String source = "An explorer is a friend to all, be it plants or fish or tiny mole.";
		Testing.printlnObject(StringUtil.substringAfterLastWith(source, " or "));
	}
	
	@Test
	public void toFirstLetterUpperCase(){
		String source = "when the sun shines we shine together";
		Testing.printlnObject(StringUtil.toFirstLetterUpperCase(source));
	}
	
	@Test
	public void getBytes(){
		String source = "An explorer is a friend to all, be it plants or fish or tiny mole.";
		Testing.printlnObject(StringUtil.getBytes(source, EncodingCode.UTF_8.toCode()));
	}
	
	@Test
	public void getBytes_(){
		String source = "An explorer is a friend to all, be it plants or fish or tiny mole.";
		Testing.printlnObject(StringUtil.getBytesISO1(source));
		Testing.printlnObject(StringUtil.getBytesUTF8(source));
		Testing.printlnObject(StringUtil.getBytesGBK(source));
		Testing.printlnObject(StringUtil.getBytesGB2312(source));
		Testing.printlnObject(StringUtil.getBytesASCII(source));
	}
	
	@Test
	public void getString(){
		byte[] bytes = {-28, -69, -118, -27, -92, -87, -28, -67, -96, -27, -66, -82, -25, -84, -111, -28, -70, -122, -27, -112, -105, -17, -68, -97};
		Testing.printlnObject(StringUtil.getString(bytes, EncodingCode.UTF_8.toCode()));
		Testing.printlnObject(StringUtil.getStringGB2312(bytes));
		Testing.printlnObject(StringUtil.getStringGBK(bytes));
		Testing.printlnObject(StringUtil.getStringISO1(bytes));
		Testing.printlnObject(StringUtil.getStringUTF8(bytes));
	}
	
	@Test
	public void parsePlaceholder(){
		String result = StringUtil.parsePlaceholder("email: ?", "fancore@126.com");
		Testing.printlnObject(result);
		result = StringUtil.parsePlaceholder("id(?, ?, ?, ?)", "fancy", "fancydeepin", "fancore", "fan");
		Testing.printlnObject(result);
		result = StringUtil.parsePlaceholder("id(?, ?, ?)", "fancy", "fancydeepin", "fancore", "fan");
		Testing.printlnObject(result);
		result = StringUtil.parsePlaceholder("id(?, ?, ?, ?)", "fancy", "fancydeepin", "fancore");
		Testing.printlnObject(result);
	}
	
	@Test
	public void convertUpperCaseLetter(){
		Testing.printlnObject(StringUtil.convertUpperCaseLetter("personInfo", "-"));
	}
	
}