package ooparadigm;

/**
 * Main class has the main() method which starts the application.
 */
public class Main {
    /**
     * Starts the application.
     * @param args contains the command-line arguments
     */
    public static void main(String[] args) {
        Book book = new Book("Tittle", "Author", 100); // create a book
        book.view(); // look at the book
        book.read(); // read the book
        
        Picture picture = new Picture(400, 300); // create a picture
        picture.view(); // look at the picture
    }
}