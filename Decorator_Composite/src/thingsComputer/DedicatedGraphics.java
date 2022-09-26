package thingsComputer;

import decoratorComputer.DecoratorComputer;

import decoratorComputer.IComputer;

/**
 * DedicatedGraphics class
 * @author juliancape
 * @since 26-09-2022 
 */
public class DedicatedGraphics extends DecoratorComputer{
	
	public DedicatedGraphics(IComputer computer) {
		super(computer);
	}

	public String personalize() {
		return super.computer.personalize() +decorateGraphics();
	}
	
	public String decorateGraphics() {
		return "with dedicated graphics ";
	}
	
}
