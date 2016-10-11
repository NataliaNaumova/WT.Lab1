package by.bsuir.main.task13;

import by.bsuir.main.task12.entity.Book;
import by.bsuir.main.task13.entity.ProgrammerBook;

/**
 * Created by Natalia on 01.10.2016.
 */
public class Main {
    public static void main(String[] args){
        ProgrammerBook book1 = new ProgrammerBook("SomeJavaBook","SomeJavaProgrammer",500,"Java",3);
        Book book2 = new Book("Sherlock Holmes","Conan Doyle",100);
        ProgrammerBook book3 = new ProgrammerBook("SomeJavaBook","SomeJavaProgrammer",500,"Java",3);

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
    }
}
