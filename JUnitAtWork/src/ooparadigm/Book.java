package ooparadigm;

/**
 * Book class represents books.
 */
public class Book implements Readable, Viewable {
    /** the title of the book */
    private String title;
    /** the author of the book */
    private String author;
    /** the number of pages of the book */
    private int pages;
    
    /**
     * Book constructor.
     * @param title the title of the book
     * @param author the author of the book
     * @param pages the number of pages of the book
     */
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    
    /**
     * Read the contents of the book.
     */
    @Override
    public void read() {
        System.out.println("Once upon a time...");
    }
    
    /**
     * View the cover of the book.
     */
    @Override
    public void view() {
        System.out.println(String.format("'%s', by %s", title, author));
    }
    
    /**
     * Getter for the book's title.
     * @return the title of the book
     */
    String getTitle() {
        return title;
    }
    
    /**
     * Getter for the book's author.
     * @return the author of the book.
     */
    String getAuthor() {
        return author;
    }
    
    /**
     * Getter for the number of pages that the book has.
     * @return the number of pages of the book
     */
    int getPages() {
        return pages;
    }
}