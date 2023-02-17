public class Product {
    private String name;
    private double price;
    public int countprod;

    public Product(String name, Double price, int countprod) {
        this.name = name;
        this.price = price;
        this.countprod = countprod;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", countprod=" + countprod +
                '}';
    }
}