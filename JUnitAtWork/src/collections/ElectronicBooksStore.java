/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * This application manages a store of electronic books format.
 * 
 * @author gheorgheaurelpacurar
 */
public class ElectronicBooksStore {
    
    public static void main(String[] args){
    
        // declare an array of ElectronicBooks
        ElectronicBook[] books;
        books = new ElectronicBook[3];

        // create a new eBook
        String isbn = "978-606-758-671-8";
        String[] authors = new String[]{"Lev Grossman","Mira Grossman"};
        EBook eBook = new EBook(isbn, authors);
        eBook.setTitle("Taramul Magicianului");
        eBook.setPrice(20.93f);
        eBook.setElectronicFormat(ElectronicBook.FormatOfElectronicBook.DRM);
        eBook.setRecommendedReader(EBook.eBooksReaders.AMAZON);
        eBook.setPublisher("Nemira");
        eBook.setYearOfPublication(ElectronicBook.YearOfPublication.Y2016);
        String[] downloadLinks = new String[]{
            "http://www.elefant.ro/ebooks/fictiune/literatura-de-divertisment/sf-fantasy/taramul-magicianului-al-treilea-volum-al-seriei-magicienii-322807.html"
        };
        eBook.setRemarksAndNotes(new String[] {""});
        eBook.setDownloadLinks(downloadLinks);
        // Add eBook to the books
        books[0] = eBook;
         // create a new eBook
        isbn = "978-606-758-667-1";
        authors = new String[]{"Bogdan Munteanu"};
        eBook = new EBook(isbn, authors);
        eBook.setTitle("Ai uitat sa zambesti.");
        eBook.setPrice(12.53f);
        eBook.setElectronicFormat(ElectronicBook.FormatOfElectronicBook.DRM);
        eBook.setRecommendedReader(EBook.eBooksReaders.AMAZON);
        eBook.setPublisher("Nemira");
        eBook.setYearOfPublication(ElectronicBook.YearOfPublication.Y2016);
        downloadLinks = new String[]{
            "http://www.elefant.ro/ebooks/fictiune/literatura-romana/literatura-romana-contemporana/ai-uitat-sa-razi-322805.html"
        };
        eBook.setDownloadLinks(downloadLinks);
        eBook.setRemarksAndNotes(new String[] {""});
        // Add eBook to the books
        books[1] = eBook;         
         // create a new eBook
        isbn = "978-606-758-667-3";
        authors = new String[]{"Dany Ionathan","Sandy Marion", "Leonore Bittman"};
        IBook iBook = new IBook(isbn, authors);
        iBook.setTitle("The Swift Programming Language (Swift 2.2)");
        iBook.setPrice(0.00f);
        iBook.setElectronicFormat(ElectronicBook.FormatOfElectronicBook.IBA);
        iBook.setRecommendedReader(IBook.iBooksReaders.APPIPAD);
        iBook.setPublisher("Apple");
        iBook.setYearOfPublication(ElectronicBook.YearOfPublication.Y2014);
        downloadLinks = new String[]{
            "https://itunes.apple.com/us/store?mt=11"
        };  
        iBook.setDownloadLinks(downloadLinks);
        eBook.setRemarksAndNotes(new String[] {"This is a great iBook!", "I recommend it!"});
        // Add eBook to the books
        books[2] = iBook;      

        //check the list of Books
        for(int index = 0; index <3;index++){
            System.out.println("Book title: "+books[index].getTitle());
            System.out.println("Book ISBN: "+books[index].getISBN());
            System.out.println("Book Publisher: "+books[index].getPublisher());
            String[] authorsOfThisBook = books[index].getAuthors();
            int numberOfAuthors = authorsOfThisBook.length;
            for(int currentAuthor=0;currentAuthor<numberOfAuthors;currentAuthor++)
            {
                System.out.println("Book author: "+ authorsOfThisBook[currentAuthor]);
            }
            //System.out.println("Book Authors: "+books[index].getAuthors()[0]);
            System.out.println("Book Price: "+books[index].getPrice());
            System.out.println("Book format: "+books[index].getElectronicFormat());
            System.out.println("Book year of publication: "+books[index].getYearOfPublication());
            //System.out.println("Book remarks and notes: "+books[index].getRemarksAndNotes()[0]);
            System.out.println("------------------------------------------------------------------");
        }
        
        // create a new rating
        Rating myRating = new Rating(5, 1, "This is my description.");
        Rating johnsRating = new Rating(2, 123, "This description was written by John.");
        Rating marysRating = new Rating(4, 1005, "Mary wrote this description.");
        
        // create a HashMap with ratings and books
        Map<Rating, ElectronicBook> bookRatings = new HashMap<>();
        bookRatings.put(myRating, books[0]);
        bookRatings.put(johnsRating, books[1]);
        bookRatings.put(marysRating, books[2]);
        
        // display the details of the books in the HashMap
        for (ElectronicBook ebook : bookRatings.values()) {
            System.out.printf("%s (%s - %s)%n", ebook.getTitle(), ebook.getPublisher(), ebook.getISBN());
        }
        
        System.out.println();
        
        // create a TreeSet with books
        AbstractSet<ElectronicBook> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(books));
        
        // display the details of the books in the TreeSet
        for (ElectronicBook ebook : treeSet) {
            System.out.printf("%s (%s - %s)%n", ebook.getTitle(), ebook.getPublisher(), ebook.getISBN());
        }
    }
    
    /**
     * Used to represent ratings for books.
     */
    private static class Rating {
        private int stars;
        private int user_id;
        private String description;
        
        /**
         * Constructor with number of stars, user ID and description as parameters.
         * @param stars number of stars given by the user
         * @param user_id the numerical ID of the user
         * @param description the description written by the user
         */
        Rating(int stars, int user_id, String description) {
            this.stars = stars;
            this.user_id = user_id;
            this.description = description;
        }
        
        /**
         * Overriden to use instances of this class as keys in a Map.
         * @param obj the object to compare for equality
         * @return true if the ratings are the same, false otherwise
         */
        @Override
        public boolean equals(Object obj) {
            if (obj == this)
                return true;
            
            if (obj == null)
                return false;
            
            if (!(obj instanceof Rating))
                return false;
            
            Rating otherRating = (Rating) obj;
            
            if (user_id == otherRating.user_id)
                return true;
            
            return false;
        }
        
        /**
         * Overriden to use instances of this class as keys in a Map.
         * @return hashcode
         */
        @Override
        public int hashCode() {
            return user_id + description.hashCode();
        }
    }
}
