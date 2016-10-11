package by.bsuir.main.task12.entity;

/**
 * Created by Natalia on 01.10.2016.
 */
public class Book implements Cloneable{
    private String title;
    private String author;
    private int price;
    private static int edition = 5;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public boolean equals(Object ob){
        if (this == ob){
            return true;
        }

        if (ob == null){
            return false;
        }

        if (this.getClass() != ob.getClass()){
            return false;
        }

        Book book = (Book)ob;

        if ((title == null)&&(null != book.title)) {
            return false;
        }else {
            if (!title.equals(book.title)){
               return false;
            }
        }

        if ((author == null)&&(null != book.author)) {
            return false;
        }else {
            if (!author.equals(book.author)){
                return false;
            }
        }

        if (price != book.price){
            return false;
        }

        return true;
    }

    public int hashCode(){
        return 47*price + 19*((title==null)?0:title.hashCode()) + 31*((author==null)?0:author.hashCode());
    }

    public String toString(){
        return getClass().getName() + " @ " + "title: " + title + ", author: " + author + ", price: " + price + ", edition: " + edition;
    }

    public Book clone() throws CloneNotSupportedException {
        return (Book)super.clone();
    }
}
