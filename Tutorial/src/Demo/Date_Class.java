package Demo;

//java.util.Date	
//�Լ�����������java���е����ͻ
import java.util.Date;
import java.util.*;
import java.text.*;

public class Date_Class {
	
	//��ʼ��
	public static void ititDate() {
		//��ʼ��
		Date d = new Date();
		
		System.out.println("��ǰʱ�䣺" + d.toString());
		System.out.println("��ǰʱ�䣺" + d.getTime());
	}
	
	//ʱ���ʽ
	public static void dateFormat() {
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		System.out.println("��ǰʱ��:" + ft.format(dNow));
	}
	
	//ʹ��printf()���и�ʽ����
	//���� %t ��ͷ�������������е�һ����ĸ��β, ���ʱ��ĸ�ʽ����
	public void dateFormatControl() {
		Date dNow = new Date();
		
		System.out.printf("ʱ��:%tc%n", dNow);
	}
	
	//�����ַ���Ϊʱ��
	//������ַ�������Ϊ���ã������Ҫʹ��static
	public static void parseDateFormat( String input ) {
		SimpleDateFormat fd = new SimpleDateFormat("yy-MM-dd");
		
		//�ⲻ����������
		//ǿ��ʹ���������ʽ
		input = input.length()==0 ? "0-0-0" : input;
		
		Date t;
		
		try {
			t = fd.parse(input);
			System.out.println("ʱ��:" + t);
		}
		catch(ParseException e) {
			System.out.println("unable to parse Date:" + input );
		}
	}
	
	//�õ�ǰ�߳�����һ��ʱ��
	public static void delay() {
		try {
			System.out.println("��ǰʱ��" + new Date() );
			Thread.sleep(1000 * 3);	//����3��
			System.out.println("��ǰʱ��" + new Date() );

		}
		catch(Exception e) {
			System.out.println("unable to delay Date:" );
		}
	}
	
	//Calendar��
	//Calendar������������Щ������ʾ��ͬ�����壬jdk�ڵĺܶ�����ʵ���ǲ��õ�����˼��
	//���������з�װ���Գ�������ʽ����
	public static void useCalendar() {
		//Calendar��һ�������࣬�޷���������
		//����getInstance()����
		Calendar c1 = Calendar.getInstance();
		
		//����ָ������
		c1.set(2010, 6, 12);
		
		//public void set(int field,int value)
		c1.set(Calendar.MINUTE, 15);
		c1.set(Calendar.HOUR, 1);
		
		int date = c1.get(Calendar.DATE);
		System.out.println("DATE:" + date);
		//Calendar������������Щ������ʾ��ͬ�����壬jdk�ڵĺܶ�����ʵ���ǲ��õ�����˼��
		
		
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