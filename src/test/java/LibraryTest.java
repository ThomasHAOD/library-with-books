import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(10);
        book = new Book("Game of Thrones", "GRRM", "Fantasy");
    }

    @Test
    public void libraryCanAddBook(){
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void libraryHasCapacity(){
        assertEquals(10, library.getCapacity());
    }

    @Test
    public void cantAddBooksBeyondCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(10, library.countBooks());
    }

}
