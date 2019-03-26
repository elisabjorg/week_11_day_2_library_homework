import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {
        book = new Book ("DNA", "Yrsa Sigurdardottir", "Crime");
        library = new Library(3);
    }


    @Test
    public void canAddBookToLibrary() {
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void canCountBooks() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.countBooks());
    }

    @Test
    public void canAddBookTrue() {
        library.addBook(book);
        library.addBook(book);
        assertEquals(true, library.capacityForBooks());
    }

    @Test
    public void canAddBookFalse() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(false, library.capacityForBooks());
    }


}
