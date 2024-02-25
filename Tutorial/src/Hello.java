//package hello;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		/***********************************/
//		System.out.println("Hello");
//		Scanner in = new Scanner(System.in);
//		System.out.print("请输入amount:");
//		int amount = in.nextInt();	
//		System.out.print("请输入price");
//		int price = in.nextInt(); //final = const 定义了常量，程序中无法修改
//				
////		System.out.println("echo:" + in.nextLine());
//		
//		System.out.println(amount + "-" + price + "=" + (amount - price));		//实质：println("x"+"y"+(...));
	/*****************************************/
		
//		int inch = 0, foot = 0;
//		Scanner in = new Scanner(System.in);
//		inch = in.nextInt();
//		foot = in.nextInt();
//		double meter = 0;
//		meter = (inch + (double)foot / 12) * 0.3148;		//int/int->int
//		System.out.println("英尺:"+inch+'\t'+"英寸:"+foot);
//		System.out.println("公制身高："+meter);
		/**结合的优先级：
		 * 结合关系：相同优先级时，例如：都是赋值运算符时，自右向左进行计算；
		 * 例如：reult = b = a = 5;		//从右向左赋值的；
		 */
		
		/***************************************/
//		初始化
//		Scanner in = new Scanner(System.in);
////		金额	
//		int amount;
//		System.out.println("*请投币：*");
//		amount = in.nextInt();
//		System.out.println("Java..铁路段，无指定座位票");
//		System.out.println("找零："+ (amount - 5));

		/***************************************/
//		double a = 0.5;
//		double b = 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
//		System.out.println(Math.abs(b-a) < 1e-6);

		/*************方法的调用**************************/
//		hello();
//		farmer();
//		server();

		/*************if判断语句*******************************/
//		System.out.println("今天天气不错，出现了一家网吧");
//		int age;
//		Scanner in = new Scanner(System.in);
//		age = in.nextInt();
//		if(age >= 18)
//			System.out.println("好开心，可以出去上网了！");
//		else
//			System.out.println("滚回家学习!");

		/************else if************************************/
//		int a = 1, b = 2, c = 3;
//		if(a > b && a > c )
//			System.out.println("a>b");		//&& || !逻辑关系与C相同
//		else if(a == b || a < b)
//			System.out.println("a=b");
//		else
//			System.out.println("a<b");

		/***********成绩优良中差不及格*********************************/
//		System.out.println("请输入你的成绩：");
//		float score;
//		Scanner in = new Scanner(System.in);
//		score = in.nextFloat();
		/**Key1:****/
//		if(score > 90)
//			System.out.println("优秀啊，兄弟！");
//		else if(score > 80)
//			System.out.println("还可以，加油！");
//		else if(score > 70)
//			System.out.println("不要行呀，兄弟！");
//		else if(score > 60)
//			System.out.println("差点挂科了，小伙子！");
//		else
//			System.out.println("垃圾，明年重修吧！");
		/**Ket2:****/
//		if(score < 60)
//			System.out.println("垃圾，明年重修吧！");
//		else if(score < 70)
//			System.out.println("差点挂科了，小伙子！");

		/*********条件运算符a > b ? a : b  三目运算符************************/
//		int a = 1, b = 2;
//		int max = a > b ? a : b;
//		System.out.println("max = " + max);

		/*********Switch*******************************************/
		/*switch()小括号中的内容：byte/short
		 * 
		 */
//		String ch ;		//字符串定义，String的S要大写，输入使用:in.nextLine();
//		Scanner in = new Scanner(System.in);
//		ch = in.nextLine();
//		switch(ch) {
//		case"a":
//			System.out.println("a");break;
//		case"b":
//			System.out.print("b");break;
//		default:
//			System.out.print("Not Found the match Character.");break;
//		}
		
		/***********for循环*********************************************/
//		int i = 0;
//		for(i = 0; i < 10; i++)	{		//i是index的缩写；
//			System.out.print(i + '\t');

		/********************循环嵌套************************************/
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		/***************比较***************************************/
//		Scanner in = new Scanner(System.in);	
//		int a, b, max;
//		a = in.nextInt();
//		b = in.nextInt();
//		max = cmp(a, b);
//		show(max);

		/***************求和***********************************/
//		int sum = 0;
//		for(int i = 0; i <= 100; i++)
//			sum += i;
//		show(sum);

		/***************方法重载（函数重载）*********************************/
//		System.out.println(sum(10, 20));
//		System.out.println(sum(1, 2.0, 65));

		/*************使用方法重载的方法判断两个数是否相等*******************************/
//		System.out.print(isSame(1,1));

		/**************数组Array，动态初始化，静态初始化***************************************************/
//		int arr[] = {0,1,2};		//或者：int[] arr = {0, 1, 2};
//		for(int i = 0; i < 3; i++)
//			System.out.print(arr[i] + ",");

		/***************动态创建数组***************************************/
//		int[] arrA = new int [10];
//		int arrC[] = new int [10];

		/*****静态初始化的省略格式不能拆分成为两个步骤*********/
//		int[] arrB;
//		arrB = new int[] {10, 20, 30};		//静态初始化
//		System.out.print(arrB[0]);
		//arrB = {10, 20, 30};			//错误格式
		
		
		
		
		
		
		
	}
		
	//定义方法:修饰符 返回值类型 方法名称（参数1，参数2，...）{return ret;}
	public static void hello() {
		System.out.println("Fuck this World!");
		byte num1 = 28;		//字节类型的变量，0-32，1个字节4位
		System.out.println("num1="+num1);
	}
	
	public static void farmer() {
		System.out.println("The farmer plant various vegetable on spring.");
	}
	
	public static void server() {
		System.out.println("The server can serve many clients.");
	}
	public static int cmp(int num1, int num2) { //比较函数
		if(num1 > num2)
			return num1;
		return num2;
	}

	/**********show函数************/
	public static void show(int num) { //show函数
		System.out.println(num);
	}

	/********方法重载**********/
	public static int sum(int a, int b) {
		return a + b;
	}
	public static int sum(int a, int b, int c) {	//方法的重载
		return a + b + c;
	}
	public static int sum(int a, double b, long c) {
		return (int)(a + b + c);
	}

	/**********判断相等************/
	public static boolean isSame(int a, int b) {		//返回值为布尔类型的方法,isSame————小驼峰的命名方式
		if(a == b)
			return true;
		else
			return false;
	}

	/*public static boolean isSame(char a, char b) {		
		return 'a' == 'b';		//在返回值中直接进行判断：  a=b 返回真；否则，返回假,字符型没办法判断是否相等,不像C里面把字符型当作整型来存储的
	}*/
	public static boolean isSame(double a, double b) {
		return a == b;
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}