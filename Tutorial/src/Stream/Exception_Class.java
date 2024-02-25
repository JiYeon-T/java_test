package Stream;
//
//import java.io.File;
import java.io.IOException;

public class Exception_Class {

	public String name;
	
	public Exception_Class(String name) {
		this.name = name;
	}
	//java.lang.包中
	//异常处理
	//检查性异常； 运行时异常； 错误
	//错误不在java 处理的范围之内
	//父类:ThrowEnable中:
	//子类:Error检查运行中的错误，
	//子类:Exception用来检查异常，如打开不存在的文件等
	
	//在Java中定义了两种类型的异常和错误。
	//JVM(Java虚拟机) 异常：由 JVM 抛出的异常或错误。例如：NullPointerException 类，ArrayIndexOutOfBoundsException 类，ClassCastException 类。
	//程序级异常：由程序或者API程序抛出的异常。例如 IllegalArgumentException 类，IllegalStateException 类。
	
	//异常检查
	//访问数组越界属于运行时异常,编译过程无法检查到
	
	public void exceptionTest() {
		int arr[] = new int[2];
		try {
			//File f = new f();
			System.out.println( "array element:" + arr[2] );
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println( "Error occured:  " + e );
		}
//		catch(IOException e) {
//			
//		}
		finally {	//检查到异常后，执行完异常里面的代码块之后在执行finally()代码块
			arr[0] = 1;
			arr[1] = 2;
			System.out.println( "array element:" + arr[0] + ", " + arr[1] );
		}
		
		System.out.println( "Error Test successful.");
	}
	
	//test
	public static void main(String[] args) {
		Exception_Class ec = new Exception_Class("ex");
		ec.exceptionTest();
	}
}
