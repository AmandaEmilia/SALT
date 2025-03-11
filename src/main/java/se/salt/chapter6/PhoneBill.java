package se.salt.chapter6;

public class PhoneBill {

    private int id;

    private int price;

    private int includedMinutes;

    private int usedMinutes;

    public PhoneBill() {}

    public PhoneBill(int id) {
        this.id = id;
    }

    public PhoneBill(int id, int price, int includedMinutes, int usedMinutes) {
        this.id = id;
        this.price = price;
        this.includedMinutes = includedMinutes;
        this.usedMinutes = usedMinutes;
    }
}
