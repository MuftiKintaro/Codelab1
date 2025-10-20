package Modul2.Task.Task3;

public interface LibraryAction {
    void addBook(LibraryBook libraryBook);
    void borrowBook(String title, Member member);
    void returnBook(String title, Member member);
    void showAllBooks(String Header);
}

