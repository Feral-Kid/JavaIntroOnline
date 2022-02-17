package lesson4.Part1.Task9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Books {
    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        this.books.add(book);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("");
        for (Book book : this.books) {
            stringBuilder.append(book.toString());
            stringBuilder.append("#########################################\n");
        }
        return stringBuilder.toString();
    }

    public Books getBooksByAuthor(String author) {
        return new Books(this.books.stream()
                .filter(o1 -> {
                    for (String str : o1.getAuthors()) {
                        if (str == author) return true;
                    }
                    return false;
                })
                .collect(Collectors.toList()));
    }

    public Books getBooksAfterThisYear(int year) {
        return new Books(this.books.stream()
                .filter( o1 -> o1.getYearOfPublishing() > year)
                .collect(Collectors.toList()));
    }

    public Books getBooksOfPublishingHouse(String publishingHouse) {
        return new Books(this.books.stream()
                .filter(o1 -> o1.getPublishingHouse().contentEquals(publishingHouse))
                .collect(Collectors.toList()));
    }

    Books(List<Book> books) {
        this.books = new ArrayList<>(books);
    }

    Books() {

    }
}
