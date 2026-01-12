package OOPsConcept;

public class Inheritence {
	public static void main(String[] args) {
	ElectronicProduct laptop = new ElectronicProduct("Laptop", 1200.00, "Dell");
    ClothingProduct shirt = new ClothingProduct("T-shirt", 29.99, "M");

    laptop.displayDetails(); // Inherited method from Product
    laptop.displayBrand(); // Method specific to ElectronicProduct

    System.out.println(); // Blank line for separation

    shirt.displayDetails(); // Inherited method from Product
    shirt.displaySize(); // Method specific to ClothingProduct

}
}

