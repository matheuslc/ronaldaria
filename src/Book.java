public class Book extends Item {
    private String author;

    public Book(String author, int code, String publishedDate, int edition) {
        super();

        this.setAuthor(author);
        super.setCode(code);
        super.setPublishedDate(publishedDate);
        super.setEdition(edition);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
