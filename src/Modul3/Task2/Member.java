package Modul3.Task2;

/**
 * Kelas member ini untuk mempresentasikan anggota perpustakaan.
 */
public class Member {
    private String name;

    /**
     * Untuk membuat objek member baru.
     * @param name
     */
    public Member(String name) {
        this.setName(name);
    }

    /**
     * untuk mengambil nama anggota.
     * @return
     */
    //Refactoring encapsulate field
    public String getName() {
        return name;
    }

    /**
     * Untuk mengatur nama baru anggota.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
