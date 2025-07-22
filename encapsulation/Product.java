package encapsulation;

public class Product {
    // Encapsulation
    private String productId;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        setPrice(price);      
        setQuantity(quantity); 
    }

    public String getProductId() { //getter
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) { //setter
        if (price > 0) {
            this.price = price;
        } else {
            //System.out.println("Invalid price. Must be positive.");
        }
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
           // System.out.println("Invalid quantity. Must be zero or positive.");
        }
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public void displayProduct() {
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Total Price  : ₹" + getTotalPrice());
    }
}
