package org.airtribe.account;

import org.airtribe.book.Book;
import org.airtribe.inventory.Inventory;
import org.airtribe.user.User;

import java.util.HashMap;

public class Librarian extends Account {

    private HashMap<String, User> userDatabase = new HashMap<>();


    public Librarian(String id, String password, User person) {
        super(id, password, person);
    }

    public void addBook(Book book, Inventory bookDatabase) {
        bookDatabase.updateBook(book,false);
        System.out.println("Book Added");
    }

    public void registerUser(User user) {
        if(!userDatabase.containsKey(user.getEmail()))
            userDatabase.put(user.getEmail(),user);
        System.out.println("User Registered");
    }

    public void removeBook(Book book, Inventory bookDatabase) {
        bookDatabase.updateBook(book,true);
        System.out.println("Book Removed");
    }

    ;

    public void deleteUser(String email) {
        if(userDatabase.containsKey(email)){
            userDatabase.remove(email);
            System.out.println("User Deleted");
        }else{
            System.out.println("User Not Found");
        }
    }

    ;

    public void displayUserDetails() {
        person.displayUserDetails();

    }
};
