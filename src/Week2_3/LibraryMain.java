package Week2_3;

public class LibraryMain {
    public static void main(String[] args){
        Book newMoon = new Book("New Moon", "Stephenie Meyer", 2006);
        newMoon.setRating(4.0);
        Book twilight = new Book("Twilight", "Stephenie Meyer", 2005);
        twilight.setRating(5);
        Book bible = new Book("King James Bible", "",1769);
        bible.setRating(0.1);
        Book phantomMenace = new Book("Phantom Menace", "Terry Brooks", 1999);
        phantomMenace.setRating(3.4);
        Book attackOfTheClones = new Book("Attack of the Clones", "R.A. Salvatore", 2002);
        attackOfTheClones.setRating(4.1);
        newMoon.addReview("Better than the bible");
        newMoon.addReview("Bella sucks!");
        bible.addReview("When they add onehand mode?");
        Library grandLibrary = new Library();
        grandLibrary.addBook(newMoon);
        grandLibrary.addBook(twilight);
        grandLibrary.addBook(bible);
        grandLibrary.addBook(phantomMenace);
        grandLibrary.addBook(attackOfTheClones);
        grandLibrary.displayBooks();
        grandLibrary.findBooksByAuthor("Stephenie Meyer");
        grandLibrary.borrowBook("New Moon");
        grandLibrary.returnBook(newMoon);
        grandLibrary.returnBook(newMoon);
        grandLibrary.isBookAvailable("New Moon");
        grandLibrary.getAverageBookRating();
        grandLibrary.getMostReviewedBook();
    }
}
