import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
//import java.util.*;
//import java.util

public class DateTest {

	public static void main(String[] args) {
//		dateMethodTest();
//		threadSleepTest();
//		programRuningTime();
		calendarMethodTest();
	}
	
	/**
	* Date class method test
	* 
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public static void dateMethodTest() {
		Date date1 = new Date(); // 用当前时间初始化一个对象
		Date date2 = new Date(123456); //时间戳:该参数是从 1970 年 1 月 1 日起的毫秒数
		
		print("after:" + date1.after(date2));
		print("before:" + date1.before(date2));
		
		date2 = (Date)date1.clone(); // return is Object type
		print("clone:" + date2.toString());

		print("compareTo:" + date1.compareTo(date2));
		//int compareTo(Object obj)
		//若obj是Date类型则操作等同于compareTo(Date) 。否则它抛出ClassCastException。
		
		print("equals:" + date1.equals(date2)); //指定日期相等时候返回true
		
		print("getTime:" + date1.getTime()); //时间戳:返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数
		date1.setTime(123456); //设置时间戳,自1970年1月1日00:00:00 GMT以后time毫秒数设置时间和日期
		
		print("hashCode:" + date1.hashCode());
		
		//yyyy 是完整的公元年
		//MM 是月份
		//dd 是日期
		//HH:mm:ss 是时、分、秒ss
		// https://www.runoob.com/java/java-date-time.html
		//有的格式大写，有的格式小写，例如 MM 是月份，mm 是分；HH 是 24 小时制，而 hh 是 12 小时制
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		print("time:" + fmt.format(date1));
		
		// 使用 printf() 也可以按照指定格式输出日期
		//%tY：输出四位数的年份，例如：2023
		//%tm：输出两位数的月份，例如：02
		//%td：输出两位数的日期，例如：24
		//%tH：输出24小时制的小时数，例如：23
		//%tM：输出分钟数，例如：45
		//%tS：输出秒数，例如：30
		//%tZ：输出时区，例如：GMT+08:00
		System.out.printf("%tY-%tm-%td %tH:%tM:%tS %tZ\n", date1, date1, date1, date1, date1, date1, date1);
		System.out.printf("%tc\n", date1);
		
		//参数简化写法
		//可以利用一个格式化字符串指出要被格式化的参数的索引。索引必须紧跟在 % 后面，而且必须以 $ 结束。例如：
		System.out.printf("%1$s %2$tB %2$td, %2$tY\n", "Date:", date1);
		//或者，你可以使用 < 标志。它表明先前被格式化的参数要被再次使用。
		System.out.printf("%s %tB %<te, %<tY\n", "Date:", date1);
		
		//定义日期格式的转换符可以使日期通过指定的转换符生成新字符串
		//https://www.runoob.com/java/java-date-time.html
		String dateStr = String.format(Locale.US, "英文月份简称:%tb", date1);
		print("dateStr:" + dateStr);
		dateStr = String.format(Locale.US, "英文月份全称:%tB", date1);
		print("dateStr:" + dateStr);	
		
		//SimpleDateFormat 类有一些附加的方法，特别是parse()，
		//它试图按照给定的SimpleDateFormat 对象的格式化存储来解析字符串。
		try {
			SimpleDateFormat dateFmt = new SimpleDateFormat("yyyy-MM-dd");
			Date newDate = dateFmt.parse("2023-12-08");
			print("parse result:" + newDate.toString());
		} catch (ParseException e) {
			print("exception" + e.toString());
		}
		
	}

	/**
	* thread sleep test
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public static void threadSleepTest() {
		try {
			print("delay 3s..." + new Date().toString());
			Thread.sleep(3 * 1000); // 3000ms
			print(new Date().toString());
		} catch (Exception e) {
			print(e.toString());
		}
	}

	/**
	* 下面的一个例子表明如何测量时间间隔（以毫秒为单位）：
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public static void programRuningTime() {
		try {
			long start = System.currentTimeMillis();
			Thread.sleep(3000);
			long end = System.currentTimeMillis();
			long diff = end - start;
			print("run time usage:" + diff + "ms");
		} catch (Exception e) {
			print("caught an Exception:" + e.toString());
		}
	}

	/**
	* 换行打印字符串, System.out.println 缩写
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public static void print(String str) {
		System.out.println(str);
	}
	
	/**
	* Calendar 类。
	* https://www.runoob.com/java/java-date-time.html
	*
	* @param 参数1 参数1的使用说明
	* @return 返回结果的说明
	* @throws 异常类型.错误代码 注明从此类方法中抛出异常的说明
	*/
	public static void calendarMethodTest() {
		//但是我们如何才能设置和获取日期数据的特定部分呢，比如说小时，日，或者分钟? 
		//我们又如何在日期的这些部分加上或者减去值呢? 
		//答案是使用Calendar 类。
		
		// Calendar类是一个抽象类，在实际使用时实现特定的子类的对象，创建对象的过程对程序员来说是透明的，只需要使用getInstance方法创建即可。
		Calendar c = Calendar.getInstance();
		c.set(2009, 6-1, 12); //把Calendar对象c1的年月日分别设这为：2009、6、12
		print("origin date:" + c.toString());
		c.set(Calendar.DATE, 10);
		c.set(Calendar.YEAR, 2008);
		c.add(Calendar.DATE, 10);// 10 天后的日志
		print("after date:" + c.toString());
		c.add(Calendar.DATE, -10); //10天前的时间
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH) + 1; // start form 0
		print(year + "-" + month + "-" + day);
		
