package com.example.pcs_movie_0097;

public class Movie {
    private String title;
    private String year;
    private String description;
    private String image;

    public Movie(String title, String year, String description, String image) {
        this.title = title;
        this.year = year;
        this.description = description;
        this.image = image;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
