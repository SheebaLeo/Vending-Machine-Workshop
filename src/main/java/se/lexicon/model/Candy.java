package se.lexicon.model;

public class Candy extends Product {

    private String type;

    private boolean isJelly;

    public Candy(int id, double price, String productName, String type, boolean isJelly) {
        super(id, price, productName);
        this.type = type;
        this.isJelly = isJelly;
    }

    @Override
    public String examine() {
        return "Product id: " + getId() + ", " + "Product Name: " + getProductName() + ", " +  "Price: " + getPrice() +
                ", " + "Type: " + this.type + ", " + "Is Jelly: " + isJelly;
    }

    @Override
    public String use() {
        return "Product Name: " + getProductName() + ", " + "Type: " + this.type;
    }
}
