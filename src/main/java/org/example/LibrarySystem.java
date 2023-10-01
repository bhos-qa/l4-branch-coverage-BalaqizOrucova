package org.example;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {

    private List<String> books = new ArrayList<>();
    public void addBook(String bookTitle) {
        books.add(bookTitle);
    }


    public void removeBook(String bookTitle) {
        books.remove(bookTitle);
    }


    public boolean isBookAvailable(String bookTitle) {
        return books.contains(bookTitle);
    }


    public boolean checkOutBook(String bookTitle) {
        if (books.contains(bookTitle)) {
            books.remove(bookTitle);
            return true;
        }
        return false;
    }


    public void returnBook(String bookTitle) {
        books.add(bookTitle);
    }


    public List<String> searchBooksByTitle(String title) {
        List<String> matchingBooks = new ArrayList<>();
        for (String book : books) {
            if (book.toLowerCase().contains(title.toLowerCase())) {
                matchingBooks.add(book);
            }
        }
        return matchingBooks;
    }


    public List<String> getAllAvailableBooks() {
        return books;
    }


    public List<String> getAllCheckedOutBooks() {

        return new ArrayList<>();
    }


    public double calculateLateFees(int daysLate) {
        // Assuming a fixed late fee per day
        double lateFeePerDay = 1.50;
        return lateFeePerDay * daysLate;
    }


    public int getTotalBooksCount() {
        return books.size();
    }

    public class VulnerableWebPageGenerator {

        // Vulnerable method that generates an HTML page with user input
        public String generatePage(String userContent) {
            // Vulnerable code: directly embedding user input in HTML without proper escaping
            String html = "<html><body>" + userContent + "</body></html>";
            return html;
        }
    }

}

