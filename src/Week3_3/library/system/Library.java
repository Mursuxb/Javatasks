package Week3_3.library.system;

import Week3_3.library.model.Book;
import Week3_3.library.model.LibraryMember;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<Book>();
    ArrayList<LibraryMember> members = new ArrayList<LibraryMember>();

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void addMember(LibraryMember member) {
        this.members.add(member);
    }

    public void borrowBook(LibraryMember member, Book book) {
        // Borrow book from the library
        if (books.contains(book)) {
            if (!book.getReservation() || (book.getReservation() && member.reservations.contains(book))) {
                books.remove(book);
                member.borrowedBooks.add(book);
                System.out.println(book.getTitle() + " was borrowed by " + member.getName());
            } else System.out.println(book.getTitle() + " is reserved for someone else");
        } else System.out.println("Library does not contain " + book.getTitle());
    }

    public void returnBook(LibraryMember member, Book book) {
        // Return book to the library
        if (member.borrowedBooks.contains(book)) {
            member.borrowedBooks.remove(book);
            books.add(book);
            System.out.println(book.getTitle() + " was returned by " + member.getName());
        } else System.out.println(book.getTitle() + " is not borrowed by " + member.getName());
    }

    public void reserveBook(LibraryMember member, Book book) {
        if (books.contains(book)) {
            if (!book.getReservation()) {
                book.changeReservation();
                member.reservations.add(book);
                System.out.println("Book reserved successfully");
            } else System.out.println("Book already reserved");
        } else System.out.println("Book was not found in library");
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (member.reservations.contains(book)) {
            book.changeReservation();
            member.reservations.remove(book);
            System.out.println("Book reservation canceled");
        } else System.out.println("Book reservation was not found on " + member.getName());
    }

    public void displayReservations(LibraryMember member) {
        if (!member.reservations.isEmpty()) {
            System.out.println("Reservations for " + member.getName() + ":");
            for (Book book : member.reservations) {
                System.out.println(book.getTitle());
            }
        } else System.out.println(member.getName() + " has no reservations");
    }
}
