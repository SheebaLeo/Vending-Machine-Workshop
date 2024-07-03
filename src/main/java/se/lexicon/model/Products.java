package se.lexicon.model;

public interface Products {

    public abstract String examine();

    public abstract String use();

    public int getId();

    public String getProductName();

    public void setProductName(String productName);

    public double getPrice();

    public void setPrice(double price);
}
