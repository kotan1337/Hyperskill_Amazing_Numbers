package numbers;

import java.util.Scanner;

public class Numbers2 {
    public Numbers2() {

    }

    public void run() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        long n = s.nextLong();

        if (n > 0) {
            showProperties(n);
        } else {
            System.out.println("This number is not natural!");
        }
    }

    public void showProperties(long n) {
        System.out.printf("Properties of %d%n", n);
        System.out.printf("        even: %b%n", !isOdd(n));
        System.out.printf("         odd: %b%n", isOdd(n));
        System.out.printf("        buzz: %b%n", isBuzz(n));
        System.out.printf("        duck: %b%n", isDuck(n));
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
}
