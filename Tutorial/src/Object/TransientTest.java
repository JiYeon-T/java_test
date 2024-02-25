package Object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class TransientTest {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//        People lilei = new People("李雷", 30);
//        System.out.println(lilei); //打印对象的值
//        // write
//        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("d://people.txt"));
//        os.writeObject(lilei);//写入文件(序列化)
//        os.close();
//
//        // read
//        People peopleRead;
//        ObjectInputStream is = new ObjectInputStream(new FileInputStream("d://people.txt"));
//        peopleRead = (People)is.readObject();//将文件数据转换为对象（反序列化）
//        System.out.println(peopleRead); // 年龄 数据未定义
//        is.close();
    }
}


//定义一个需要序列化的类
//class People implements Serializable{
//    /** 会被序列化 */
//    String name; //姓名
//    /** 不会被序列化 */
//    transient Integer age; //年龄
//    public People(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    public String toString(){
//        return "姓名 = "+name+" ,年龄 = "+age;
//    }
//
//}

