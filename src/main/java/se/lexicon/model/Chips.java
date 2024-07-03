package se.lexicon.model;

public class Chips extends Product {

    private String flavor;

    private boolean isPotatoChip;

    public Chips(int id, double price, String productName, String flavor, boolean isPotatoChip) {
        super(id, price, productName);
        this.flavor = flavor;
        this.isPotatoChip = isPotatoChip;
    }

    @Override
    public String examine() {
        return "Product id: " + getId() + ", " + "Product Name: " + getProductName() + ", " +  "Price: " + getPrice() +
                ", " + "Flavor: " + this.flavor + ", " + "Is Potato Chip: " + isPotatoChip;
    }

    @Override
    public String use() {
        return "Product Name: " + getProductName() + ", " + "Flavor: " + this.flavor;
    }
}
