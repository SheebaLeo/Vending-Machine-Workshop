package se.lexicon;

import se.lexicon.model.*;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Candy chocolateBar = new Candy(1, 10.00, "kex", "Bar Choclate", false);
        Candy gummyBear = new Candy(2, 9.00, "Gummy Bear", "Jelly", true);
        Drinks soda = new Drinks(3, 15.00, "7 Up", 1, true);
        Drinks juice = new Drinks(4, 20.00, "Apple Juice", 1.5, false);
        Chips potatoChips = new Chips(5, 30.00, "Potato Chips", "creamy onion", true);
        Chips cheeseBalls = new Chips(6, 40.00, "Cheese Balls", "cheese", false);

        Product[] products = new Product[6];
        products[0] = chocolateBar;
        products[1] = gummyBear;
        products[2] = soda;
        products[3] = juice;
        products[4] = potatoChips;
        products[5] = cheeseBalls;


        VendingMachineImpl vendingMachine = new VendingMachineImpl(products);
        System.out.println(products[0].examine());

        vendingMachine.addCurrency(100);
        System.out.println(vendingMachine.getBalance());

        System.out.println(vendingMachine.request(2).examine());
        System.out.println(vendingMachine.getBalance());
        System.out.println(vendingMachine.endSession());
       // System.out.println(vendingMachine.getBalance());

        System.out.println(vendingMachine.getDescription(5));
        System.out.print("Product Details: " + Arrays.toString(vendingMachine.getProducts()));

    }
}
