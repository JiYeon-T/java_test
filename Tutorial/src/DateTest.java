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
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	public static void dateMethodTest() {
		Date date1 = new Date(); // �õ�ǰʱ���ʼ��һ������
		Date date2 = new Date(123456); //ʱ���:�ò����Ǵ� 1970 �� 1 �� 1 ����ĺ�����
		
		print("after:" + date1.after(date2));
		print("before:" + date1.before(date2));
		
		date2 = (Date)date1.clone(); // return is Object type
		print("clone:" + date2.toString());

		print("compareTo:" + date1.compareTo(date2));
		//int compareTo(Object obj)
		//��obj��Date�����������ͬ��compareTo(Date) ���������׳�ClassCastException��
		
		print("equals:" + date1.equals(date2)); //ָ���������ʱ�򷵻�true
		
		print("getTime:" + date1.getTime()); //ʱ���:������ 1970 �� 1 �� 1 �� 00:00:00 GMT ������ Date �����ʾ�ĺ�����
		date1.setTime(123456); //����ʱ���,��1970��1��1��00:00:00 GMT�Ժ�time����������ʱ�������
		
		print("hashCode:" + date1.hashCode());
		
		//yyyy �������Ĺ�Ԫ��
		//MM ���·�
		//dd ������
		//HH:mm:ss ��ʱ���֡���ss
		// https://www.runoob.com/java/java-date-time.html
		//�еĸ�ʽ��д���еĸ�ʽСд������ MM ���·ݣ�mm �Ƿ֣�HH �� 24 Сʱ�ƣ��� hh �� 12 Сʱ��
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		print("time:" + fmt.format(date1));
		
		// ʹ�� printf() Ҳ���԰���ָ����ʽ�������
		//%tY�������λ������ݣ����磺2023
		//%tm�������λ�����·ݣ����磺02
		//%td�������λ�������ڣ����磺24
		//%tH�����24Сʱ�Ƶ�Сʱ�������磺23
		//%tM����������������磺45
		//%tS��������������磺30
		//%tZ�����ʱ�������磺GMT+08:00
		System.out.printf("%tY-%tm-%td %tH:%tM:%tS %tZ\n", date1, date1, date1, date1, date1, date1, date1);
		System.out.printf("%tc\n", date1);
		
		//������д��
		//��������һ����ʽ���ַ���ָ��Ҫ����ʽ���Ĳ������������������������ % ���棬���ұ����� $ ���������磺
		System.out.printf("%1$s %2$tB %2$td, %2$tY\n", "Date:", date1);
		//���ߣ������ʹ�� < ��־����������ǰ����ʽ���Ĳ���Ҫ���ٴ�ʹ�á�
		System.out.printf("%s %tB %<te, %<tY\n", "Date:", date1);
		
		//�������ڸ�ʽ��ת��������ʹ����ͨ��ָ����ת�����������ַ���
		//https://www.runoob.com/java/java-date-time.html
		String dateStr = String.format(Locale.US, "Ӣ���·ݼ��:%tb", date1);
		print("dateStr:" + dateStr);
		dateStr = String.format(Locale.US, "Ӣ���·�ȫ��:%tB", date1);
		print("dateStr:" + dateStr);	
		
		//SimpleDateFormat ����һЩ���ӵķ������ر���parse()��
		//����ͼ���ո�����SimpleDateFormat ����ĸ�ʽ���洢�������ַ�����
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
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
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
	* �����һ�����ӱ�����β���ʱ�������Ժ���Ϊ��λ����
	*
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
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
	* ���д�ӡ�ַ���, System.out.println ��д
	*
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	public static void print(String str) {
		System.out.println(str);
	}
	
	/**
	* Calendar �ࡣ
	* https://www.runoob.com/java/java-date-time.html
	*
	* @param ����1 ����1��ʹ��˵��
	* @return ���ؽ����˵��
	* @throws �쳣����.������� ע���Ӵ��෽�����׳��쳣��˵��
	*/
	public static void calendarMethodTest() {
		//����������β������úͻ�ȡ�������ݵ��ض������أ�����˵Сʱ���գ����߷���? 
		//��������������ڵ���Щ���ּ��ϻ��߼�ȥֵ��? 
		//����ʹ��Calendar �ࡣ
		
		// Calendar����һ�������࣬��ʵ��ʹ��ʱʵ���ض�������Ķ��󣬴�������Ĺ��̶Գ���Ա��˵��͸���ģ�ֻ��Ҫʹ��getInstance�����������ɡ�
		Calendar c = Calendar.getInstance();
		c.set(2009, 6-1, 12); //��Calendar����c1�������շֱ�����Ϊ��2009��6��12
		print("origin date:" + c.toString());
		c.set(Calendar.DATE, 10);
		c.set(Calendar.YEAR, 2008);
		c.add(Calendar.DATE, 10);// 10 ������־
		print("after date:" + c.toString());
		c.add(Calendar.DATE, -10); //10��ǰ��ʱ��
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH) + 1; // start form 0
		print(year + "-" + month + "-" + day);
		
		//Calendar��ʵ���˹���������GregorianCalendar��Calendar���һ������ʵ�֡�
		//Calendar ��getInstance������������һ��Ĭ���õ�ǰ�����Ի�����ʱ����ʼ����GregorianCalendar����
		//GregorianCalendar�����������ֶΣ�AD��BC�����Ǵ��������������ʱ����
		//�кܶ๹�캯��,���԰���ָ��ʱ���ʼ��
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
		//Calendar ���·��Ǵ� 0 ��ʼ�ģ������ں�����Ǵ� 1 ��ʼ��
		//Calendar ���·�ֻ������:0-11
		//day:1-31, ���Ҳ��������ʾ����
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
