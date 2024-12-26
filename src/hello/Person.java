package hello;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		this.name = "?";
		this.age = 0;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void sayHello() {
		System.out.println("Hello " + name);
	}
	
	public String toString() {
		return  String.format("name: %s, age: %d", this.name, this.age);
	}
}
