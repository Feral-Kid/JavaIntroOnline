package Lesson4.Part1.Task9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum BindingType {
    SOFTCOVER,
    HARDCOVER
}
public class Book {
    private int id = 0;
    private String name = "";
    private String[] authors;
    private String publishingHouse = "";
    private int yearOfPublishing = 0;
    private int numberOfPages = 0;
    private int prise = 0;
    private BindingType bindingType = BindingType.HARDCOVER;

    @Override
    public String toString() {
        return
                "id=" + id + '\n' +
                "name='" + name + '\n' +
                "authors=" + Arrays.toString(authors) + '\n' +
                "publishingHouse='" + publishingHouse + '\n' +
                "yearOfPublishing=" + yearOfPublishing + '\n' +
                "numberOfPages=" + numberOfPages + '\n' +
                "prise=" + prise + '\n' +
                "bindingType=" + bindingType + '\n';
    }

    public Book(int id, String name, String[] authors, String publishingHouse, int yearOfPublishing, int numberOfPages, int prise, BindingType bindingType) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.prise = prise;
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public BindingType getBindingType() {
        return bindingType;
    }

    public void setBindingType(BindingType bindingType) {
        this.bindingType = bindingType;
    }
}