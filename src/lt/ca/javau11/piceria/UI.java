package lt.ca.javau11.piceria;

import java.util.List;

public interface UI {

	void printPizzaList(List<Pizza> pizzas);
	void printFoundPizza(Pizza pizza);
	void printPizzaUpdated(boolean updateStatus);
}
