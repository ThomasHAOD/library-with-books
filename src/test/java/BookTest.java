import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Game of Thrones", "GRRM", "Fantasy");
    }

    @Test
    public void canGetBookTitle(){
        assertEquals("Game of Thrones", book.getTitle());
    }

}
