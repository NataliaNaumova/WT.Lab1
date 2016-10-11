package by.bsuir.main.task15.tool;

import by.bsuir.main.task15.entity.Book;

import java.util.Comparator;

/**
 * Created by ASUS on 02.10.2016.
 */
public class BookAuthorTitlePriceComparator extends BookComparator{
    public int compare(Book book1, Book book2) {
        int authorCompareResult = book1.getAuthor().compareTo(book2.getAuthor());
        if (authorCompareResult == 0){
            int titleCompareResult = book1.getTitle().compareTo(book2.getTitle());
            if (titleCompareResult == 0){
                if (book1.getPrice()<book2.getPrice()){
                    return -1;
                }else {
                    if (book1.getPrice() == book2.getPrice()){
                        return 0;
                    } else {
                        return 1;
                    }
                }
            } else {
                return titleCompareResult;
            }
        } else {
            return authorCompareResult;
        }
    }
}
