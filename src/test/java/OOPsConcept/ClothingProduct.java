package OOPsConcept;

public class ClothingProduct extends Product {
    private String size;

    public ClothingProduct(String name, double price, String size) {
        super(name, price); // Call to superclass constructor
        this.size = size;
    }

    public void displaySize() {
        System.out.println("Size: " + size);
    }
}