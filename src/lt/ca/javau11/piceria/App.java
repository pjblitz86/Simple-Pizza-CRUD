package lt.ca.javau11.piceria;


public class App {

	public static void main(String[] args) {

		Picerija picerija = new PicerijaImpl();
		picerija.start();
		
		// test
//		Pizza pizza = new Pizza("Margarita", PizzaSize.MEDIUM, 5.99);
//		System.out.println(pizza);

	}

}
