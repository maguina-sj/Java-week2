import java.util.ArrayList;
public class OrderTest {
    public static void main(String[] args) {
    
        // Menu items
        Item fries = new Item("fries", 2.5);
        Item doubleDouble = new Item("double-double", 4.5);
        Item milkshake = new Item("milkshake", 2.0);
        Item animalFries = new Item("animalFries", 3.0);
    
        // Order variables -- order1, order2 etc.
        Order stephsOrder= new Order();
        stephsOrder.name = "steph";
        System.out.println(stephsOrder.total);
        Order marcsOrder = new Order();
        marcsOrder.name = "marc";
        Order limasOrder = new Order();
        limasOrder.name = "lima";
        Order jazzysOrder = new Order();
        jazzysOrder.name = "jazzy";

    
        // Application Simulations
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}
