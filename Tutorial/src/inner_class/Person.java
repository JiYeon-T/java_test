package inner_class;

//内部类优点和缺点：
//优点：可访问外部类私有属性（心脏可访问身体的血液，而不是外部抽血）。
//缺点：破坏原有类的程序结构（属性、构造方法、普通方法、内部类）。


/** 不使用内部类时的实现 */
//public class Person {
//	private int heart_beat;
//	private Heart heart;
//}
//
//public class Heart {
//	private int blood;
//	public void test() {
//		System.out.println(blood);
//	}
//}

/** 使用内部类时的实现 */
public class Person {
	private int blood;
	
	public static void main(String[] args) {
		// Out 内部类使用举例, 内部类必须要有外部类对象后才可以使用
		//从上面的例子不难看出，内部类其实严重破坏了良好的代码结构，但为什么还要使用内部类呢？
		//因为内部类可以随意使用外部类的成员变量（包括私有）而不用生成外部类的对象，这也是内部类的唯一优点。
		//如同心脏可以直接访问身体的血液，而不是通过医生来抽血。
		// 必须先有外部类的对象才能生成内部类的对象，因为内部类的作用就是为了访问外部类中的成员变量。
		// 方法1:
//		Out.In in = new Out().new In();
//		in.print();
		// 方法2:
		Out	out = new Out();
		Out.In in = out.new In();
		in.print();
		
	}

	public class Heart {
		public void test() {
			System.out.println("blood:"+blood);
		}
	}
	
	public class Brain {
		/** 访问外部类的私有成员 */
		public void test() {
			System.out.println(blood);
		}
	}
}

// 应用举例:
class Out {
    private int age = 12;
     
    //内部类
    class In {
        public void print() {
            System.out.println(age);
        }
    }
}
