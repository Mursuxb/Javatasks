package Week3_3.library;

import Week3_3.library.model.Book;
import Week3_3.library.model.LibraryMember;
import Week3_3.library.system.Library;

public class Main {
    public static void main(String[] args) {
        Library kontulanKirjasto = new Library();
        Book twilight = new Book("Twilight", "Stephanie Meyers", "9781904233657");
        Book newMoon = new Book("New Moon", "Stephanie Meyers", "9781606863367");
        Book bible = new Book("King James Bible", "", "1");
        LibraryMember jim = new LibraryMember("Jim Standard", 21);
        LibraryMember tim = new LibraryMember("Tim Betterthan Jim", 22);
        kontulanKirjasto.addBook(twilight);
        kontulanKirjasto.addBook(newMoon);
        kontulanKirjasto.addBook(bible);
        kontulanKirjasto.addMember(jim);
        kontulanKirjasto.addMember(tim);
        kontulanKirjasto.borrowBook(jim, twilight);
        kontulanKirjasto.borrowBook(tim, newMoon);
        kontulanKirjasto.returnBook(jim, twilight);
        kontulanKirjasto.reserveBook(jim, bible);
        kontulanKirjasto.displayReservations(jim);
    }
}
