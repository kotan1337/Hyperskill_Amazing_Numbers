package numbers;

import java.util.Scanner;

public class Numbers1 {
    public Numbers1() {

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

    public boolean isBuzz(long n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    public boolean isOdd(long n) {
        return n % 2 == 1;
    }

    public void showProperties(long n) {
        System.out.printf("This number is %s.%n", isOdd(n) ? "Odd" : "Even");

        if (isBuzz(n)) {
            System.out.println("It is a Buzz number.");
            System.out.println("Explanation:");

            if (n % 7 == 0 && n % 10 == 7) {
                System.out.printf("%d is divisible by 7 and ends with 7.%n", n);
            } else if (n % 7 == 0) {
                System.out.printf("%d is divisible by 7.%n", n);
            } else {
                System.out.printf("%d ends with 7.%n", n);
            }
        } else {
            System.out.println("It is not a Buzz number.");
            System.out.println("Explanation:");
            System.out.printf("%d is neither divisible by 7 nor does it end with 7.%n", n);
        }
    }
}
