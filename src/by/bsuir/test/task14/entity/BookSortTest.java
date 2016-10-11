package by.bsuir.test.task14.entity;

import by.bsuir.main.task14.entity.Book;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by ASUS on 11.10.2016.
 */
public class BookSortTest {
    @Test
    public void test(){
        Book book1 = new Book("book1", "author1", 100, 1);
        Book book2 = new Book("book2", "author2", 100, 2);
        Book book3 = new Book("book3", "author3", 100, 3);
        Book book4 = new Book("book4", "author4", 100, 4);
        Book book5 = new Book("book5", "author5", 100, 5);
        Book book6 = new Book("book6", "author6", 100, 6);
        Book book7 = new Book("book7", "author7", 100, 7);

        Object[] expectedResult = {book1, book2, book3, book4, book5, book6, book7};
        Object[] realResult = {book7, book3, book5, book1, book6, book4, book2};
        Arrays.sort(realResult);

        assertArrayEquals(realResult, expectedResult);
    }
}