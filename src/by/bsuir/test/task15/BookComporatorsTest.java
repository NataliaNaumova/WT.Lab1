package by.bsuir.test.task15;

import by.bsuir.main.task15.entity.Book;
import by.bsuir.main.task15.tool.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ASUS on 11.10.2016.
 */
public class BookComporatorsTest {
    private Book book1 = new Book();
    private Book book2 = new Book();
    private Book book3 = new Book();
    private Book book4 = new Book();
    private Book book5 = new Book();

    private Book[] unsortedArray = {book3, book5, book1, book4, book2};
    private Object[] expectedResult = {book1, book2, book3, book4, book5};

    @Test
    public void titleComparatorTest(){
        book1.setTitle("a");
        book2.setTitle("b");
        book3.setTitle("c");
        book4.setTitle("d");
        book5.setTitle("e");

        test(new BookTitleComparator());
    }

    @Test
    public void TitleAuthorComparatorTest(){
        book1.setTitle("a"); book1.setAuthor("a");
        book2.setTitle("a"); book2.setAuthor("b");
        book3.setTitle("b"); book3.setAuthor("a");
        book4.setTitle("c"); book4.setAuthor("a");
        book5.setTitle("c"); book5.setAuthor("b");

        test(new BookTitleAuthorComparator());
    }

    @Test
    public void AuthorTitleComparatorTest(){
        book1.setAuthor("a"); book1.setTitle("a");
        book2.setAuthor("a"); book2.setTitle("b");
        book3.setAuthor("b"); book3.setTitle("a");
        book4.setAuthor("b"); book4.setTitle("b");
        book5.setAuthor("c"); book5.setTitle("c");

        test(new BookAuthorTitleComparator());
    }

    @Test
    public void AuthorTitlePriceComparator(){
        book1.setAuthor("a"); book1.setTitle("a"); book1.setPrice(100);
        book2.setAuthor("a"); book2.setTitle("a"); book2.setPrice(110);
        book3.setAuthor("b"); book3.setTitle("a"); book3.setPrice(100);
        book4.setAuthor("b"); book4.setTitle("b"); book4.setPrice(100);
        book5.setAuthor("c"); book5.setTitle("c"); book5.setPrice(120);

        test(new BookAuthorTitlePriceComparator());
    }

    private void test(BookComparator comparator){
        String failMessage = "failed comparator: " + comparator.getClass().getName();
        List<Book> list = Arrays.asList(unsortedArray);
        Collections.sort(list, comparator);
        Object[] realResult = list.toArray();
        assertArrayEquals(failMessage, realResult, expectedResult);
    }
}