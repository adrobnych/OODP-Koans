package com.tdl.oodpkoans.behavioral.visitor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tdl.oodpkoans.COUT;
import com.tdl.oodpkoans.TDLKoan;

interface CarElementVisitor {
    void visit(Wheel wheel);
    void visit(Engine engine);
    void visit(Body body);
    void visit(Car car);
}
 
interface CarElement {
    void accept(CarElementVisitor visitor); // CarElements have to provide accept().
}
 
class Wheel implements CarElement {
    private String name;
 
    public Wheel(String name) {
        this.name = name;
    }
 
    public String getName() {
        return this.name;
    }
 
    public void accept(CarElementVisitor visitor) {
        /*
         * accept(CarElementVisitor) in Wheel implements
         * accept(CarElementVisitor) in CarElement, so the call
         * to accept is bound at run time. This can be considered
         * the first dispatch. However, the decision to call
         * visit(Wheel) (as opposed to visit(Engine) etc.) can be
         * made during compile time since 'this' is known at compile
         * time to be a Wheel. Moreover, each implementation of
         * CarElementVisitor implements the visit(Wheel), which is
         * another decision that is made at run time. This can be
         * considered the second dispatch.
         */ 
        visitor.visit(this);
    }
}
 
class Engine implements CarElement {
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
 
class Body implements CarElement {
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
 
class Car implements CarElement {
    CarElement[] elements;
 
    public Car() {
        //create new Array of elements
        this.elements = new CarElement[] { new Wheel("front left"), 
            new Wheel("front right"), new Wheel("back left") , 
            new Wheel("back right"), new Body(), new Engine() };
    }
 
    public void accept(CarElementVisitor visitor) {     
        for(CarElement elem : elements) {
            elem.accept(visitor);
        }
        visitor.visit(this);    
    }
}
 
class CarElementPrintVisitor implements CarElementVisitor {
    public void visit(Wheel wheel) {      
        COUT.println("Visiting " + wheel.getName() + " wheel");
    }
 
    public void visit(Engine engine) {
        COUT.println("Visiting engine");
    }
 
    public void visit(Body body) {
        COUT.println("Visiting body");
    }
 
    public void visit(Car car) {      
        COUT.println("Visiting car");
    }
}
 
class CarElementDoVisitor implements CarElementVisitor {
    public void visit(Wheel wheel) {
        COUT.println("Kicking my " + wheel.getName() + " wheel");
    }
 
    public void visit(Engine engine) {
        COUT.println("Starting my engine");
    }
 
    public void visit(Body body) {
        COUT.println("Moving my body");
    }
 
    public void visit(Car car) {
        COUT.println("Starting my car");
    }
}
 
public class Koan extends TDLKoan{	

	@Test
	public void talk_to_master(){
		Car car = new Car();
        car.accept(new CarElementPrintVisitor());
        assertEquals(___, COUT.getLastLines(5));
        car.accept(new CarElementDoVisitor());
        assertEquals(___, COUT.getLastLines(5));
	}

}
