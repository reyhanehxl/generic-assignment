package products;

public class Notebook extends Product{
    private int pageCount;
    private boolean isHardCover;
    private static int ID = 0;

    public Notebook(String title, double price, int pageCount, boolean isHardCover){
        super(title, price);
        setHardCover(isHardCover);
        setPageCount(pageCount);
    }

    @Override
    public String toString() {
        return "id: " + getId() +
                "\ntitle: " + getTitle() +
                "\nprice: " + getPrice() +
                "\npage count: " + pageCount +
                "\nis it hardCover: " + isHardCover;
    }

    @Override
    protected String generateId() {
        return String.format("1%03d", ID);
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }

    public boolean isHardCover() {
        return isHardCover;
    }
}
