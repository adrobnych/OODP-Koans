package com.tdl.badcode;

import java.util.ArrayList;
import java.util.List;

// pre composite

// CR:
// 	add mastermenu
// 	add submenu
// 	add description to Menu which will returns all sublying disches names and submenus sublying dishes and so on...
// 

class Dish{
	
	String name;
	String description;
	
	String getName(){
		return name;
	}
	
	String getDescription(){
		return description;
	}
}

class Menu{
	
	List<Dish> dishes = new ArrayList<>();
	String name;
	
	String getName(){
		return name;
	}
	
}


public class SimpleMenu1 {


	public static void main(String[] args) {
		Menu fastfood = new Menu();
		fastfood.dishes.add(new Dish());
		fastfood.dishes.add(new Dish());
		fastfood.dishes.add(new Dish());
		
		Menu ukrainian = new Menu();
		ukrainian.dishes.add(new Dish());
		ukrainian.dishes.add(new Dish());
	}

}
