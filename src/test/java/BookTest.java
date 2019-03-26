import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book("The Hunger Games", "Suzanne Collins", "Drama");
    }

    @Test
    public void bookHasName() {
        assertEquals("The Hunger Games", book.bookTitle());
    }

    @Test
    public void bookHasAuthor() {
        assertEquals("Suzanne Collins", book.bookAuthor());
    }

    @Test
    public void bookHasGenre() {
        assertEquals("Drama", book.bookGenre());
    }


}


