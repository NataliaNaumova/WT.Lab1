package by.bsuir.main.task15.tool;

import by.bsuir.main.task15.entity.Book;

import java.util.Comparator;

/**
 * Created by ASUS on 02.10.2016.
 */
public class BookAuthorTitleComparator extends BookComparator {
    public int compare(Book book1, Book book2) {
        int authorCompareResult = book1.getAuthor().compareTo(book2.getAuthor());
        if (authorCompareResult == 0){
            return book1.getTitle().compareTo(book2.getTitle());
        } else {
            return authorCompareResult;
        }
    }
}
