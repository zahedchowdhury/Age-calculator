import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        int currentYear = 2026;

        if (birthYear > currentYear) {
            System.out.println("Invalid birth year.");
        } else {
            int age = currentYear - birthYear;

            System.out.println(name + ", you are approximately "
                    + age + " years old.");
        }

        scanner.close();
    }
}