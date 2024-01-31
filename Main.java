import java.util.Scanner;

public class Main {

    // Checks whether an Armstrong number exists

    // Armstrong Number -> 371 = 3^3 + 7^3 + 1^3

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number you want to check...");
        int number = scanner.nextInt();

        // CALCULATING THE NUMBER OF DIGITS

        int digitCount = 0;

        if (number == 0){
            digitCount = 1;
        }
        else {
            int  tempNumber = number;
            while (tempNumber > 0) {

                tempNumber /= 10;
                digitCount++;
            }
            System.out.println("Number of digits = " + digitCount);
        }

        int tempNumber = number;
        int sum = 0;

        do {
            int digitValue = tempNumber % 10;
            tempNumber /= 10;

            sum += Math.pow(digitValue, digitCount);

        } while (tempNumber > 0);

        if (number == sum) {
            System.out.println("It is an Armstrong Number");
        }
        else {
            System.out.println("It is not an Armstrong Number");
        }
    }
}
