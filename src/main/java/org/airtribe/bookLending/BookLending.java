package org.airtribe.bookLending;

import java.time.LocalDateTime;

public class BookLending {
    static LocalDateTime creationDate;
    static LocalDateTime dueDate;

    private static String bookId;
    private static String memberId;

    BookLending(String bookId, String memberId){
        this.bookId = bookId;
        this.memberId = memberId;
        creationDate = LocalDateTime.now();
        dueDate = creationDate.plusDays(7);
    }



}
