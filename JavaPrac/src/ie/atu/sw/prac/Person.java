package ie.atu.sw.prac;

public class Person implements Humanoid{
	private String name = "default";
	private int age = 10; 
	
	private Dog dog;
	
	Humanoid h1 = new Person();
	
	public Person() {
		dog.poop();
	}
	
	public Person(int age, String name) {
		this.name = name;
		this.age = age;
	} 
	
	//visibility (private), return type, method name, parameters
	public String getName() {
		 return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void breathe() {
		System.out.println("person is breathing");
	}
	

	
}
