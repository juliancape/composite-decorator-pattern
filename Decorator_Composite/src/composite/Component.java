
package composite;

/**
 * Component abstract class
 * @author juliancape
 * @since 26-09-2022 
 */
public abstract class Component {
    public int price;
    public String name;
    
    public Component(int price, String name){
        this.price=price;
        this.name=name;
    }
    public abstract int execute();
}
