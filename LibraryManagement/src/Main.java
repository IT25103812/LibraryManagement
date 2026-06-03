import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {

            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    library.addBook(title);
                    break;

                case 2:
                    library.showBooks();
                    break;

                case 3:
                    library.showBooks();
                    System.out.print("Enter book number: ");
                    int borrowIndex = scanner.nextInt();
                    library.borrowBook(borrowIndex - 1);
                    break;

                case 4:
                    library.showBooks();
                    System.out.print("Enter book number: ");
                    int returnIndex = scanner.nextInt();
                    library.returnBook(returnIndex - 1);
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
