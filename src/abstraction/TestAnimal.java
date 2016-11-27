package abstraction;

public class TestAnimal {

	public static void main(String[] args) {
		Chicken chicken = new Chicken();
		chicken.poop();
		chicken.layEgg();
		
		
		Animal puma = new Puma();
		puma.sleep();
		
		Animal hen = new Hen();
		hen.eat();

	}

}
