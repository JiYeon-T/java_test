package Demo;

public class Operation {
	
	//
	//instanceof�����
//	boolean isBoolean( int a ) {
//		if(a instanceof Integer) {
//			return true;
//		}
//		return false;
//	}
	
	public static void main(String[] args) {
		//��������:+-*/%
		
		//�߼�����
		//λ����
		byte a = 60, b =13;
		System.out.println("a:" + Integer.toBinaryString(a) + " , b:" + Integer.toBinaryString(b));
		System.out.println("a&b = " + Integer.toBinaryString(a & b) );
		System.out.println("a>>2 = " + (a>>2) );
		//>>> ���ƣ���λ����
		System.out.println("a>>>2 = " + (a>>>2) );	
		//��λȡ��
		System.out.println("~a = " + Integer.toBinaryString(~a) );	
		
		
		//�߼�����&& || ��
		//��·���򣬶���&&������˵,ǰһ��Ϊ�ٵ�ʱ�򣬺�һ�����ٽ����ж�
		int num1 = 1, num2 = -1;
		
		if(num1<0 && ++num2>0) {
			;
		}
		System.out.println("num2 = " + num2);
		
		//��ֵ�����
		//<<=  >>=  &=  |=  ^= 
		System.out.println("a (%)= b��ֵ:" + ( a %= b ));
		
		//instanceof�����
		
	}
}
