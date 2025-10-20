package Modul2.Task.Task3;

import java.util.Scanner;


//After Refactoring Move Members
public class MainApp {
    public static void main(String[] args) {
        Library library = new Library();
        Member member = new Member("Mufti");

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Show All Books");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = input.nextInt();
            input.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = input.nextLine();
                    System.out.print("Enter author: ");
                    String author = input.nextLine();
                    library.addBook(new LibraryBook(title, author));
                    break;

                case 2:
                    System.out.print("Enter title to borrow: ");
                    String borrowTitle = input.nextLine();
                    library.borrowBook(borrowTitle, member);
                    break;

                case 3:
                    System.out.print("Enter title to return: ");
                    String returnTitle = input.nextLine();
                    library.returnBook(returnTitle, member);
                    break;

                case 4:
                    library.showAllBooks("\n=== List of Books ===");// setelah menggunakan introduce parameter
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        input.close();
    }
}
