package product_inventory;

public class Main {
    public static void main(String[] args) {
        // Create the inventory
        Inventory inventory = new Inventory();

        // Create some products
        Product product1 = new Product("001", "Laptop", 10, 1500.00);
        Product product2 = new Product("002", "Smartphone", 25, 800.00);
        Product product3 = new Product("003", "Tablet", 0, 400.00);

        // Add products to the inventory
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        // Display inventory
        System.out.println("Current Inventory:");
        inventory.displayInventory();

        // Update the quantity of a product
        inventory.updateQuantity("002", 30);

        // Remove products with quantity 0
        inventory.removeOutOfStockProducts();

        // Display updated inventory
        System.out.println("\nUpdated Inventory:");
        inventory.displayInventory();
    }
}


