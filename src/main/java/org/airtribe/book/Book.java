package org.airtribe.book;

public class Book {
    static int count = 0;
    public String title;

    public String author;

    public String isbn;

    public String subject;

    public String publication;

    public int Id;

    public Book(String title, String author, String isbn, String subject) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.subject = subject;
        this.Id =count;
        count++;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Subject: " + subject);
        System.out.println("Publication: " + publication);
    }
}
