import java.util.ArrayList;

public class Library {

    private ArrayList<Book> catalogue;
    private int capacity;

    public Library(int capacity){
        this.catalogue = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public void addBook(Book book) {
        if (this.countBooks() < this.capacity){
        this.catalogue.add(book);
        }
    }

    public int countBooks() {
        return catalogue.size();
    }


    public int getCapacity() {
        return this.capacity;
    }
}
