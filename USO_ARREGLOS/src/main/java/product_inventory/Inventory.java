package product_inventory;

import java.util.ArrayList;

public class Inventory {
    // ArrayList to store products
    private ArrayList<Product> products;

    // Constructor
    public Inventory() {
        products = new ArrayList<>();
    }

    // Method to add a product to the inventory
    public void addProduct(Product product) {
        // Avoid adding duplicate products (based on code)
        for (Product p : products) {
            if (p.getCode().equals(product.getCode())) {
                System.out.println("Product with code " + product.getCode() + " already exists.");
                return;
            }
        }
        products.add(product);
        System.out.println("Product added: " + product.getName());
    }

    // Method to update the quantity of a product
    public void updateQuantity(String code, int newQuantity) {
        for (Product p : products) {
            if (p.getCode().equals(code)) {
                p.setQuantity(newQuantity);
                System.out.println("Quantity updated for product " + p.getName());
                return;
            }
        }
        System.out.println("Product not found.");
    }

    // Method to remove products with quantity zero
    public void removeOutOfStockProducts() {
        products.removeIf(product -> product.getQuantity() == 0);
        System.out.println("Products with zero quantity removed.");
    }

    // Method to display the complete inventory
    public void displayInventory() {
        if (products.isEmpty()) {
            System.out.println("The inventory is empty.");
        } else {
            for (Product p : products) {
                p.displayInfo();
            }
        }
    }
}



