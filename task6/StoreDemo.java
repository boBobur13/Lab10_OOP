public class StoreDemo {
    public static void main(String[] args) {
        Printable[] items = {
            new Product("Book",15.99),
            new TaxableProduct("Laptop",1200.00),
            new DigitalProduct("Ebook", 9.99, "https://store.com/ebook1563"),
            new Product("Pen",1.50),
            new TaxableProduct("Mouse",25.00)
        };
        double totalTax =0;
        for (Printable p:items) {
            p.print();
            if (p instanceof Taxable) {
                totalTax +=((Taxable) p).calculateTax();
            }
        }
        System.out.printf("Total tax collected; ", totalTax);
    }
}
