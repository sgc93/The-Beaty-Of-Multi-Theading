package The_Validators;

import java.util.Scanner;

public class Launcher {
    /**
     * @param args
     */
    public static void main(String[] args){
        System.out.println("\033[32m");
        System.out.println("    This is a demostration of Multi-Threading in the concept of input validations. \n    Your inputs are validated by different independent threads.");
        System.out.println("\033[0m");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Username: ");
            String username = scanner.nextLine();

            IsBlank isBlank = new IsBlank(username);
            IsStrong isStrong = new IsStrong(username);
            isValid validity = new isValid(username);
            isBlank.start();
            try {Thread.sleep(1000);} catch (Exception e) {}
            validity.start();
            try {Thread.sleep(1000);} catch (Exception e) {}
            isStrong.start();
        }

        System.out.println("Your have created username successfully!");
    }
}
