import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        String answer = "y";
        while (answer.equalsIgnoreCase("y")) {
            System.out.println("Do you want to enter a book?");
            answer = keyboard.nextLine();

            if (answer.equalsIgnoreCase("y")) {
                Book book = new Book();
                System.out.println("Enter the Author: ");
                book.setAuthor(keyboard.nextLine());
                System.out.println("Enter the title: ");
                book.setBookTitle((keyboard.nextLine()));
                bookList.add(book);
            }
        }
        System.out.println("All the books:");
        for(Book book : bookList) {
            System.out.println(book.getAuthor());
            System.out.println(" ");
            System.out.println(book.getBookTitle());
            System.out.println();
        }

            }
        }



