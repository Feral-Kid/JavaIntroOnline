package lesson4.Part1.Task9;

public class Main {
    public static void main(String[] args) {
        Books books = new Books();
        String[] strings = new String[]{"LOl"};
        books.add(new Book(34, "name", new String[]{"Platon", "Socrat"},
                "House1", 2014,
                230, 10, BindingType.HARDCOVER));
        books.add(new Book(24, "Name2", new String[]{"Socrat"},
                "House2", 2000,
                300, 24, BindingType.HARDCOVER));
        books.add(new Book(30, "name3", new String[]{"Platon"},
                "House3", 2020,
                200, 5, BindingType.SOFTCOVER));
        System.out.println("Books after 2010:\n");
        System.out.println(books.getBooksAfterThisYear(2000));
        System.out.println("Books with \"House1\" publishing house:\n");
        System.out.println(books.getBooksOfPublishingHouse("House1"));
        System.out.println("Books with author Socrat:\n");
        System.out.println(books.getBooksByAuthor("Socrat"));

    }
}
