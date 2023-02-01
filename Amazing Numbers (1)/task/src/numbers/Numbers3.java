package numbers;

import java.util.Scanner;

public class Numbers3 {
    public Numbers3() {

    }

    public void run() {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Amazing Numbers!");
        menu();

        while (true) {
            System.out.print("Enter a request: ");
            long n = s.nextLong();

            if (n > 0) {
                showProperties(n);
            } else if (n == 0) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("The first parameter should be a natural number or zero.");
            }
        }
    }

    public void menu() {
        System.out.println();
        System.out.println("""
                Supported requests:
                - enter a natural number to know its properties;
                - enter 0 to exit.""");
        System.out.println();
    }

    public boolean isOdd(long n) {
        return n % 2 == 1;
    }

    public boolean isBuzz(long n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    public boolean isDuck(long n) {
        boolean res = false;

        while (n > 0) {
            if (n % 10 == 0) {
                res = true;
                break;
            }

            n /= 10;
        }

        return res;
    }

    public boolean isPalindromic(long n) {
        boolean res = true;

        while (n > 0) {
            if (n % 10 != n / ((long) Math.pow(10, (long) Math.log10(n)))) {
                res = false;
                break;
            } else {
                n = n - (n / ((long) Math.pow(10, (long) Math.log10(n))) * (long) Math.pow(10, (long) Math.log10(n)));
                n /= 10;
            }
        }

        return res;
    }

    public void showProperties(long n) {
        System.out.println();
        System.out.printf("Properties of %d%n", n);
        System.out.printf("        even: %b%n", !isOdd(n));
        System.out.printf("         odd: %b%n", isOdd(n));
        System.out.printf("        buzz: %b%n", isBuzz(n));
        System.out.printf("        duck: %b%n", isDuck(n));
        System.out.printf(" palindromic: %b%n", isPalindromic(n));
        System.out.println();
    }
}
