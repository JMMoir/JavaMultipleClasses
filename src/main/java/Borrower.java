import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;

    public Borrower() {
        collection = new ArrayList<Book>();
    }

    public int getCollectionCount() {
        return this.collection.size();
    }

    public void checkOutBook(Library library) {
        Book removedBook = library.removeBook();
        this.collection.add(removedBook);
    }
}
