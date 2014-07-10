package fan.core.util.demo.test;

import java.util.Calendar;
import java.util.Date;
import org.junit.Test;
import fan.core.util.DateUtil;
import fan.core.util.code.DateFormatCode;
import fan.core.util.helper.Testing;
// Window --> Show View --> Outline
public class DateUtilTest {
	
	@Test
	public void getCurrentDate(){
		Testing.printlnObject(DateUtil.getCurrentDate());
	}
	
	@Test
	public void getCurrentDateTime(){
		Testing.printlnObject(DateUtil.getCurrentDateTime());
	}
	
	@Test
	public void getCurrentDateString(){
		String date = DateUtil.getCurrentDateString(DateFormatCode.LONG_HYPHEN.toCode());
		Testing.printlnObject(date);
	}
	
	@Test
	public void formatDate(){
		String date = DateUtil.formatDate(new Date(), DateFormatCode.SHORT_HYPHEN.toCode());
		Testing.printlnObject(date);
	}
	
	@Test
	public void parseDate(){
		String dateString = "2014-05-20";
		Date date = DateUtil.parseDate(dateString, DateFormatCode.SHORT_HYPHEN.toCode());
		Testing.printlnObject(date);

	}
	
	@Test
	public void getDateModifyYear(){
		Date date1 = new Date();
		Date date2 = DateUtil.getDateModifyYear(date1, 1);
		Date date3 = DateUtil.getDateModifyYear(date1, -1);
		Testing.printlnObject(DateUtil.formatDate(date1, DateFormatCode.SHORT_HYPHEN.toCode()));
		Testing.printlnObject(DateUtil.formatDate(date2, DateFormatCode.SHORT_HYPHEN.toCode()));
		Testing.printlnObject(DateUtil.formatDate(date3, DateFormatCode.SHORT_HYPHEN.toCode()));
	}
	
	@Test
	public void getDateModifyMonth(){
		Date date1 = new Date();
		Date date2 = DateUtil.getDateModifyMonth(date1, 1);
		Date date3 = DateUtil.getDateModifyMonth(date1, -1);
		Testing.printlnObject(DateUtil.formatDate(date1, DateFormatCode.SHORT_HYPHEN.toCode()));
		Testing.printlnObject(DateUtil.formatDate(date2, DateFormatCode.SHORT_HYPHEN.toCode()));
		Testing.printlnObject(DateUtil.formatDate(date3, DateFormatCode.SHORT_HYPHEN.toCode()));
	}
	
	@Test
	public void getDateModifyDays(){
		Date date1 = new Date();
		Date date2 = DateUtil.getDateModifyDays(date1, 1);
		Date date3 = DateUtil.getDateModifyDays(date1, -1);
		Testing.printlnObject(DateUtil.formatDate(date1, DateFormatCode.SHORT_HYPHEN.toCode()));
		Testing.printlnObject(DateUtil.formatDate(date2, DateFormatCode.SHORT_HYPHEN.toCode()));
		Testing.printlnObject(DateUtil.formatDate(date3, DateFormatCode.SHORT_HYPHEN.toCode()));
	}
	
	@Test
	public void getDateModifyHour(){
		Date date1 = new Date();
		Date date2 = DateUtil.getDateModifyHour(date1, 1);
		Date date3 = DateUtil.getDateModifyHour(date1, -1);
		Testing.printlnObject(DateUtil.formatDate(date1, DateFormatCode.LONG_HYPHEN.toCode()));
		Testing.printlnObject(DateUtil.formatDate(date2, DateFormatCode.LONG_HYPHEN.toCode()));
		Testing.printlnObject(DateUtil.formatDate(date3, DateFormatCode.LONG_HYPHEN.toCode()));
	}
	
	@Test
	public void getDateModifyMinute(){
		Date date1 = new Date();
		Date date2 = DateUtil.getDateModifyMinute(date1, 1);
		Date date3 = DateUtil.getDateModifyMinute(date1, -1);
		Testing.printlnObject(DateUtil.formatDate(date1, DateFormatCode.LONG_HYPHEN.toCode()));
		Testing.printlnObject(DateUtil.formatDate(date2, DateFormatCode.LONG_HYPHEN.toCode()));
		Testing.printlnObject(DateUtil.formatDate(date3, DateFormatCode.LONG_HYPHEN.toCode()));
	}
	
	@Test
	public void getDateModifySecond(){
		Date date1 = new Date();
		Date date2 = DateUtil.getDateModifySecond(date1, 1);
		Date date3 = DateUtil.getDateModifySecond(date1, -1);
		Testing.printlnObject(DateUtil.formatDate(date1, DateFormatCode.LONG_HYPHEN.toCode()));
		Testing.printlnObject(DateUtil.formatDate(date2, DateFormatCode.LONG_HYPHEN.toCode()));
		Testing.printlnObject(DateUtil.formatDate(date3, DateFormatCode.LONG_HYPHEN.toCode()));
	}
	
	@Test
	public void getDateModifyMillisecond(){
		Date date1 = new Date();
		Date date2 = DateUtil.getDateModifyMillisecond(date1, 1);
		Date date3 = DateUtil.getDateModifyMillisecond(date1, -1);
		Testing.printlnObject(DateUtil.formatDate(date1, DateFormatCode.FULL_HYPHEN.toCode()));
		Testing.printlnObject(DateUtil.formatDate(date2, DateFormatCode.FULL_HYPHEN.toCode()));
		Testing.printlnObject(DateUtil.formatDate(date3, DateFormatCode.FULL_HYPHEN.toCode()));
	}
	
	@Test
	public void getCalendar(){
		Calendar calendar = DateUtil.getCalendar(new Date());
		Testing.printlnObject(calendar);
	}
	
	@Test
	public void getPattern(){
		String dateString1 = "2014-07-07";
		String dateString2 = "2014-07-07 21:12:34";
		String dateString3 = "2014年07月07日 21时12分34秒";
		Date date = DateUtil.parseDate(dateString3, DateUtil.getPattern(dateString3));
		Testing.printlnObject(DateUtil.getPattern(dateString1));
		Testing.printlnObject(DateUtil.getPattern(dateString2));
		Testing.printlnObject(DateUtil.getPattern(dateString3));
		Testing.printlnObject(date);
	}
}