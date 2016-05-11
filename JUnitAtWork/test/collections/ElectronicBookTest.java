package collections;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for the ElectronicBook class.
 */
public class ElectronicBookTest {
    private ElectronicBook electronicBook;
    private final String ISBN = "1234567890";
    private final String[] AUTHORS = {"Author Name"};
    private final String[] DOWNLOAD_LINKS = {"http://www.download.com/"};
    private final String[] REMARKS_AND_NOTES = {"remarks", "notes"};
    
    /**
     * Create an ElectronicBook for use in tests.
     */
    @Before
    public void initialize() {
        electronicBook = new ElectronicBook(ISBN, AUTHORS, DOWNLOAD_LINKS, REMARKS_AND_NOTES);
    }

    @Test
    public void testGetISBN() {
        String result = electronicBook.getISBN();
        
        assertEquals(ISBN, result);
    }

    @Test
    public void testGetAuthors() {
        String[] result = electronicBook.getAuthors();
        
        assertArrayEquals(AUTHORS, result);
    }

    @Test
    public void testGetDownloadLinks() {
        String[] result = electronicBook.getDownloadLinks();
        
        assertArrayEquals(DOWNLOAD_LINKS, result);
    }

    @Test
    public void testGetRemarksAndNotes() {
        String[] result = electronicBook.getRemarksAndNotes();
        
        assertArrayEquals(REMARKS_AND_NOTES, result);
    }

    @Test
    public void testSetPublisher() {
        String expResult = "Publisher";
        electronicBook.setPublisher(expResult);
        String result = electronicBook.getPublisher();
        
        assertEquals(expResult, result);
    }

    @Test
    public void testSetPrice() {
        float expResult = 29.99f;
        electronicBook.setPrice(expResult);
        float result = electronicBook.getPrice();
        
        assertEquals(expResult, result, 0.005);
    }

    @Test
    public void testSetElectronicFormat() {
        ElectronicBook.FormatOfElectronicBook expResult = ElectronicBook.FormatOfElectronicBook.AZW;
        electronicBook.setElectronicFormat(expResult);
        ElectronicBook.FormatOfElectronicBook result = electronicBook.getElectronicFormat();
        
        assertEquals(expResult, result);
    }

    @Test
    public void testSetYearOfPublication() {
        ElectronicBook.YearOfPublication expResult = ElectronicBook.YearOfPublication.Y2005;
        electronicBook.setYearOfPublication(expResult);
        ElectronicBook.YearOfPublication result = electronicBook.getYearOfPublication();
        
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTitle() {
        String expResult = "Title";
        electronicBook.setTitle(expResult);
        String result = electronicBook.getTitle();
        
        assertEquals(expResult, result);
    }
}
