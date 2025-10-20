package TaskModul1;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidNumberException extends Exception{
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class Task2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Masukkan angka: ");
            int angka = scanner.nextInt();


            validateAngka(angka);

            System.out.println("angka tersebut valid: " + angka);

        }catch (InvalidNumberException e){
            System.out.println("Error: " + e.getMessage());
        }catch (Exception e){
            System.out.println();
        }
    }
    public static void validateAngka(int angka) throws InvalidNumberException {
        if (angka < 0) {
            throw new InvalidNumberException("Angka yang dimasukkan harus positive");
        }
    }
}
