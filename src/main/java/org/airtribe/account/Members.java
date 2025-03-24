package org.airtribe.account;

import org.airtribe.user.User;

class Members extends Account {

    public int totalBooksIssued =0;

    Members(String id, String password, User user) {
        super(id, password, user);
    }

    public void issueBook() {
        this.totalBooksIssued++;
        System.out.println("Book Issued");
    }

    public void returnBook() {
        this.totalBooksIssued--;
        System.out.println("Book Returned");
    }

    public int getTotalBooksIssued() {
        return totalBooksIssued;
    }

    //borrowing History
}
