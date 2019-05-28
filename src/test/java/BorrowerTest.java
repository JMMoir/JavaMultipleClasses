import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void setUp() throws Exception {
        borrower = new Borrower();
        library = new Library(5);
        book = new Book("Liars Poker", "Michael Lewis", "Business");
    }

    @Test
    public void hasCollection() {
        assertEquals(0, borrower.getCollectionCount());
    }

    @Test
    public void canCheckOutBooks() {
        library.addBookToStock(book);
        borrower.checkOutBook(library);
        assertEquals(0, library.stockCount());
        assertEquals(1, borrower.getCollectionCount());

    }
}
