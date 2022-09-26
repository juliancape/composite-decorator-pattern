
package composite;

import java.util.ArrayList;

/**
 * Composite class 
 * @author juliancape
 * @since 26-09-2022 
 */
public class Composite extends Component {
 
    public Composite(int price, String name){
        super(price, name);
    }
    
    public Composite(){
        super(0, "");
    }
    public ArrayList<Component> kids = new ArrayList();
    
    public int execute(){
    	
        price =0;
        for (Component component : kids) {
			price += component.execute();
			
		}
        
       
        return price;
    }

	@Override
	public String toString() {
		return "Composite [hijos=" + kids + "]";
	}
    
}