package Week2_3;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int pubYear;
    private double rating = 0;
    public ArrayList<String> reviews = new ArrayList<>();

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.pubYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPubYear() {
        return pubYear;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    public void addReview(String review){
        this.reviews.add(review);
    }

    public double getRating() {
        return rating;
    }
}
