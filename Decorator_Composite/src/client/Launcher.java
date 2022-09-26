package client;

import composite.Composite;
import composite.Leaf;
import decoratorComputer.Computer;
import decoratorComputer.IComputer;
import thingsComputer.DedicatedGraphics;
import thingsComputer.ExtensionRAM;
import thingsComputer.ExtensionSSD;
import thingsComputer.LiquidRefrigeration;

/**
 * Implement composite and decorator pattern
 * @author juliancape
 * @since 26-09-2022 
 */

public class Launcher {
	public static void main(String[] args) {
		
		System.out.println("*****COMPUTER STORE*****");
		
		//Personalize the computer with decorator pattern
		IComputer selectComputer1 = new Computer();
		selectComputer1 = new DedicatedGraphics(selectComputer1);
		selectComputer1 = new ExtensionRAM(selectComputer1);
		selectComputer1 = new ExtensionSSD(selectComputer1);
		selectComputer1 = new LiquidRefrigeration(selectComputer1);
		
		//Make a combo of products with the composite pattern
		Composite combo = new Composite();
		//The Leaf has --> Leaf(price, name)
		Leaf computer = new Leaf(1500, selectComputer1.personalize());
		Leaf mouse = new Leaf(50, "Mouse");
		Leaf screen = new Leaf(300, "Screen");
		Leaf keyBoard = new Leaf(500, "KeyBoard");
		
		//Add kids to the tree of products
		combo.kids.add(computer);
		combo.kids.add(mouse);
		combo.kids.add(screen);
		combo.kids.add(keyBoard);
		
		//Execute the operation of the composite pattern
		System.out.println("Specifications of the computer: "+computer.name);
		System.out.println("Price of the computer: "+ computer.price);
		System.out.println("Extras: \n"+ mouse.name+ " $"+mouse.price);
		System.out.println(screen.name+ " $"+screen.price);
		System.out.println(keyBoard.name+ " $"+keyBoard.price);
		System.out.println("The price of the combo: $"+combo.execute());
        
       
	}

}