		//Calendar类实现了公历日历，GregorianCalendar是Calendar类的一个具体实现。
		//Calendar 的getInstance（）方法返回一个默认用当前的语言环境和时区初始化的GregorianCalendar对象
		//GregorianCalendar定义了两个字段：AD和BC。这是代表公历定义的两个时代。
		//有很多构造函数,可以按照指定时间初始化
		GregorianCalendar gcalendar = new GregorianCalendar(); 
		print("date:" + gcalendar.get(Calendar.YEAR) + "-" + gcalendar.get(Calendar.MONTH) + "-" + gcalendar.get(Calendar.DAY_OF_MONTH));
		print("time:" + gcalendar.get(Calendar.HOUR) + "-" + gcalendar.get(Calendar.MINUTE) + "-" + gcalendar.get(Calendar.SECOND));
		print("timezon:" + gcalendar.getTimeZone()); // return TimeZone class
		print("mills:" + gcalendar.getTimeInMillis());
		
		// TODO:
		//???
		print("actualMaximum:" + gcalendar.getActualMaximum(Calendar.YEAR));
		print("getActualMinimum:" + gcalendar.getActualMinimum(Calendar.YEAR));
		print("getGreatestMinimum:" + gcalendar.getGreatestMinimum(Calendar.YEAR));
		print("isLeapYear:" + gcalendar.isLeapYear(Calendar.YEAR));
		// NOTE:
		//Calendar 的月份是从 0 开始的，但日期和年份是从 1 开始的
		//Calendar 的月份只能设置:0-11
		//day:1-31, 年份也是正常表示即可
//		gcalendar.set(2017, 1, 1);
		gcalendar.set(2017, 11, 31);
		Date date = gcalendar.getTime();
		print("date:" + date.toString());
		print("" + gcalendar.get(Calendar.YEAR) + "-" + gcalendar.get(Calendar.MONTH) + "-" + gcalendar.get(Calendar.DAY_OF_MONTH));
		gcalendar.set(2017,  11, 1);
		print("" + gcalendar.get(Calendar.YEAR) + "-" + gcalendar.get(Calendar.MONTH) + "-" + gcalendar.get(Calendar.DAY_OF_MONTH));
		date = gcalendar.getTime();
		print("date:" + date.toString());
	}
}
