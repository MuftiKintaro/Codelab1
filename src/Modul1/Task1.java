package Modul1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of value: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        int[] angka = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Enter the values: ");
            angka[i] = scanner.nextInt();
        }
        int total = 0;
        for (int i = 0; i < n; i++){
            total += angka[i];
        }

        double rataRata = (double) total / n;
        System.out.println("The average is : " + rataRata);

        scanner.close();
    }
}
