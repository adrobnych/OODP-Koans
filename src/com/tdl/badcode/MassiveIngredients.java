package com.tdl.badcode;

import com.tdl.oodpkoans.creational.abstract_factory.Cheese;
import com.tdl.oodpkoans.creational.abstract_factory.Clams;
import com.tdl.oodpkoans.creational.abstract_factory.Dough;
import com.tdl.oodpkoans.creational.abstract_factory.FreshClams;
import com.tdl.oodpkoans.creational.abstract_factory.Garlic;
import com.tdl.oodpkoans.creational.abstract_factory.MarinaraSauce;
import com.tdl.oodpkoans.creational.abstract_factory.Mushroom;
import com.tdl.oodpkoans.creational.abstract_factory.Onion;
import com.tdl.oodpkoans.creational.abstract_factory.Pepperoni;
import com.tdl.oodpkoans.creational.abstract_factory.Pizza;
import com.tdl.oodpkoans.creational.abstract_factory.RedPepper;
import com.tdl.oodpkoans.creational.abstract_factory.ReggianoCheese;
import com.tdl.oodpkoans.creational.abstract_factory.Sauce;
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
		dough = (new NYDoughIngredientFactory()).createDough();
		sauce = (new NYSauceIngredientFactory()).createSauce();
		cheese = (new NYCheeseIngredientFactory()).createCheese();
		veggies = (new NYVeggiesIngredientFactory()).createVeggies();
		pepperoni = (new NYPepperoniIngredientFactory()).createPepperoni();
		}
	}
}


class NYDoughIngredientFactory {

	public Dough createDough() {
		return new ThinCrustDough();
	}
}

class NYSauceIngredientFactory {

	public Sauce createSauce() {
		return new MarinaraSauce();
	}
}

class NYCheeseIngredientFactory {

	public Cheese createCheese() {
		return new ReggianoCheese();
	}
}

class NYVeggiesIngredientFactory {

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
}

class NYPepperoniIngredientFactory  {

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
}

class NYClamsIngredientFactory  {    // franchise city plus ingredient variation cause combinatoric explosion

	public Clams createClam() {
		return new FreshClams();
	}
}



public class MassiveIngredients {

	public static void main(String[] args) {

		(new PepperoniPizza("New York")).prepare();

	}

}
