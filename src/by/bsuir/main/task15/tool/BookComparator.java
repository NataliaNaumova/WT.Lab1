package by.bsuir.main.task15.tool;

import by.bsuir.main.task15.entity.Book;

import java.util.Comparator;

/**
 * Created by ASUS on 11.10.2016.
 */
public abstract class BookComparator implements Comparator<Book> {
     public abstract int compare(Book book1, Book book2);
}
