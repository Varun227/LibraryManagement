package org.airtribe.inventory;

import org.airtribe.book.Book;
import org.example.LibraryManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Inventory {
    private HashMap<String, ArrayList<Book>> bookTitles = new HashMap<String, ArrayList<Book>>();
    private HashMap<String, ArrayList<Book>> bookAuthors = new HashMap<String, ArrayList<Book>>();
    private HashMap<String, ArrayList<Book>> bookSubjects = new HashMap<String,ArrayList<Book>>();
    private HashMap<String,ArrayList<Book>> bookPublications = new HashMap<String,ArrayList<Book>>();
    private List<Book> books = new ArrayList<>();

    public void updateBook(Book book,boolean isDelete){
        //TODO
        //Author
        LibraryManagement.displayBook(book);

        if(isDelete){
            //check if author is there or not and if author present removing the book from the list of books
            if(bookAuthors.containsKey(book.author))
                bookAuthors.get(book.author).remove(book);
            //Title
            if(bookTitles.containsKey(book.title))
                bookTitles.get(book.title).remove(book);
            //Subject
            if(bookSubjects.containsKey(book.subject))
                bookSubjects.get(book.subject).remove(book);
            //Publication
            if(bookPublications.containsKey(book.publication))
                bookPublications.get(book.publication).remove(book);
            return;
        }
         //check if author is there or not and if author present adding the book to the list of books
        if(bookAuthors.containsKey(book.author))
            bookAuthors.get(book.author).add(book);
        else{
            bookAuthors.put(book.author,new ArrayList<Book>());
        }
        //Title
        if(bookTitles.containsKey(book.title))
            bookTitles.get(book.title).add(book);
        else{
           bookTitles.put(book.title,new ArrayList<Book>());
        }
        //Subject
        if(bookSubjects.containsKey(book.subject))
            bookSubjects.get(book.subject).add(book);
        else{
            bookSubjects.put(book.subject,new ArrayList<Book>());

        }
        //Publication
        if(bookPublications.containsKey(book.publication))
            bookPublications.get(book.publication).add(book);
        else{
             bookPublications.put(book.publication,new ArrayList<Book>());
        }
    }

    public List<Book> searchBook(String query, String searchBy) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (searchBy.equals("title") && book.title.equals(query)) {
                result.add(book);
            } else if (searchBy.equals("author") && book.author.equals(query)) {
                result.add(book);
            } else if (searchBy.equals("subject") && book.subject.equals(query)) {
                result.add(book);
            } else if (searchBy.equals("publication") && book.publication.equals(query)) {
                result.add(book);
            }
        }
        return result;
    }
    public ArrayList<Book> getBooksByTitle(String title){
        return bookTitles.get(title);
    }

    public ArrayList<Book> getBooksByAuthor(String author){
        return bookAuthors.get(author);
    }

    public ArrayList<Book> getBooksBySubject(String subject){
        return bookSubjects.get(subject);
    }

    public ArrayList<Book> getBooksByPublication(String publication){
        return bookPublications.get(publication);
    }
}
