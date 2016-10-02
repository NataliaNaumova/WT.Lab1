package by.bsuir.task12;

import by.bsuir.task12.entity.Book;

/**
 * Created by Natalia on 01.10.2016.
 */
public class Main {
    public static void main(String[] args){
        Book book1 = new Book("Sherlock Holmes","Conan Doyle",50);
        Book book2 = new Book("Sherlock Holmes","Conan Doyle",100);
        Book book3 = new Book("Sherlock Holmes","Conan Doyle",50);

        if (book1.equals(book2)){
            System.out.println("book1 equals book2");
        }else {
            System.out.println("book1 doesn't equals book2");
        }

        if (book1.equals(book3)){
            System.out.println("book1 equals book3");
        }else {
            System.out.println("book1 doesn't equals book3");
        }

        System.out.println();

        System.out.println("book1.hashCode() == "+book1.hashCode());
        System.out.println("book2.hashCode() == "+book2.hashCode());
        System.out.println("book3.hashCode() == "+book3.hashCode());

        System.out.println();

        System.out.println("book1.toString() == "+book1.toString());
        System.out.println("book2.toString() == "+book2.toString());
        System.out.println("book3.toString() == "+book3.toString());

        System.out.println();

        try {
            Book book4 = book1.clone();
            System.out.println("book4.toString() == "+book4.toString());
        }catch (CloneNotSupportedException e){
            System.out.println("Clone is not supported.");
        }
    }
}
