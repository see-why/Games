package test;

public class checkLogic {

	public static void main(String[] args) {
		Animal[] animals = {new Cat("winston"), new Cat("carl"), new Tiger("sher khan")};
		
		for (Animal cat: animals) {
			System.out.println(cat);		
			System.out.println(Cat.FOOD);
			System.out.println(Cat.getCount());
			cat.eat();
			System.out.println();
			System.out.println();
		}
	}

}
