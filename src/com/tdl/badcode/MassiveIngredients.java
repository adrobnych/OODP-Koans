package com.tdl.badcode;

import com.tdl.oodpkoans.creational.abstract_factory.Garlic;
import com.tdl.oodpkoans.creational.abstract_factory.MarinaraSauce;
import com.tdl.oodpkoans.creational.abstract_factory.Mushroom;
import com.tdl.oodpkoans.creational.abstract_factory.Onion;
import com.tdl.oodpkoans.creational.abstract_factory.Pizza;
import com.tdl.oodpkoans.creational.abstract_factory.RedPepper;
import com.tdl.oodpkoans.creational.abstract_factory.ReggianoCheese;
import com.tdl.oodpkoans.creational.abstract_factory.SlicedPepperoni;
import com.tdl.oodpkoans.creational.abstract_factory.ThinCrustDough;
import com.tdl.oodpkoans.creational.abstract_factory.Veggies;

class PepperoniPizza extends Pizza {
	String city;
 
	public PepperoniPizza(String city) {
		name = "Pepperoni in NY";
		this.city = city;
	}
 
	public void prepare() {
		if(city.equals("New York")){
			System.out.println("Preparing " + name);
			dough = new ThinCrustDough();
			sauce = new MarinaraSauce();
			cheese = new ReggianoCheese();
			veggies = new Veggies[]{ new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
			pepperoni = new SlicedPepperoni();
		}
		if(city.equals("Chicago")){
			System.out.println("Preparing " + name);
//			dough = new ChicagoDough();
//			sauce = new SuperSauce();
//			cheese = new BlueCheese();
//			veggies = new Veggies[]{ new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
//			pepperoni = new OtherPepperoni();
		}
		
		//...
	}
}




public class MassiveIngredients {

	public static void main(String[] args) {

		(new PepperoniPizza("New York")).prepare();

	}

}
