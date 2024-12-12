package lt.ca.javau11.piceria;

import java.util.HashMap;
import java.util.List;

public interface PicaMeniu {

	void seedDummyData();

	List<Pizza> getAllPizzas();

	List<Pizza> filtruotiPagalKaina(double min, double max);
	
	Pizza rastiPica(String pavadinimas);
	
	boolean atnaujintiPica(String pavadinimas, Pizza naujaPica);
	
    List<Pizza> rastiVienodasKonkurentoPicas();
	
}
