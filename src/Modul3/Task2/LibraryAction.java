package Modul3.Task2;

/**
 * INterface LibraryAction ini berisi operasi dasar untuk pengelolaan buku di perpustakaan.
 */
public interface LibraryAction {
    /**
     * Menambahkan buku ke perpustakaan.
     * @param libraryBook
     */
    void addBook(LibraryBook libraryBook);

    /**
     * Meminjam buku berdasarkan judul.
     * @param title
     * @param member
     */
    void borrowBook(String title, Member member);

    /**
     * untuk mengembalikan buku berdasarkan judul.
     * @param title
     * @param member
     */
    void returnBook(String title, Member member);

    /**
     * ini berfungsi untuk menampilkan semua buku yang ada di dalam perpustakaan.
     * @param Header
     */
    void showAllBooks(String Header);
}

