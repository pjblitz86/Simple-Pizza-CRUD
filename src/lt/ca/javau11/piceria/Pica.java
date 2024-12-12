package lt.ca.javau11.piceria;

import java.util.Objects;

// DTO - Data Transfer Obj
public class Pica {

	private String name;
	private PizzaSize size;
	private double price;
	
	public Pica(String name, PizzaSize size, double price) {
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
		Pica other = (Pica) obj;
		return Objects.equals(name, other.name) && size == other.size;
	}

	@Override
	public String toString() {
		return "Pica: " + name + ", " + size + ", kaina: " + price + " eur";
	}
	
}
