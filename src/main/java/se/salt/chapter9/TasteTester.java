package se.salt.chapter9;

public class TasteTester {

    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.setPrice(1000);
        System.out.println("This cake has " + cake.getFlavor() + " flavor as stated in Cake");
        System.out.println("This cake is $" + cake.getPrice() + " as we stated in this class");

        System.out.println("----------");

        BirthdayCake birthdayCake = new BirthdayCake();
        System.out.println("This birthdaycake has " + birthdayCake.getFlavor() + " flavor as stated in BirthdayCake");
        System.out.println("This birthdaycake is $" + birthdayCake.getPrice() + " as stated in BirthdayCake");

        System.out.println("----------");

        WeddingCake weddingCake = new WeddingCake();
        System.out.println("This weddingCake has " + weddingCake.getFlavor() + " flavor as stated in weddingCake");
        System.out.println("This weddingCake is $" + weddingCake.getPrice() + " as stated in weddingCake");


    }
}
