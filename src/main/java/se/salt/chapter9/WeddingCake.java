package se.salt.chapter9;

public class WeddingCake extends Cake {

    protected int tiers;

    public WeddingCake() {
        super("Chocolate", 500);
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
