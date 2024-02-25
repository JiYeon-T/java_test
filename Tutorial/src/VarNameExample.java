//package example;

//静态变量（也称为类变量）的命名规范通常遵循驼峰命名法
//静态常量量通常使用全大写字母，单词之间用下划线分隔。这被称为"大写蛇形命名法"（Upper Snake Case）。
//例如：MY_STATIC_VARIABLE。

// Java 类名:大驼峰
public class VarNameExample {
	public final static int MAX_OBJ_NUM = 256; // 常量 大写蛇形命名法，全大写字母，单词之间用下划线分隔。
	public static int currObjNum = 0; // 静态变量/成员变量 小驼峰
	
	public VarNameExample() {
		currObjNum += 1;
	}
	public static void main(String[] args) {
		System.out.println("Hello world");
		printSomethind(1.2);
	}
	
	// java 方法/形式参数名:小驼峰
	public static void printSomethind( double prtInfo ) {
		System.out.println( "double value is:" + prtInfo + "  MAX_OBJ_NUM:" + MAX_OBJ_NUM + "  currObjNum:" + currObjNum);
		VarNameExample example = new VarNameExample();
		System.out.println( "double value is:" + prtInfo + "  MAX_OBJ_NUM:" + MAX_OBJ_NUM + "  currObjNum:" + currObjNum);
	}

}
