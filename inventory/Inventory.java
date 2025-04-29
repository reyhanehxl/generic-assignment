package inventory;

import products.Product;

import java.util.ArrayList;

public class Inventory<T extends Product>{
    private ArrayList<T> items;
    public Inventory(){
        items = new ArrayList<>();
    }

    public ArrayList<T> getItems() {
        return items;
    }
    public void setItems(ArrayList<T> itmes){
        this.items = itmes;
    }
    public void getItems(T product){
        items.add(product);
    }

    public void addItems(T product) {
        items.add(product);
    }
    public void removeItemsById(String id){
        T product = findItemsById(id);
        if(product != null){
            items.remove(product);
        }
    }
    public T findItemsById(String id) {
        for (T product : items) {
            if (product.getId().equals(String.valueOf(id))) {
                return product;
            }
        }
        return null;
    }

    public void applyDiscount(String productName, int discount) {
        for (T product : items) {
            if (product.getTitle().equalsIgnoreCase(productName)) {
                Double price = product.getPrice();
                Double newPrice = price - (price * discount / 100);
                product.setPrice(newPrice);
                System.out.println("New price: " + newPrice);
                return;
            }
        }
        throw new IllegalArgumentException("product with this name not found!!!");
    }
    public void displayAll() {
        if (items.isEmpty()) {
            throw new IllegalArgumentException("No products in inventory.");
        } else {
            for (T product : items) {
                System.out.println(product.toString());
            }
        }
    }
}
