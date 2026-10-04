import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        int currentYear = 2026;
        int age = currentYear - birthYear;

        System.out.println("You are approximately " + age + " years old.");

        scanner.close();
    }
}