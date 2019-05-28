import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;
    private HashMap<String, Integer> genreCount;

    public Library(int capacity){
        stock = new ArrayList<Book>();
        this.capacity = capacity;
        genreCount = new HashMap<String, Integer>();
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void addBookToStock(Book book) {
        this.stock.add(book);
    }

    public void checkCapacity(Book book) {
        if(stockCount() < this.capacity){
            addBookToStock(book);
        }
    }
    public Book removeBook(){
        return this.stock.remove(0);
    }

    public void addToHash(Book book) {
        int count = genreCount.containsKey(book.getGenre()) ? genreCount.get(book.getGenre()) : 0;
        genreCount.put(book.getGenre(), count + 1);
    }

    public int countHash() {
       return this.genreCount.size();
    }
}
