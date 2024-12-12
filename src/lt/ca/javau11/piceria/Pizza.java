package lt.ca.javau11.piceria;

import java.util.Objects;

// DTO - Data Transfer Obj
public class Pizza {

	private String name;
	private PizzaSize size;
	private double price;
	
	public Pizza(String name, PizzaSize size, double price) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(name, size);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pizza other = (Pizza) obj;
		return Objects.equals(name, other.name) && size == other.size;
	}

	@Override
	public String toString() {
		return "Pica: " + name + ", " + size + ", kaina: " + price + " eur";
	}
	
}
