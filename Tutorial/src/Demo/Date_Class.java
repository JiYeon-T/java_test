package Demo;

//java.util.Date	
//自己创建的类与java库中的类冲突
import java.util.Date;
import java.util.*;
import java.text.*;

public class Date_Class {
	
	//初始化
	public static void ititDate() {
		//初始化
		Date d = new Date();
		
		System.out.println("当前时间：" + d.toString());
		System.out.println("当前时间：" + d.getTime());
	}
	
	//时间格式
	public static void dateFormat() {
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		System.out.println("当前时间:" + ft.format(dNow));
	}
	
	//使用printf()进行格式控制
	//它以 %t 开头并且以下面表格中的一个字母结尾, 输出时间的格式控制
	public void dateFormatControl() {
		Date dNow = new Date();
		
		System.out.printf("时间:%tc%n", dNow);
	}
	
	//解析字符串为时间
	//传入的字符串参数为引用，因此需要使用static
	public static void parseDateFormat( String input ) {
		SimpleDateFormat fd = new SimpleDateFormat("yy-MM-dd");
		
		//这不是有问题吗？
		//强行使用条件表达式
		input = input.length()==0 ? "0-0-0" : input;
		
		Date t;
		
		try {
			t = fd.parse(input);
			System.out.println("时间:" + t);
		}
		catch(ParseException e) {
			System.out.println("unable to parse Date:" + input );
		}
	}
	
	//让当前线程休眠一段时间
	public static void delay() {
		try {
			System.out.println("当前时间" + new Date() );
			Thread.sleep(1000 * 3);	//休眠3秒
			System.out.println("当前时间" + new Date() );

		}
		catch(Exception e) {
			System.out.println("unable to delay Date:" );
		}
	}
	
	//Calendar类
	//Calendar类中用以下这些常量表示不同的意义，jdk内的很多类其实都是采用的这种思想
	//将常量进行封装，以常量的形式给出
	public static void useCalendar() {
		//Calendar是一个抽象类，无法创建对象
		//调用getInstance()方法
		Calendar c1 = Calendar.getInstance();
		
		//可以指定日期
		c1.set(2010, 6, 12);
		
		//public void set(int field,int value)
		c1.set(Calendar.MINUTE, 15);
		c1.set(Calendar.HOUR, 1);
		
		int date = c1.get(Calendar.DATE);
		System.out.println("DATE:" + date);
		//Calendar类中用以下这些常量表示不同的意义，jdk内的很多类其实都是采用的这种思想
		
		
	}
	
	//
	public static void main(String[] args) {
		ititDate();
		
		dateFormat();
		
		//Date_Class
		Date_Class date = new Date_Class();
		date.dateFormatControl();
		
		//
		Date_Class.parseDateFormat("1995-6-11");
		
		//
		Date_Class.delay();
		
		//
		Date_Class.useCalendar();
	}

}