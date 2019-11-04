import java.util.Scanner;

public class Book {
    private String bookTitle;
    private String author;
    private String description;
    private double price;
    private boolean inStock;
    //default constructor
    public Book(){}
    //overleaoded constructor
    public Book(String bookTitle, String author, String description, double price, boolean inStock){
        this.author = bookTitle;
        this.author = author;
        this.description = description;
        this.price = price;
        this.inStock = inStock;
    }
    public String getBookTitle(){
        return this.bookTitle;
    }
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isInStock() {
        return inStock;
    }

    public boolean inStock() {
        return inStock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }


    public void  getDisplayText(){
        System.out.println("Book Name: " + bookTitle + "\nAuthor " + author + "\nDiscription: " + description + "\nPrice: " + price );
    }


}
