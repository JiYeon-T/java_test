package Demo;

public class Str {

	
	
	//测试
	public static void main(String[] args) {
		//使用String创建的对象保存在公共池中，使用new保存的对象保存在堆内存中
		String s1 = "a";
		String s2 = "a";
		System.out.println("s1:" + s1 + "\ts2:" + s2);
		s1 = "b";
		System.out.println("s1:" + s1 + "\ts2:" + s2);
		String s3 = new String("abc");
		System.out.println("s3:" + s3 + ", 字符串的长度:" + s3.length());
		s3 = "abcd";
		System.out.println("s3:" + s3 + ", 字符串的长度:" + s3.length());
		System.out.println(s3.charAt(0));
		System.out.println(s3.hashCode());
		System.out.println("--------------------------");
		stringBuilderTest();
		
		System.out.println("--------------------------");
		stringBufferTest();
	}
	
	
	//String对象一旦创建就是不可改变的，如果想要一个可以改变的字符串，则推荐StringBuffer和StringBuilder类
	//可以多次修改，且不产生新的对象
	//StringBuilder比stringBuffer访问速度更快，但是StringBuilder线程不安全，不支持同步访问
	//通常还是使用StringBuilder
	public static void stringBuilderTest() {
		StringBuilder sb = new StringBuilder(10);
		System.out.println(sb + ", capacity:" + sb.capacity());
		sb.append("hello.");
		System.out.println(sb + ", capacity:" + sb.capacity());
		sb.insert(3, "how are you");	//自动扩大数组的容量
		System.out.println(sb + ", capacity:" + sb.capacity());
		sb.delete(0, 3);
		System.out.println(sb + ", capacity:" + sb.capacity());
	}
	
	//为什么必须声明为static???????????????
	public static void stringBufferTest() {
		StringBuffer sb = new StringBuffer(100);
		System.out.println(sb + ", capacity:" + sb.capacity());
		sb.append("hello.");
		System.out.println(sb + ", capacity:" + sb.capacity());
		sb.insert(3, "how are you");	//自动扩大数组的容量
		System.out.println(sb + ", capacity:" + sb.capacity());
		sb.delete(0, 3);
		System.out.println(sb + ", capacity:" + sb.capacity());
	}
	
}
