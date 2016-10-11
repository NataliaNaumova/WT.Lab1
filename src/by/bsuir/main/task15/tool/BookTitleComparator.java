package by.bsuir.main.task15.tool;

import by.bsuir.main.task15.entity.Book;

import java.util.Comparator;

/**
 * Created by ASUS on 02.10.2016.
 */
public class BookTitleComparator extends BookComparator {
    public int compare(Book book1, Book book2) {
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
