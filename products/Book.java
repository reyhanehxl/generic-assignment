package products;

public class Book extends Product{
    private String author;
    private String publication;
    private String genre;
    private static int ID = 0;

    public Book(String title, Double price, String author, String publication, String genre) {
        super(title, price);
        setAuthor(author);
        setGenre(genre);
        setPublication(publication);
    }


    @Override
    protected String generateId() {
        return String.format("1%03d", ID);
    }

    @Override
    public String toString() {
        return "id: " + getId() +
                "\ntitle: " + getTitle() +
                "\nprice: " + getPrice() +
                "\nauthor: " + author +
                "\npublication: " + publication +
                "\ngenre: " + genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String title) {
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }
}
