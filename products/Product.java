package products;
public abstract class Product {
    private String title;
    private Double price;
    private String id;

    public Product(String title, Double price) {
        setTitle(title);
        setPrice(price);
        setId(generateId());
    }

    @Override
    public String toString() {
        return "id: " + id + "\ntitle: " + title + "\nprice: " + price;
    }

    protected abstract String generateId();

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty())
            throw new IllegalArgumentException("Title cannot be empty.");
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(Double price) {
        if(price == null)
            throw new IllegalArgumentException("the price is empty!");
        if(price < 0)
            throw new IllegalArgumentException("Price cannot be negative.");
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    private void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
