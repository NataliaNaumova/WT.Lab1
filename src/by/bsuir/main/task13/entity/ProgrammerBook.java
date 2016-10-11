package by.bsuir.main.task13.entity;

import by.bsuir.main.task12.entity.Book;

/**
 * Created by Natalia on 01.10.2016.
 */
public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean equals(Object ob){
        if(!super.equals(ob)){
            return false;
        }

        ProgrammerBook programmerBook = (ProgrammerBook)ob;

        if ((language == null)&&(null != programmerBook.language)) {
            return false;
        }else {
            if (!language.equals(programmerBook.language)){
                return false;
            }
        }

        if (level != programmerBook.level){
            return false;
        }

        return true;
    }

    public int hashCode() {
        return super.hashCode() + 43 * ((language == null) ? 0 : language.hashCode()) + 23 * level;
    }

    public String toString() {
        return super.toString() + ", language: "+ language + ", level: " + level;
    }
}
