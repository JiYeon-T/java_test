package Demo;

public class BasicDataType {

	//不赋值，给默认值
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static boolean b2;
	static char c;
	static String s2;
	
	//基本数据类型的数据占用内存的大小以及最大小值都作为常量保存在包装类中
	//java.lang头文件不需要包含
	//其它基本数据类型
	//byte, short, int, long, float, double, bool, char， String
	public static void main( String[] args ) {
		//byte
		System.out.println("byte的基本类型长度:" + Byte.SIZE);
		System.out.println("包装类:java.lang.Byte");
		System.out.println("max:" + Byte.MAX_VALUE + " , min:" + Byte.MIN_VALUE);
		
		//short
		System.out.println("short的基本类型长度:" + Short.SIZE);
		System.out.println("包装类:java.lang.Short");
		System.out.println("max:" + Short.MAX_VALUE + " , min:" + Short.MIN_VALUE);
		
		//int
		System.out.println("int的基本类型长度:" + Integer.SIZE);
		System.out.println("包装类:java.lang.Integer");
		System.out.println("max:" + Integer.MAX_VALUE + " , min:" + Integer.MIN_VALUE);
	
		//long
		System.out.println("long的基本类型长度:" + Long.SIZE);
		System.out.println("包装类:java.lang.Long");
		System.out.println("max:" + Long.MAX_VALUE + " , min:" + Long.MIN_VALUE);
		
		//float
		System.out.println("float的基本类型长度:" + Float.SIZE);
		System.out.println("包装类:java.lang.Float");
		System.out.println("max:" + Float.MAX_VALUE + " , min:" + Float.MIN_VALUE);
		
		//double
		System.out.println("double的基本类型长度:" + Double.SIZE);
		System.out.println("包装类:java.lang.Double");
		System.out.println("max:" + Double.MAX_VALUE + " , min:" + Double.MIN_VALUE);
		
		//char
		System.out.println("char的基本类型长度:" + Character.SIZE);
		System.out.println("包装类:java.lang.Character");
		System.out.println("max:" + (int)Character.MAX_VALUE + " , min:" + (int)Character.MIN_VALUE);
		
		//String
		//bool
		
		
		//打印这些基本数据结构的默认值
		System.out.println("byte的默认值:" + b);
		System.out.println("short的默认值:" + s);
		System.out.println("int的默认值:" + i);
		System.out.println("long的默认值:" + l);
		System.out.println("float的默认值:" + f);
		System.out.println("double的默认值:" + d);
		System.out.println("char的默认值:" + c);
		System.out.println("String的默认值:" + s2);
		System.out.println("boolean的默认值:" + b2);
		
		
		//java中的引用数据类型
		
	}
}
