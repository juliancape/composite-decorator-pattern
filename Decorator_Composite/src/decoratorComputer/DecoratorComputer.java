package decoratorComputer;

/**
 * Decorator abstract class
 * @author juliancape
 * @since 26-09-2022 
 */
public abstract class DecoratorComputer implements IComputer{
	
	protected IComputer computer;
	
	public DecoratorComputer(IComputer c) {
		this.computer = c;
	}
	

	public abstract String personalize();
	
}
