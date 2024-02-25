package Demo;

import java.util.Arrays;

public class array_Class {
	//数组的使用
	//dataType arrayRefVar[] 风格是来自 C/C++ 语言 ，在Java中采用是为了让 C/C++ 程序员能够快速理解java语言。
	
	public void initArray() {
		int[] arr1 = {1, 2, 3};
		int[] arr2 = new int[100];	//arrsize = 100
		arr2[0] = 1;
		
	}
	
	//for-each循环 或者叫 加强型循环JDK1.5及以后
	//必须加static?????????????????
	public static void testArr(int arrSize) {
		int[] arr2 = new int[arrSize];
		
		//for circle
		for( int ix = 0; ix < arr2.length; ++ix ) {
			arr2[ix] = (int)(Math.random() + 1);	//Math.random()的返回值(0, 1)之间
		}
		
		//for-each circle
		int sum = 0;
		for( int num : arr2 ) {
			System.out.print(num + ", ");
			sum += num;
		}
		
		System.out.println("sum = " + sum);
	}
	
	//数组作为参数 返回值
	//必须是static类型
	public static void inArray(int[] array) {
		for( int elem : array ) {
			System.out.println(elem + ", ");
		}
	}
	
	//返回值
	public static int[] outArray() {
		int[] ret = {1, 2, 3};
		return ret;
	}
	
	//多维数组
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
	
	//打印一个数组
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