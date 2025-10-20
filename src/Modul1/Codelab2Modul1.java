package Modul1;

import java.util.Scanner;

class InvalidAgeMessage extends Exception {
    public InvalidAgeMessage(String message) {
        super(message);
    }
}

public class Codelab2Modul1 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            validateAge(age);

            System.out.println("Valid age entered: " + age);

        } catch (InvalidAgeMessage e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a number.");
        }
    }

    public static void validateAge(int age) throws InvalidAgeMessage {
        if (age <= 0 || age >= 120) {
            throw new InvalidAgeMessage("Age must be greater than 0 and less than 120.");
        }
    }
}
