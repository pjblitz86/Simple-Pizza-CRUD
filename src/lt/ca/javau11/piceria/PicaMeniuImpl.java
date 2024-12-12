package lt.ca.javau11.piceria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PicaMeniuImpl implements PicaMeniu{

	List<Pizza> pizzas = new ArrayList<>();
	Map<Integer, Pizza> pizzas2 = new HashMap<>();

	@Override
	public void seedDummyData() {
		// our pizzas
		Pizza margaritaM = new Pizza("Margarita", PizzaSize.MEDIUM, 5.99);
		Pizza margaritaL = new Pizza("Margarita", PizzaSize.LARGE, 7.99);
		Pizza pepperoniL = new Pizza("Pepperoni", PizzaSize.LARGE, 8.49);
		Pizza vegetarianS = new Pizza("Vegetarian", PizzaSize.SMALL, 3.99);
		Pizza havajuM = new Pizza("Havaju", PizzaSize.MEDIUM, 5.49);
		Pizza studentuL = new Pizza("Studentu", PizzaSize.LARGE, 6.99);
		pizzas.addAll(List.of(margaritaM, margaritaL, pepperoniL, vegetarianS, havajuM, studentuL));
		
		// competitor pizzas
		pizzas2.put(1, new Pizza("Margarita", PizzaSize.MEDIUM, 5.99));
        pizzas2.put(2, new Pizza("Pepperoni", PizzaSize.MEDIUM, 6.99));
        pizzas2.put(3, new Pizza("Vegetarian", PizzaSize.SMALL, 7.99));
        pizzas2.put(4, new Pizza("BBQ Chicken", PizzaSize.MEDIUM, 6.99));
        pizzas2.put(5, new Pizza("Hawaiian", PizzaSize.LARGE, 8.99));
        pizzas2.put(6, new Pizza("Four Cheese", PizzaSize.SMALL, 5.49));
		
	}

	@Override
	public List<Pizza> getAllPizzas() {
		return pizzas;
	}

	@Override
	public List<Pizza> filtruotiPagalKaina(double min, double max) {
		List<Pizza> filteredPizzas = new ArrayList<>();
		
		for(Pizza pizza : pizzas) {
			if(pizza.getPrice() >= min && pizza.getPrice() <= max)
				filteredPizzas.add(pizza);
		}
		
		return filteredPizzas;
	}

	@Override
	public Pizza rastiPica(String pavadinimas) {
		for(Pizza pizza : pizzas) {
			if(pizza.getName().equalsIgnoreCase(pavadinimas))
				return pizza;
				
		}
		return null;
	}

	@Override
	public boolean atnaujintiPica(String pavadinimas, Pizza naujaPica) {
		Pizza rastaPica = rastiPica(pavadinimas);
		if (rastaPica == null) 
			return false;
		
		if (pizzas.set(pizzas.indexOf(rastaPica) , naujaPica) != null)
			return true;
		
		return false;
	}

	@Override
	public List<Pizza> rastiVienodasKonkurentoPicas() {
		List<Pizza> vienodosPicos = new ArrayList<>();
		
		for (Map.Entry<Integer, Pizza> entry : pizzas2.entrySet()) {
			for(Pizza pizza : pizzas) {
			  if (entry.getValue().equals(pizza))
				  vienodosPicos.add(pizza);
			}
        }
		
		return vienodosPicos;
	}
	
	

}
