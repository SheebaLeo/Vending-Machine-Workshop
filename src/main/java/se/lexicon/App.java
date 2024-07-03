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

        //create instance for class
        Candy chocolateBar = new Candy(1, 10.00, "kex", "Bar Choclate", false);
        Candy gummyBear = new Candy(2, 9.00, "Gummy Bear", "Jelly", true);
        Drinks soda = new Drinks(3, 15.00, "7 Up", 1, true);
        Drinks juice = new Drinks(4, 20.00, "Apple Juice", 1.5, false);
        Chips potatoChips = new Chips(5, 30.00, "Potato Chips", "creamy onion", true);
        Chips cheeseBalls = new Chips(6, 40.00, "Cheese Balls", "cheese", false);

        //create product array
        Product[] products = new Product[6];
        products[0] = chocolateBar;
        products[1] = gummyBear;
        products[2] = soda;
        products[3] = juice;
        products[4] = potatoChips;
        products[5] = cheeseBalls;

        VendingMachineImpl vendingMachine = new VendingMachineImpl(products);

        //add currency
        vendingMachine.addCurrency(100);
        System.out.println("Balance after adding Currency : " + vendingMachine.getBalance());

        //request and balance
        System.out.println("Product bought: " + vendingMachine.request(2).examine());
        System.out.println("Balance after bought product1: " + vendingMachine.getBalance());
        System.out.println("Buying product2: " + vendingMachine.request(6).use());

        //end session and balance
        System.out.println("Ending the session: " + vendingMachine.endSession());
        System.out.println("Balance after ending the session: " + vendingMachine.getBalance());

        //get description
        System.out.println("Description of the product: " + vendingMachine.getDescription(5));

        //get products
        System.out.println("Product Details: " + Arrays.toString(vendingMachine.getProducts()));

        //Interface create the instance for implement class
        Soda pepsi = new Soda(1, 20.00, "pepsi", 1);
        Chocalate snickers = new Chocalate(2, 15.00, "Snickers", "Bar chocolate");

        //get product details in interface
        System.out.println("Pepsi class: " + pepsi.examine());
        System.out.println("snickers class: " + snickers.examine());
    }
}
