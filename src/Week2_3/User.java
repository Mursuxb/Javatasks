package Week2_3;

import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }
    public Book returnBook(Book book){
        for (Book borrow : borrowedBooks){
            if (borrow == book){
                Book returning = borrow;
                borrowedBooks.remove(book);
                System.out.println(book.getTitle() + " was returned");
                return returning;
            }
        }
        System.out.println("Book was not returned");
        return book;
    }
}
