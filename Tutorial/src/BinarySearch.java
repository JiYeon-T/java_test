//package example;

public class BinarySearch {
	//BinarySearch,���ֲ����㷨
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
		return -1;			//û���ҵ�key���ֵ
	}
	
	//main
	public static void  main( String[] args) {
		System.out.println( "���ֲ��Ҳ���:" );
		//��Ҫ���ر�׼��ķ������ſ���ʹ��
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
			System.out.println("a��");
		else
			System.out.println("b��");
		
		//
		op();
	}
	public static void op() {
		//+ - * /���Ǳ����ع���
		System.out.println(1+2);
		System.out.println(1+2);
	}
}
