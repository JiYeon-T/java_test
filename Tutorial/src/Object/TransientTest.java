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
//        People lilei = new People("����", 30);
//        System.out.println(lilei); //��ӡ�����ֵ
//        // write
//        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("d://people.txt"));
//        os.writeObject(lilei);//д���ļ�(���л�)
//        os.close();
//
//        // read
//        People peopleRead;
//        ObjectInputStream is = new ObjectInputStream(new FileInputStream("d://people.txt"));
//        peopleRead = (People)is.readObject();//���ļ�����ת��Ϊ���󣨷����л���
//        System.out.println(peopleRead); // ���� ����δ����
//        is.close();
    }
}


//����һ����Ҫ���л�����
//class People implements Serializable{
//    /** �ᱻ���л� */
//    String name; //����
//    /** ���ᱻ���л� */
//    transient Integer age; //����
//    public People(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    public String toString(){
//        return "���� = "+name+" ,���� = "+age;
//    }
//
//}

