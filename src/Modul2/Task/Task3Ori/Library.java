package Modul2.Task.Task3Ori;

import java.util.ArrayList;

public class Library implements LibraryAction {
    private ArrayList<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    @Override
    public void borrowBook(String title, Member member) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                if (!b.isBorrowed()) {
                    b.borrow();
                    System.out.println(member.getName() + " borrowed: " + b.getTitle());
                } else {
                    System.out.println("Sorry, the book is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }

    @Override
    public void returnBook(String title, Member member) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                if (b.isBorrowed()) {
                    b.returned();
                    System.out.println(member.getName() + " returned: " + b.getTitle());
                } else {
                    System.out.println("This book was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }

    @Override
    public void showAllBooks() {
        System.out.println("\n=== List of Books ===");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}

