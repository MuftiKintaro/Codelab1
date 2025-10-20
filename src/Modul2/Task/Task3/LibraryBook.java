package Modul2.Task.Task3;


//Refactoring Rename
public class LibraryBook {
    private String title;
    private String author;
    private boolean isBorrowed;

    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
        }
    }

    public void returned() {
        if (isBorrowed) {
            isBorrowed = false;
        }
    }

    @Override
    public String toString() {
        return title + " by " + author + (isBorrowed ? " (Borrowed)" : " (Available)");
    }
}
