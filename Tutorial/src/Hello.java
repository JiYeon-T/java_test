//package hello;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		/***********************************/
//		System.out.println("Hello");
//		Scanner in = new Scanner(System.in);
//		System.out.print("������amount:");
//		int amount = in.nextInt();	
//		System.out.print("������price");
//		int price = in.nextInt(); //final = const �����˳������������޷��޸�
//				
////		System.out.println("echo:" + in.nextLine());
//		
//		System.out.println(amount + "-" + price + "=" + (amount - price));		//ʵ�ʣ�println("x"+"y"+(...));
	/*****************************************/
		
//		int inch = 0, foot = 0;
//		Scanner in = new Scanner(System.in);
//		inch = in.nextInt();
//		foot = in.nextInt();
//		double meter = 0;
//		meter = (inch + (double)foot / 12) * 0.3148;		//int/int->int
//		System.out.println("Ӣ��:"+inch+'\t'+"Ӣ��:"+foot);
//		System.out.println("������ߣ�"+meter);
		/**��ϵ����ȼ���
		 * ��Ϲ�ϵ����ͬ���ȼ�ʱ�����磺���Ǹ�ֵ�����ʱ������������м��㣻
		 * ���磺reult = b = a = 5;		//��������ֵ�ģ�
		 */
		
		/***************************************/
//		��ʼ��
//		Scanner in = new Scanner(System.in);
////		���	
//		int amount;
//		System.out.println("*��Ͷ�ң�*");
//		amount = in.nextInt();
//		System.out.println("Java..��·�Σ���ָ����λƱ");
//		System.out.println("���㣺"+ (amount - 5));

		/***************************************/
//		double a = 0.5;
//		double b = 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
//		System.out.println(Math.abs(b-a) < 1e-6);

		/*************�����ĵ���**************************/
//		hello();
//		farmer();
//		server();

		/*************if�ж����*******************************/
//		System.out.println("������������������һ������");
//		int age;
//		Scanner in = new Scanner(System.in);
//		age = in.nextInt();
//		if(age >= 18)
//			System.out.println("�ÿ��ģ����Գ�ȥ�����ˣ�");
//		else
//			System.out.println("���ؼ�ѧϰ!");

		/************else if************************************/
//		int a = 1, b = 2, c = 3;
//		if(a > b && a > c )
//			System.out.println("a>b");		//&& || !�߼���ϵ��C��ͬ
//		else if(a == b || a < b)
//			System.out.println("a=b");
//		else
//			System.out.println("a<b");

		/***********�ɼ������в����*********************************/
//		System.out.println("��������ĳɼ���");
//		float score;
//		Scanner in = new Scanner(System.in);
//		score = in.nextFloat();
		/**Key1:****/
//		if(score > 90)
//			System.out.println("���㰡���ֵܣ�");
//		else if(score > 80)
//			System.out.println("�����ԣ����ͣ�");
//		else if(score > 70)
//			System.out.println("��Ҫ��ѽ���ֵܣ�");
//		else if(score > 60)
//			System.out.println("���ҿ��ˣ�С���ӣ�");
//		else
//			System.out.println("�������������ްɣ�");
		/**Ket2:****/
//		if(score < 60)
//			System.out.println("�������������ްɣ�");
//		else if(score < 70)
//			System.out.println("���ҿ��ˣ�С���ӣ�");

		/*********���������a > b ? a : b  ��Ŀ�����************************/
//		int a = 1, b = 2;
//		int max = a > b ? a : b;
//		System.out.println("max = " + max);

		/*********Switch*******************************************/
		/*switch()С�����е����ݣ�byte/short
		 * 
		 */
//		String ch ;		//�ַ������壬String��SҪ��д������ʹ��:in.nextLine();
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
		
		/***********forѭ��*********************************************/
//		int i = 0;
//		for(i = 0; i < 10; i++)	{		//i��index����д��
//			System.out.print(i + '\t');

		/********************ѭ��Ƕ��************************************/
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		/***************�Ƚ�***************************************/
//		Scanner in = new Scanner(System.in);	
//		int a, b, max;
//		a = in.nextInt();
//		b = in.nextInt();
//		max = cmp(a, b);
//		show(max);

		/***************���***********************************/
//		int sum = 0;
//		for(int i = 0; i <= 100; i++)
//			sum += i;
//		show(sum);

		/***************�������أ��������أ�*********************************/
//		System.out.println(sum(10, 20));
//		System.out.println(sum(1, 2.0, 65));

		/*************ʹ�÷������صķ����ж��������Ƿ����*******************************/
//		System.out.print(isSame(1,1));

		/**************����Array����̬��ʼ������̬��ʼ��***************************************************/
//		int arr[] = {0,1,2};		//���ߣ�int[] arr = {0, 1, 2};
//		for(int i = 0; i < 3; i++)
//			System.out.print(arr[i] + ",");

		/***************��̬��������***************************************/
//		int[] arrA = new int [10];
//		int arrC[] = new int [10];

		/*****��̬��ʼ����ʡ�Ը�ʽ���ܲ�ֳ�Ϊ��������*********/
//		int[] arrB;
//		arrB = new int[] {10, 20, 30};		//��̬��ʼ��
//		System.out.print(arrB[0]);
		//arrB = {10, 20, 30};			//�����ʽ
		
		
		
		
		
		
		
	}
		
	//���巽��:���η� ����ֵ���� �������ƣ�����1������2��...��{return ret;}
	public static void hello() {
		System.out.println("Fuck this World!");
		byte num1 = 28;		//�ֽ����͵ı�����0-32��1���ֽ�4λ
		System.out.println("num1="+num1);
	}
	
	public static void farmer() {
		System.out.println("The farmer plant various vegetable on spring.");
	}
	
	public static void server() {
		System.out.println("The server can serve many clients.");
	}
	public static int cmp(int num1, int num2) { //�ȽϺ���
		if(num1 > num2)
			return num1;
		return num2;
	}

	/**********show����************/
	public static void show(int num) { //show����
		System.out.println(num);
	}

	/********��������**********/
	public static int sum(int a, int b) {
		return a + b;
	}
	public static int sum(int a, int b, int c) {	//����������
		return a + b + c;
	}
	public static int sum(int a, double b, long c) {
		return (int)(a + b + c);
	}

	/**********�ж����************/
	public static boolean isSame(int a, int b) {		//����ֵΪ�������͵ķ���,isSame��������С�շ��������ʽ
		if(a == b)
			return true;
		else
			return false;
	}

	/*public static boolean isSame(char a, char b) {		
		return 'a' == 'b';		//�ڷ���ֵ��ֱ�ӽ����жϣ�  a=b �����棻���򣬷��ؼ�,�ַ���û�취�ж��Ƿ����,����C������ַ��͵����������洢��
	}*/
	public static boolean isSame(double a, double b) {
		return a == b;
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}