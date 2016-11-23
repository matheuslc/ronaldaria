import junit.framework.*;
import Item.Book;

public class BookTest extends TestCase {
    @org.junit.Test
    public void checkIfIsAllocatedReturnsBoolean() {
        Book book = new Book("Lorem ipsum dolor sit amet", 123, "12/12/2014", 2, "Matheus Carmo");

        book.setAllocated(true);

        assertTrue(book.isAllocated());
    }
}
