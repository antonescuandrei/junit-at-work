package ooparadigm;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test the methods of the Book class.
 */
public class BookTest {
    private Book book;
    private final String TITLE = "Book Title";
    private final String AUTHOR = "The Author";
    private final int PAGES = 100;
    
    /**
     * Initializes the book object used in tests.
     */
    @Before
    public void initialization() {
        book = new Book(TITLE, AUTHOR, PAGES);
    }
    
    /**
     * Test the getter for the book's title.
     */
    @Test
    public void testGetTitle() {
        String result = book.getTitle();
        
        assertEquals(TITLE, result);
    }

    /**
     * Test the getter for the book's author.
     */
    @Test
    public void testGetAuthor() {
        String result = book.getAuthor();
        
        assertEquals(AUTHOR, result);
    }

    /**
     * Test the getter for the book's number of pages.
     */
    @Test
    public void testGetPages() {
        int result = book.getPages();
       
        assertEquals(PAGES, result);
    }
    
}
