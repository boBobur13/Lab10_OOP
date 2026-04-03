public class Product implements Printable {
    protected String name;
    protected double price;
    public Product(String name, double price) {
        this.name=name;
        this.price=price;
    }
    public void print() {
        System.out.printf("Product; ,Price: $%.2f\n", name, price);
    }
}
