package abstraction;

public class Puma implements Animal {

	@Override
	public void eat() {
		System.out.println("Puma eats the meats");
		
	}

	@Override
	public void sleep() {
		System.out.println("Puma sleeps in the day");
		
	}

	@Override
	public void poop() {
		System.out.println("Puma poops in cave");
		
	}

}
