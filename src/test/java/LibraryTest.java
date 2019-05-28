import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book2;

    @Before
    public void setUp() throws Exception {
        library = new Library(5);
        book = new Book("Liars Poker", "Michael Lewis", "business");
        book2 = new Book("Also Human", "Caroline Elton", "Medical");
    }


    @Test
    public void numberOFBooks() {
        assertEquals(0, library.stockCount());
    }

    @Test
    public void addedBook() {
        library.addBookToStock(book);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void checkCapacityBeforeAddingBook() {
        library.checkCapacity(book);
        library.checkCapacity(book);
        library.checkCapacity(book);
        library.checkCapacity(book);
        library.checkCapacity(book);
        library.checkCapacity(book);
        assertEquals(5, library.stockCount());
    }

    @Test
    public void countHash() {
        assertEquals(0, library.countHash());
    }


        @Test
    public void genreAddedToHash() {
        library.addToHash(book);
        library.addToHash(book);
        library.addToHash(book2);
        assertEquals(2, library.countHash());
    }

}
