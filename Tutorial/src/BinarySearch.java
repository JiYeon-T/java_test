//package example;

public class BinarySearch {
	//BinarySearch,二分查找算法
	public static int rand( int key, int[] a ) {
		int lo = 0;
		int hi = a.length - 1;
		while( lo <= hi ) {
			int mid = lo + (hi - lo) / 2;
			if( key < a[mid] )
				hi = mid-1;
			else if( key > a[mid] )
				lo = mid + 1;
			else
				return mid;
		}
		return -1;			//没有找到key这个值
	}
	
	//main
	public static void  main( String[] args) {
		System.out.println( "二分查找测试:" );
		//需要下载标准库的方法，才可以使用
		//int[] whiteList = In.readInts( args[0] );
		//while( !StdIn.isEmpty() ) {
			//int key = StdIn.readInt();
			
			//if(rank(key, whiteList)) == -1
				//StdOut.println(key)
		//}
		
		//boolean
		int a = 1, b = 2;
		boolean res = a > b;
		if( res )
			System.out.println("a大");
		else
			System.out.println("b大");
		
		//
		op();
	}
	public static void op() {
		//+ - * /都是被重载过的
		System.out.println(1+2);
		System.out.println(1+2);
	}
}
