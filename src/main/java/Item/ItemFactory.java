package main.java.Item;

public class ItemFactory {
    public Item createItem(String itemType, String title, int code, String publishedDate, int edition) {
        if (itemType == null) {
            return null;
        }

        if (itemType.equals("book")) {
            return new Book(title, code, publishedDate, edition);
        }

        if (itemType.equals("magazine")) {
            return new Magazine(title, code, publishedDate, edition);
        }

        return null;
    }
}
