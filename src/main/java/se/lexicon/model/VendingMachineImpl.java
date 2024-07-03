package se.lexicon.model;

import java.util.Arrays;
import java.util.List;

public class VendingMachineImpl implements VendingMachine {

    private Product[] products;

    private int depositPool;

    public VendingMachineImpl(Product[] products) {
        this.products = products;
    }

        private static final List<Integer> ACCEPTED_VALUES = Arrays.asList(1, 2, 5, 10, 20, 50, 100, 200, 500, 1000);


    @Override
    public void addCurrency(double amount) {
        int amountTOAdd = (int) Math.round(amount);
        if (ACCEPTED_VALUES.contains(amountTOAdd)) {
            depositPool += amountTOAdd;
        } else {
            throw new IllegalArgumentException("Numbers should be 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000");
        }
    }

    @Override
    public int getBalance() {
        int balance = 0;
        if(depositPool > 0) {
            balance = depositPool;
        }
        return balance;
    }

    @Override
    public Product request(int id) {
        if(id < 0) {
            throw new IllegalArgumentException("Id should not be less than 0");
        }
        for (Product product : products) {
            if (product.getId() == id && product.getPrice() <= depositPool) {
                depositPool = depositPool - (int) product.getPrice();
                return product;
            }
            if(product.getPrice() > depositPool){
                throw new IllegalArgumentException("Balance insufficient");
            }
        }
        return null;
    }

    @Override
    public int endSession() {
        int session = depositPool;
        depositPool = 0;
        return session;
    }

    @Override
    public String getDescription(int id) {
        String description = "";
        for (Product product : products) {
            if(product.getId() == id) {
                description = product.examine();
            }
        }

        return description;
    }

    @Override
    public String[] getProducts() {
        String[] productStrings = new String[products.length];
        for (int i = 0; i < products.length; i++) {

                productStrings[i] = "id:" + products[i].getId() + ", " + "Product Name: " + products[i].getProductName() +
                        "Price" + ", " + products[i].getPrice();
            }
        return productStrings;
    }
}
