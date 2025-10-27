package Modul3.Task2;

/**
 * Kelas LibraryBook mempresentasikan buku di dalam perpustakaan.
 */
//Refactoring Rename
public class LibraryBook {
    private String title;
    private String author;
    private boolean isBorrowed;

    /**
     * Untuk membuat objek buku baru
     * @param title
     * @param author
     */
    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    /**
     * Mengambil judul buku.
     * @return judul buku
     */
    public String getTitle() {
        return title;
    }

    /**
     * Mengambil nama penulis.
     * @return nama penulis
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Mengecek apakah buku itu sedang di pinjam atau tidak.
     * @return
     */
    public boolean isBorrowed() {
        return isBorrowed;
    }

    /**
     * untuk menandai kalau buku tersebut sedang di pinjam.
     */
    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
        }
    }

    /**
     * Menandai buku tersebut sudah di kembalikan.
     */
    public void returned() {
        if (isBorrowed) {
            isBorrowed = false;
        }
    }

    /**
     * Menampilkan informasi buku dalam format teks.
     * @return teks berisi judul, penulis, dan status buku
     */
    @Override
    public String toString() {
        return title + " by " + author + (isBorrowed ? " (Borrowed)" : " (Available)");
    }
}
