//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {


    public static void numberToWords(int number) {
        if (number < 0 || number ==0) {
            System.out.println("Invalid value");
            return;
        }
        int reversedNumber = reverse(number);
        int originalDigitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reversedNumber);

        while (reversedNumber > 0) {
            int digit = reversedNumber % 10;
            printDigitAsWord(digit);
            reversedNumber /= 10;
        }
        for (int i = 0; i < originalDigitCount - reversedDigitCount; i++) {
            System.out.print("Zero");
        }
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }
    public static int getDigitCount(int number) {
        if (number < 0 || number == 0) {
            return -1;
        }
        int digitCount = 0;
        while (number > 0) {
            number /= 10;
            digitCount++;

        }
        return digitCount;
    }


    public static void printDigitAsWord(int digit) {
        switch (digit) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
            System.out.println("Seven");
            break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        numberToWords(number);
    }
}


