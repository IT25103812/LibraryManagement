import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title) {
        books.add(new Book(title));
        System.out.println("Book added successfully.");
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);

            String status = book.isBorrowed() ? "Borrowed" : "Available";

            System.out.println((i + 1) + ". " + book.getTitle() + " - " + status);
        }
    }

    public void borrowBook(int index) {
        if (index < 0 || index >= books.size()) {
            System.out.println("Invalid book number.");
            return;
        }

        Book book = books.get(index);

        if (book.isBorrowed()) {
            System.out.println("Book already borrowed.");
        } else {
            book.borrowBook();
            System.out.println("You borrowed: " + book.getTitle());
        }
    }

    public void returnBook(int index) {
        if (index < 0 || index >= books.size()) {
            System.out.println("Invalid book number.");
            return;
        }

        Book book = books.get(index);

        if (!book.isBorrowed()) {
            System.out.println("Book was not borrowed.");
        } else {
            book.returnBook();
            System.out.println("You returned: " + book.getTitle());
        }
    }
}
