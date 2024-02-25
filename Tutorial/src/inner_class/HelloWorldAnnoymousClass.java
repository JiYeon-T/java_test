package inner_class;

public class HelloWorldAnnoymousClass {
	/*
	 * @fun:������������helloworld�ӿ�
	 */
	interface HelloWorld{
		public void greet();
		public void greetSomeone(String name);
	}
	
	//������ĳ�Ա����
	public void sayHello() {
		//1.�ֲ���EnglishGreetingʵ����HelloWorld�ӿ�
		class EnglishGreeting implements HelloWorld{
			String name = "World";	//��ĳ�Ա
			//interface's function1
			public void greet() {
				greetSomeone("world");
			}
			
			//interface's function2
			public void greetSomeone(String peopleName) {
				name = peopleName;
				System.out.println("Hello, " + name);
			}
		}
		
		//ʵ�����ڲ������Ա
		EnglishGreeting englishGreeting = new EnglishGreeting();
		
		//2.������ʵ��HelloWorld�ӿ�
		//����ʵ�ֵĽӿ���һ�����ʽ����˽�����Ҫ�ӷֺ�
		//�������ڶ����ʱ����Ѿ�ʵ������
		HelloWorld frenchGreeting = new HelloWorld() {
			String name = "tout le monde";
			//interface's function1
			public void greet() {
				greetSomeone(name);
			}
			
			//interface's function2
			public void greetSomeone(String peopleName) {
				name = peopleName;
				System.out.println("Salute, " + name);
			}
		};
		
		//ֱ��ʹ���ڲ������������÷���
		englishGreeting.greet();
		frenchGreeting.greetSomeone("Bob");
	}
	
	//����
	public static void main( String... args ) {
		HelloWorldAnnoymousClass hello = new HelloWorldAnnoymousClass();
		hello.sayHello();
		
	}
	//�������þֲ�������ʼ������englishGreeting������������ʼ������frenchGreeting��spanishGreeting������ʵ��֮�������Ե�����
	//1���ֲ���EnglishGreetin�̳�HelloWorld�ӿڣ����Լ����������������֮����Ҫ����new�ؼ���ʵ�����ſ���ʹ�ã�
	//2��frenchGreeting��spanishGreeting�ڶ����ʱ���ʵ�����ˣ��������˾Ϳ���ֱ��ʹ�ã�
	//3����������һ�����ʽ������ڶ��������÷ֺ�";"������
}
