package thingsComputer;
import decoratorComputer.DecoratorComputer;
import decoratorComputer.IComputer;

/**
 * 
 * @author juliancape
 * @since 26-09-2022 
 */
public class ExtensionSSD extends DecoratorComputer{
	
	public ExtensionSSD(IComputer computer) {
		super(computer);
	}

	public String personalize() {
		return super.computer.personalize() +decorateSSD();
	}
	
	public String decorateSSD() {
		return "with 1TB SSD extension ";
	}
	
}
