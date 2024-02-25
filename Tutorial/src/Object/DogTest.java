package Object;

public class DogTest {
	public static void main(String[] args) {
		Dog dog1 = new Dog("dog1");
		Dog dog2 = new Dog("dog2");
		
//		dog1.eat();
//		dog2.eat();
		dog1.printDogInfo();
		dog2.printDogInfo();
//		dog1.getHasName();
//		dog2.getHasName();
		dog1.setHasName(true);
		dog2.getHasName();
	}
}
