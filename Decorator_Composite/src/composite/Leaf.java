
package composite;

/**
 * Leaf class
 * @author juliancape
 * @since 26-09-2022 
 */
public class Leaf extends Component{

    public Leaf(int price, String name){
        super(price, name);
    }
    @Override
    public int execute() {
        return price;
    }
    
    
}
