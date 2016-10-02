package by.bsuir.task15.tool;

import by.bsuir.task15.entity.Book;

import java.util.Comparator;

/**
 * Created by ASUS on 02.10.2016.
 */
public class BookTitleAuthorComparator implements Comparator<Book> {
    public int compare(Book book1, Book book2) {
        int nameCompareResult = book1.getTitle().compareTo(book2.getTitle());
        if (nameCompareResult == 0){
            return book1.getAuthor().compareTo(book2.getAuthor());
        } else {
            return nameCompareResult;
        }
    }
}
