public class DigitalProduct extends TaxableProduct {
    private String downloadUrl;
     public DigitalProduct(String name, double price, String downloadUrl) {
        super(name, price);
         this.downloadUrl=downloadUrl;
    }
    public void print() {
        double tax =calculateTax();
        System.out.printf("DigitalProduct; , Price; , Tax; , Total;, URL:",
                name, price, tax, price + tax, downloadUrl);
    }
}
