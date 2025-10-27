package Modul3.Task2;

import java.util.ArrayList;

/**
 * Kelas Library ini mengelola koleksi buku dan operasional seperti tambah, pinjam, dan pengembalian buku.
 */
public class Library implements LibraryAction {
    private ArrayList<LibraryBook> libraryBooks = new ArrayList<>();

    /**
     * Menambahkan buku ke koleksi perpustakaan.
     * @param libraryBook
     */
    @Override
    public void addBook(LibraryBook libraryBook) {
        getLibraryBooks().add(libraryBook);
        System.out.println("Book added: " + libraryBook.getTitle());
    }

    /**
     * Meminjam buku berdasarkan judul.
     * @param title
     * @param member
     */
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

    /**
     * Mengembalikan buku berdasarkan judul.
     * @param title
     * @param member
     */
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

    /**
     * Menampilkan semua buku yang ada di dalam perpustakaan.
     * @param Header judul tampilan
     */
    @Override
    public void showAllBooks(String Header) {
        System.out.println(Header); //introduce parameter
        for (LibraryBook b : getLibraryBooks()) {
            System.out.println(b.toString());//inline variable
        }
    }

    //refactoring Encapsulate Field

    /**
     * Mengambil semua daftar buku.
     * @return daftar buku
     */
    public ArrayList<LibraryBook> getLibraryBooks() {
        return libraryBooks;
    }

    /**
     * untuk mengatur daftar buku.
     * @param libraryBooks
     */
    public void setLibraryBooks(ArrayList<LibraryBook> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }
}
