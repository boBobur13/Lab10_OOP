public class TaxableProduct extends Product implements Taxable {
    public TaxableProduct(String name, double price) {
        super(name,price);
    }
    public double calculateTax() {
        return price * TAX_RATE;
    }
    public void print() {
        double tax = calculateTax();
        System.out.printf("TaxableProduct; , Price;, Tax; , Total;",
                name, price, tax, price + tax);
    }
}
