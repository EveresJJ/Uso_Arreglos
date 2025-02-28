package product_inventory;

public class Product {
    // Attributes
    private String code;
    private String name;
    private int quantity;
    private double price;

    // Constructor
    public Product(String code, String name, int quantity, double price) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Getter and Setter Methods
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display product information
    public void displayInfo() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: $" + price);
        System.out.println("----------------------");
    }
}

