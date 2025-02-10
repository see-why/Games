package test;

public class checkLogic {
	public static void main(String[] args) {
		Animal[] animals = {new Cat("winston"), new Cat("carl"), new Tiger("sher khan")};

		Animal a1 = new Cat("sam");
		Cat a2 = (Cat)a1;
		a2.eat();
		
		for (Animal cat: animals) {
			System.out.println(cat);		
			System.out.println(Cat.FOOD);
			System.out.println(Cat.getCount());
			cat.eat();
			System.out.println();
			System.out.println();
		}
		
		Array<Cat> cats = new Array<>(5);
		cats.add(a2);
		cats.add(new Cat("miguel"));
		
		Cat cat1 = cats.get(0);
		System.out.println(cat1);	
		Cat cat2 = cats.get(1);
		System.out.println(cat2);	
	}

}
