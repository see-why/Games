package test;

public class Tiger extends Cat {
	public Tiger(String name) {
		super(name);
	}
	
	@Override
	public void eat() {
		System.out.printf("A %s(Animal): eating", this);
	}
	
	public String toString() {
		return String.format("Tiger: [id: %d, name: %s]", id, name);
	}

}
