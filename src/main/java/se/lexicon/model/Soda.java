package se.lexicon.model;

public class Soda implements Products {

    private int id;
    private double price;
    private String productName;
    private int quantity;

    public Soda(int id, double price, String productName, int quantity) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String examine() {
        return "Product id: " + getId() + ", " + "Product Name: " + getProductName() + ", " +  "Price: " + getPrice() +
                ", " + "Quantity: " + this.quantity;
    }

    @Override
    public String use() {
        return "Product Name: " + getProductName() + ", " + "Quantity: " + this.quantity;
    }
}
