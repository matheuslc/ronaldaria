package Item;

public class Book extends Item {
    private String author;

    public Book(String title, int code, String publishedDate, int edition, String author) {
        super(title, code, publishedDate, edition);
        this.setAuthor(author);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
