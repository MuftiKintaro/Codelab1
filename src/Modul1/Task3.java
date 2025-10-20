package Modul1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("=======Nilai===========");
            System.out.print("Masukkan Nama Siswa: ");
            String Nama = scanner.nextLine();

            System.out.print("Masukkan Nilai Siswa (0-100): ");
            int Nilai = scanner.nextInt();

            String Status;
            if (Nilai >= 60) {
                Status = "Lulus";
            } else {
                Status = "Gagal";
            }

            System.out.println("Nama Siswa: " + Nama);
            System.out.println("Nilai Siswa: " + Nilai + " Status: " + Status);

        } catch (InputMismatchException e) {
            System.out.println("Error: Wajib memasukkan angka untuk nilai!");
        } catch (Exception e) {
            System.out.println("Terjadi error lain: " + e.getMessage());
        }
    }
}
