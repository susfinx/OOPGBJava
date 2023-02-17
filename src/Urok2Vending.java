import java.util.Scanner;

public class Urok2Vending{
    public static void main(String[] args) {
        VendMashine ven = new VendMashine(10);
        ven.add(new Product("Snikers",40.,3));
        ven.add(new Product("Twix",35.,4));
        ven.add(new Product("Baunty",25.,4));
        ven.getProduktName("Baunty");
        ven.getProduktName("fgfvd");
        ven.getProduktPrice(35.);
        ven.getProduktPrice(20.);
    }
}
