package lt.ca.javau11.piceria;

import java.util.List;

public class PicerijaImpl implements Picerija {

	PicaMeniu menu = new PicaMeniuImpl();
	UI ui = new UiImpl();
	private double minPrice = 3.00;
	private double maxPrice = 7.00;
	
	@Override
	public void start() {
		seedDummyData();
		showAllPicas();
		filterByPrice(minPrice, maxPrice);
		findByName("Havaju");
		
		Pizza newPizza = new Pizza("Kaimiska", PizzaSize.LARGE, 6.49);
		updatePizza("Havaju", newPizza);
		showAllPicas();
		
		findMatchingPizzasList();
	}

	private void seedDummyData() {
		menu.seedDummyData();
	}
	
	private void showAllPicas() {
		List<Pizza> pizzas =  menu.getAllPizzas();
		ui.printPizzaList(pizzas);
		
	}
	
	private void filterByPrice(double minPrice, double maxPrice) {
		List<Pizza> filteredPizzas = menu.filtruotiPagalKaina(minPrice, maxPrice);
		ui.printPizzaList(filteredPizzas);
	}
	
	private void findByName(String name) {
		Pizza rastaPica = menu.rastiPica(name);
		ui.printFoundPizza(rastaPica);
	}
	
	private void updatePizza(String name, Pizza newPizza) {
		boolean isUpdated = menu.atnaujintiPica(name, newPizza);
		ui.printPizzaUpdated(isUpdated);
	}
	
	private void findMatchingPizzasList(){
		List<Pizza> sutampanciosPicos =	menu.rastiVienodasKonkurentoPicas();
		ui.printPizzaList(sutampanciosPicos);
	}
	

}
