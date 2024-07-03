package se.lexicon.model;

public class Drinks extends Product {

    private double quantity;

    private boolean isCarbonated;

    public Drinks(int id, double price, String productName, double quantity, boolean isCarbonated) {
        super(id, price, productName);
        this.quantity = quantity;
        this.isCarbonated = isCarbonated;
    }

    @Override
    public String examine() {
        return "Product id: " + getId() + ", " + "Product Name: " + getProductName() + ", " +  "Price: " + getPrice() +
                ", " + "Quantity: " + this.quantity + ", " + "Is Carbonated: " + isCarbonated;
    }

    @Override
    public String use() {
        return "Product Name: " + getProductName() + ", " + "Quantity: " + this.quantity;
    }
}
