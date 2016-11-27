package abstraction;

public class Chicken implements Animal {

	@Override
	public void eat() {
		System.out.println("Chicken eats grain");

	}

	@Override
	public void sleep() {
		System.out.println("Chicken sleeps at night");

	}

	@Override
	public void poop() {
		System.out.println("Chicken poops in coop");
			

	}
	
	public void layEgg() {
		System.out.println("Chicken lays egg.");
	}

}
