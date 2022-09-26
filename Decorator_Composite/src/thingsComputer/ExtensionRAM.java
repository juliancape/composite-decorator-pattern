package thingsComputer;

import decoratorComputer.DecoratorComputer;
import decoratorComputer.IComputer;

/**
 * ExtensionRAM class
 * @author juliancape
 * @since 26-09-2022 
 */
public class ExtensionRAM extends DecoratorComputer{
	
	public ExtensionRAM(IComputer computer) {
		super(computer);
	}

	public String personalize() {
		return super.computer.personalize() +decorateRAM();
	}
	
	public String decorateRAM() {
		return "with RAM extension ";
	}
	
}
