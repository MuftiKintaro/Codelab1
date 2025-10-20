package Modul2.Task.Task3;

import java.util.ArrayList;

public class Library implements LibraryAction {
    private ArrayList<LibraryBook> libraryBooks = new ArrayList<>();

    @Override
    public void addBook(LibraryBook libraryBook) {
        getLibraryBooks().add(libraryBook);
        System.out.println("Book added: " + libraryBook.getTitle());
    }

    @Override
    public void borrowBook(String title, Member member) {
        FindBookByTitle(title, member);
    }
     //refactoring Extract method
    private void FindBookByTitle(String title, Member member) {
        for (LibraryBook b : getLibraryBooks()) {
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
        ReturnBookByTitle(title, member);
    }

    //Refactoring Extract Method
    private void ReturnBookByTitle(String title, Member member) {
        for (LibraryBook b : getLibraryBooks()) {
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
    public void showAllBooks(String Header) {
        System.out.println(Header); //introduce parameter
        for (LibraryBook b : getLibraryBooks()) {
            System.out.println(b.toString());//inline variable
        }
    }

    //refactoring Encapsulate Field
    public ArrayList<LibraryBook> getLibraryBooks() {
        return libraryBooks;
    }

    public void setLibraryBooks(ArrayList<LibraryBook> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }
}
