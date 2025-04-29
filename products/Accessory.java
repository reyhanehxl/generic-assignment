package products;

public class Accessory extends Product{
    private String color;
    private static int ID = 0;

    public Accessory(String title, Double price, String color) {
        super(title, price);
        setColor(color);
    }

    @Override
    public String toString() {
        return "id: " + getId() +
                "\ntitle: " + getTitle() +
                "\nprice: " + getPrice() +
                "\ncolor: " + color;
    }

    @Override
    protected String generateId() {
        return String.format("1%03d", ID);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
