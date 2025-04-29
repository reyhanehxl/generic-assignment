import inventory.Inventory;
import products.Accessory;
import products.Book;
import products.Notebook;
import products.Product;

public class Main {
    public static <T extends Product> double calculateTotalPrice(Inventory<T> inventory) {
        double sum = 0;
        for (T item : inventory.getItems()) {
            sum += item.getPrice();
        }
        return sum;
    }
        public static void main(String[] args) {
            Inventory<Book> bookInventory = new Inventory<>();
            Inventory<Notebook> notebookInventory = new Inventory<>();
            Inventory<Accessory> accessoryInventory = new Inventory<>();

            Book b1 = new Book("generics", 100.0, "me", "pub A", "science");
            Book b2 = new Book("farda", 120.0, "saba",  "Pub B", "Drama");
            bookInventory.addItems(b1);
            bookInventory.addItems(b2);

            Notebook n1 = new Notebook("Notebook A", 50.0, 100,  true);
            Notebook n2 = new Notebook("Notebook B", 40.0, 80,  false);
            notebookInventory.addItems(n1);
            notebookInventory.addItems(n2);

            Accessory a1 = new Accessory("Pen", 35.0, "Blue");
            Accessory a2 = new Accessory("Eraser", 20.0, "Red");
            accessoryInventory.addItems(a1);
            accessoryInventory.addItems(a2);

            System.out.println("Books:");
            bookInventory.displayAll();

            System.out.println("Notebooks:");
            notebookInventory.displayAll();

            System.out.println("Accessories:");
            accessoryInventory.displayAll();

            bookInventory.removeItemsById("2");
            accessoryInventory.removeItemsById("6");

            System.out.println("Total price of books: " + calculateTotalPrice(bookInventory));
            System.out.println("Total price of notebooks: " + calculateTotalPrice(notebookInventory));
            System.out.println("Total price of accessories: " + calculateTotalPrice(accessoryInventory));

            System.out.println("Find Book ID 1:");
            System.out.println(bookInventory.findItemsById("1"));

            System.out.println("Find Book ID 99 (not exists):");
            System.out.println(bookInventory.findItemsById("99"));

            notebookInventory.applyDiscount("Notebook A", 20);
            accessoryInventory.applyDiscount("Pen", 50);
            System.out.println("Final products:");
            System.out.println("Books:");
            bookInventory.displayAll();

            System.out.println("Notebooks:");
            notebookInventory.displayAll();

            System.out.println("Accessories:");
            accessoryInventory.displayAll();
        }
    }