package encapsulation;

public class ShoppingApp {
    public static void main(String[] args) {
        Product product = new Product("P101", "Bluetooth Headphones", 1999.0, 2);

        product.displayProduct();

        // Trying to set invalid data
        product.setPrice(-500);        // Invalid
        product.setQuantity(-3);       // Invalid

        // Updating with valid values
        product.setPrice(1799.0);
        product.setQuantity(3);

        System.out.println("\nUpdated Product Info:");
        product.displayProduct();
    }
}

