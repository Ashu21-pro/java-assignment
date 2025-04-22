
public class Person3 {
	
	
	String name;
	int age;
	
	public Person3(String name, int age) {
	
		this.name = name;
		this.age = age;
		
	}
	
	public void display() {
		
		System.out.println("the name is :"+name);
		System.out.println("the age is :"+age);
	}
	
	public static void main(String args[]) {
		
		Person3 p1 = new Person3("ashitosh",20);
		Person3 p2 = new Person3("om",22);
		
		p1.display();
		p2.display();
	}
	
	
	

}
