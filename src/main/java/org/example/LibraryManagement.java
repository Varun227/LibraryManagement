package org.example;

import org.airtribe.account.Librarian;
import org.airtribe.book.Book;
import org.airtribe.inventory.Inventory;
import org.airtribe.user.User;

import java.util.List;

public class LibraryManagement {
    public static void main(String[] args) {

        //Creating a User

        System.out.println("Welcome to Library Management System");

        User person = new User("varun", "abc@gmail.com", "123 Main St", "555-1234");

        User person2 = new User("venkatesh", "jkk@gmail.com", "780 Kakinada", "9000324533");

        //Creating a librarian
        Librarian librarian = new Librarian("lib001", "password", person2);

        //Creating a inventory

        Inventory bookDatabase = new Inventory();

        //Creating a books

        Book book1 = new Book("Java", "James Gosling", "Sun Microsystems", "Coding");

        Book book2 = new Book("Python", "Guido van Rossum", "Python Software Foundation", "DataCoding");

        //Displaying book details
        book2.displayBookDetails();
        //Adding books to inventory

        librarian.addBook(book1, bookDatabase);
        librarian.addBook(book2, bookDatabase);

        //Search a book by title

        List<Book> searchResult = bookDatabase.searchBook("java","title");
        for(int i =0; i<searchResult.size(); i++){
            displayBook(searchResult.get(i));
        }

        //Search a book by author

        List<Book> searchResult1 = bookDatabase.searchBook("James Gosling","author");

        for(int i =0; i<searchResult1.size(); i++){
            displayBook(searchResult1.get(i));
        }

        //seach a book by isbn
        List<Book> searchResult2 = bookDatabase.searchBook("1234","isbn");
        for(int i =0;i<searchResult2.size();i++){
            displayBook(searchResult2.get(i));
        };

        //Registering a user

        User newUser = new User("vikram", "vikramKumarK@gmail.com", "123 Main St", "555-1234");

        librarian.registerUser(newUser);

        //Displaying user details

        librarian.displayUserDetails();
    }

  public static void displayBook(Book book){
        System.out.println("Book Name: " + book.title);
        System.out.println("Book Author:" + book.author);
        System.out.println("Book Publisher:" + book.publication);
    }
};