package Class;

public class InitialPhone {
	public static void main( String[] args ) {
		Phone p = new Phone();
		p.cpu = 5f;
		p.getID();
		p.setID(5);
		p.sendMessage();
		p.call();
		
		System.out.println(p.toString());
		
		Phone p2 = new Phone(1, 2, 3);
		p2.call();
		
	}
	
}
