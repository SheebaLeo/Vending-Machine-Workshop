package se.lexicon.model;

public class Chocalate implements Products{

    private int id;
    private double price;
    private String productName;
    private String type;

    public Chocalate(int id, double price, String productName, String type) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.type = type;
    }

    @Override
    public String examine() {
        return "Product id: " + getId() + ", " + "Product Name: " + getProductName() + ", " +  "Price: " + getPrice() +
                ", " + "Type: " + this.type;
    }

    @Override
    public String use() {
        return "Product Name: " + getProductName() + ", " + "Type: " + this.type;
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
}
