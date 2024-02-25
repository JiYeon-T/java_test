package Demo;

import java.util.Arrays;

public class array_Class {
	//�����ʹ��
	//dataType arrayRefVar[] ��������� C/C++ ���� ����Java�в�����Ϊ���� C/C++ ����Ա�ܹ��������java���ԡ�
	
	public void initArray() {
		int[] arr1 = {1, 2, 3};
		int[] arr2 = new int[100];	//arrsize = 100
		arr2[0] = 1;
		
	}
	
	//for-eachѭ�� ���߽� ��ǿ��ѭ��JDK1.5���Ժ�
	//�����static?????????????????
	public static void testArr(int arrSize) {
		int[] arr2 = new int[arrSize];
		
		//for circle
		for( int ix = 0; ix < arr2.length; ++ix ) {
			arr2[ix] = (int)(Math.random() + 1);	//Math.random()�ķ���ֵ(0, 1)֮��
		}
		
		//for-each circle
		int sum = 0;
		for( int num : arr2 ) {
			System.out.print(num + ", ");
			sum += num;
		}
		
		System.out.println("sum = " + sum);
	}
	
	//������Ϊ���� ����ֵ
	//������static����
	public static void inArray(int[] array) {
		for( int elem : array ) {
			System.out.println(elem + ", ");
		}
	}
	
	//����ֵ
	public static int[] outArray() {
		int[] ret = {1, 2, 3};
		return ret;
	}
	
	//��ά����
	public static void d2array() {
		String[][] arr = new String[2][2];
		arr[0][0] = "a";
		arr[0][1] = "b";
		arr[1][0] = "c";
		arr[1][1] = "d";

		for( int ix = 0; ix < 2; ++ix ) {
			for( int jx = 0; jx < 2; ++jx) {
				System.out.println(arr[ix][jx]);
			}
		}
	}
	
	//java.util.Arrays
	//Arrays.sort()
	public static int[] sortArray( int[] arr ) {
		showArr(arr);
		Arrays.sort(arr);
		showArr(arr);
		return arr;
	}
	
	//��ӡһ������
	public static void showArr( int[] arr ) {
		for( int ix = 0; ix < arr.length; ++ix ) {
			System.out.print(arr[ix] + ", ");
		}
		System.out.print("\n");
	}
	
	public static void main(String[] args) {
		testArr(10);
		int[] arr = {1, 3, 2};
		inArray(arr);
		outArray();
		d2array();
		
		//
		sortArray(arr);
	}
}