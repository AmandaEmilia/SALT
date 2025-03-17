package se.salt.chapter9;

public class Cake {

    protected String flavor;

    protected int price;

    public Cake(String flavor, int price) {
        this.flavor = flavor;
        this.price = price;
    }

    public Cake() {
        setFlavor("Strawberry");
        setPrice(200);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
