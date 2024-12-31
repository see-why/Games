package test;

public class Cat extends Animal {
	protected String name;
	public final static String FOOD;
	private static int count;
	public int id;
	
	static {
		FOOD = "Butt rats";
		count = 0;
	}
 
	public Cat(String name) {
		this.name = name;
		count++;
		id = count;
	}

	@Override
	public String toString() {
		return String.format("Cat: [id: %d, name: %s]", id, name);
	}

	public static int getCount() {
		return count;
	}
}
