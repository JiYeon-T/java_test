package Demo;

public class Operation {
	
	//
	//instanceof运算符
//	boolean isBoolean( int a ) {
//		if(a instanceof Integer) {
//			return true;
//		}
//		return false;
//	}
	
	public static void main(String[] args) {
		//算数运算:+-*/%
		
		//逻辑运算
		//位运算
		byte a = 60, b =13;
		System.out.println("a:" + Integer.toBinaryString(a) + " , b:" + Integer.toBinaryString(b));
		System.out.println("a&b = " + Integer.toBinaryString(a & b) );
		System.out.println("a>>2 = " + (a>>2) );
		//>>> 右移，空位补零
		System.out.println("a>>>2 = " + (a>>>2) );	
		//按位取反
		System.out.println("~a = " + Integer.toBinaryString(~a) );	
		
		
		//逻辑运算&& || ！
		//短路法则，对于&&运算来说,前一个为假的时候，后一个不再进行判断
		int num1 = 1, num2 = -1;
		
		if(num1<0 && ++num2>0) {
			;
		}
		System.out.println("num2 = " + num2);
		
		//赋值运算符
		//<<=  >>=  &=  |=  ^= 
		System.out.println("a (%)= b的值:" + ( a %= b ));
		
		//instanceof运算符
		
	}
}
