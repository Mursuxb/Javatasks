package Week3_3.library.model;

import java.util.ArrayList;

public class LibraryMember {
    private String name;
    private int memberId;
    public ArrayList<Book> borrowedBooks = new ArrayList<Book>();
    public ArrayList<Book> reservations = new ArrayList<Book>();
    // Constructor, getters, setters

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
}
