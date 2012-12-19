package com.tdl.badcode;

import java.util.ArrayList;
import java.util.List;

// pre composite

// CR:
// 	add mastercatalog
// 	add subcatalogs
// 	add description to Catalog which will returns all sublying products names and subcatalogs sublying products and so on...
// 

class Product{
	
	String name;
	String description;
	
	String getName(){
		return name;
	}
	
	String getDescription(){
		return description;
	}
}

class Catalog{
	
	List<Product> products = new ArrayList<>();
	String name;
	
	String getName(){
		return name;
	}
	
}


public class Rozetka {


	public static void main(String[] args) {
		Catalog computers = new Catalog();
		computers.products.add(new Product());
		computers.products.add(new Product());
		computers.products.add(new Product());
		
		Catalog sport = new Catalog();
		sport.products.add(new Product());
		sport.products.add(new Product());
	}

}
