import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.example.LibrarySystem;
import static org.junit.jupiter.api.Assertions.*;

public class LibrarySystemTest {

    private LibrarySystem library;

    @BeforeEach
    public void setUp() {
        library = new LibrarySystem();
        library.addBook("Sherlock Holmes");
        library.addBook("Good life, good vibes");
        library.addBook("Chess");
    }

    @Test
    public void testAddBook() {
        library.addBook("The Kite Runner");
        assertTrue(library.isBookAvailable("The Kite Runner"));
    }

    @Test
    public void testRemoveBook() {
        library.removeBook("Good life, good vibes");
        assertFalse(library.isBookAvailable("Good life, good vibes"));
    }

    @Test
    public void testCheckOutBook() {
        assertTrue(library.checkOutBook("Sherlock Holmes"));
        assertFalse(library.isBookAvailable("Sherlock Holmes"));
    }

    @Test
    public void testReturnBook() {
        library.checkOutBook("Good life, good vibes");
        library.returnBook("Good life, good vibes");
        assertTrue(library.isBookAvailable("Good life, good vibes"));
    }

    @Test
    public void testSearchBooksByTitle() {
        // Search for books with "Sherlock Holmes" in the title
        assertEquals(1, library.searchBooksByTitle("Sherlock Holmes").size());

        // Search for books with "Good" in the title
        assertEquals(1, library.searchBooksByTitle("Good").size());

        // Search for books with "Book3" (non-existing title)
        assertEquals(0, library.searchBooksByTitle("Book3").size());

        // Search for books with an empty title (should return all books)
        assertEquals(3, library.searchBooksByTitle("").size());
    }
}
