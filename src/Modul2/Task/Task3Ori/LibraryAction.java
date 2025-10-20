package Modul2.Task.Task3Ori;

public interface LibraryAction {
    void addBook(Book book);
    void borrowBook(String title, Member member);
    void returnBook(String title, Member member);
    void showAllBooks();
}

