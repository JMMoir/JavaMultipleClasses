import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before

    public void setUp() {
        book = new Book("Liars Poker", "Michael Lewis", "Business");
    }

    @Test
    public void bookHasTitle() {
        assertEquals("Liars Poker", book.getTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("Michael Lewis", book.getAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Business", book.getGenre());
    }
}
