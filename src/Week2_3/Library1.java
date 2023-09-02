package Week2_3;

import java.util.ArrayList;
import java.util.Objects;

public class Library1 {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();


    // Add methods here
    public void addBook(Book book) {
        this.books.add(book);
    }

    public void displayBooks() {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println(i + 1 + ": " + book.getTitle() + " by: " + book.getAuthor() + ", " + book.getPubYear());
        }
    }

    public void findBooksByAuthor(String author) {
        System.out.println("Books by author " + author + ":");
        for (Book book : this.books) {
            if (Objects.equals(book.getAuthor(), author)) {
                System.out.println("    " + book.getTitle() + " by: " + book.getAuthor() + ", " + book.getPubYear());
            }
        }
    }

    public void borrowBook(User user, String title) {
        if (users.contains(user)) {
            boolean found = false;
            for (int i = 0; i < books.size(); i++) {
                Book book = books.get(i);
                if (Objects.equals(book.getTitle(), title)) {
                    user.borrowBook(books.get(i));
                    books.remove(i);
                    System.out.println(title + " was borrowed");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("No such book was found in the system");
            }
        } else {
            System.out.println("User not found");
        }
    }

    public void returnBook(User user, Book book) {
        if (users.contains(user)) {
            boolean found = false;
            ArrayList<Book> borrowed = user.getBorrowedBooks();
            for (int i = 0; i < borrowed.size(); i++) {
                Book borrow = borrowed.get(i);
                if (borrow == book) {
                    books.add(borrowed.get(i));
                    borrowed.remove(i);
                    System.out.println(borrow.getTitle() + " was returned");
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("No such book was borrowed");
            }
        }else {
            System.out.println("User not found");
        }
    }

    public boolean isBookAvailable(String title) {
        boolean available = false;
        for (Book book : books) {
            if (Objects.equals(book.getTitle(), title)) {
                available = true;
                System.out.println(title + " is available");
                break;
            }
        }
        return available;
    }

    public double getAverageBookRating() {
        double sum = 0;
        for (Book book : books) {
            sum = sum + book.getRating();
        }
        double average = sum / books.size();
        System.out.printf("The library's average rating is: %.2f \n", average);
        return average;
    }

    public void getMostReviewedBook() {
        String most = "";
        int amount = 0;
        for (Book book : books) {
            if (book.reviews.size() > amount) {
                most = book.getTitle();
                amount = book.reviews.size();
            }
        }
        System.out.println("The book with the most reviews is: " + most + " with " + amount + " reviews");
    }

    public User createUser(String name, int age) {
        User user = new User(name, age);
        users.add(user);
        System.out.println("New user created");
        return user;
    }
}