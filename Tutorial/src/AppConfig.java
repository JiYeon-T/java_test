

/** 静态变量测试 */
//使用静态变量：存储全局状态或配置信息
//这些静态变量存储的全局配置信息可以在整个程序中使用，并且不会被修改。
//这个例子展示了静态变量的另一个常见应用，通过它我们可以很方便地存储全局配置信息，或者实现其他需要全局共享的数据。
public class AppConfig {
	public static final String APP_NAME = "MyApp";
	public static final String APP_VERSION = "1.0.0";
	public static final String DATABASE_URL = "jdbc:mysql://localhost:3306/mydb";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAppConfigInfo();
	}

	public static void printAppConfigInfo() {
		System.out.println("APP_NAME:" + APP_NAME);
		System.out.println("APP_VERSION:" + APP_VERSION);
		System.out.println("DATABASE_URL:" + DATABASE_URL);
	}
}
