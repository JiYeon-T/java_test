
package inherit;

public class Animal {
	
	public Animal() {}
	public Animal(String name, String food, String fork) {
		this.name = name;
		this.food = food;
		this.fork = fork;
	}
	public String name;
	public String food;
	private String fork;
	
	public void eat() {
		System.out.println(name + " eat some " + food + ".");
	}

	public void move(){
		System.out.println( name + " is running." );
	}
	
}
