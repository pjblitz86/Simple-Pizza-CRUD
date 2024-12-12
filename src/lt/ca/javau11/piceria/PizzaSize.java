package lt.ca.javau11.piceria;

public enum PizzaSize {
	SMALL(20, "Maža"),
    MEDIUM(25, "Vidutinė"),
    LARGE(30, "Didelė");

    private int diameter; // Skersmuo centimetrais
    private String description; // Žmogui suprantamas dydžio aprašymas

    private PizzaSize(int diameter, String description) {
		this.diameter = diameter;
		this.description = description;
	}

	public int getDiameter() {
        return diameter;
    }

	@Override
    public String toString() {
        return diameter + " cm dydzio: " + description; 
    }
}