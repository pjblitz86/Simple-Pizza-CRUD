package lt.ca.javau11.piceria;

import java.util.List;

public class UiImpl implements UI {

	@Override
	public void printPizzaList(List<Pizza> pizzas) {
		System.out.println("Picu sarasas");
		System.out.println("-".repeat(20));
		for(Pizza pizza : pizzas) {
			System.out.println(pizza);
		}
		System.out.println("-".repeat(20));
		
	}

	@Override
	public void printFoundPizza(Pizza pizza) {
		System.out.println("Rasta pica: " + pizza);
		System.out.println("-".repeat(20));
	}

	@Override
	public void printPizzaUpdated(boolean updateStatus) {
		System.out.println(updateStatus? "Successfully updated" : "No such pizza found to update");
	}
	
}
