package numbers;

import java.util.Scanner;

public class Numbers5 {
    public void run() {
        Scanner s = new Scanner(System.in);
        String input;
        String[] args;
        long arg;

        System.out.println("Welcome to Amazing Numbers!");
        menu();

        while (true) {
            System.out.print("Enter a request: ");
            input = s.nextLine();

            if (input.isEmpty()) {
                menu();
            } else {
                args = input.split(" ");

                if (args.length == 1) {
                    try {
                        arg = Long.parseLong(args[0]);
                    } catch (NumberFormatException e) {
                        System.out.println("\nThe first parameter should be a natural number or zero.\n");
                        continue;
                    }

                    if (arg == 0) {
                        System.out.println("\nGoodbye!");
                        break;
                    } else if (arg < 0) {
                        System.out.println("\nThe first parameter should be a natural number or zero.\n");
                    } else {
                        showProperties(arg);
                    }
                } else if (args.length == 2) {
                    try {
                        arg = Long.parseLong(args[0]);
                    } catch (NumberFormatException e) {
                        System.out.println("\nThe first parameter should be a natural number or zero.\n");
                        continue;
                    }

                    if (arg == 0) {
                        System.out.println("\nGoodbye!");
                        break;
                    } else if (arg < 0) {
                        System.out.println("\nThe first parameter should be a natural number or zero.\n");
                    } else {
                        long repeat = Long.parseLong(args[1]);

                        if (repeat > 0) {
                            for (long i = 0; i < repeat; i++) {
                                System.out.println(showProperties2(arg + i));
                            }

                            System.out.println();
                        } else {
                            System.out.println("\nThe second parameter should be a natural number.\n");
                        }
                    }
                }
            }
        }
    }

    public void menu() {
        System.out.println();
        System.out.println("""
                Supported requests:
                - enter a natural number to know its properties;
                - enter two natural numbers to obtain the properties of the list:
                  * the first parameter represents a starting number;
                  * the second parameters show how many consecutive numbers are to be processed;
                - two natural numbers and a property to search for;
                - separate the parameters with one space;
                - enter 0 to exit.
                """);
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

    public boolean isGapful(long n) {
        boolean res = false;

        if ((int) Math.log10(n) > 1) {
            int first = (int) (n / (long) Math.pow(10, (int) Math.log10(n)));
            int last = (int) (n % 10);
            res = n % ((long) 10 * first + last) == 0;
        }

        return res;
    }

    public boolean isSpy(long n) {
        int sum = 0;
        int prod = 1;

        while (n > 0) {
            sum += n % 10;
            prod *= n % 10;
            n /= 10;
        }

        return sum == prod;
    }

    public void showProperties(long n) {
        System.out.println();
        System.out.printf("Properties of %d%n", n);
        System.out.printf("        buzz: %b%n", isBuzz(n));
        System.out.printf("        duck: %b%n", isDuck(n));
        System.out.printf(" palindromic: %b%n", isPalindromic(n));
        System.out.printf("         spy: %b%n", isSpy(n));
        System.out.printf("      gapful: %b%n", isGapful(n));
        System.out.printf("        even: %b%n", !isOdd(n));
        System.out.printf("         odd: %b%n", isOdd(n));
        System.out.println();
    }

    public String showProperties2(long n) {
        StringBuilder sb = new StringBuilder();

        sb.append(n);
        sb.append(" is ");

        if (isBuzz(n)) {
            sb.append("buzz, ");
        }

        if (isDuck(n)) {
            sb.append("duck, ");
        }

        if (isGapful(n)) {
            sb.append("gapful, ");
        }

        if (isPalindromic(n)) {
            sb.append("palindromic, ");
        }

        if (isOdd(n)) {
            sb.append("odd");
        } else {
            sb.append("even");
        }

        return sb.toString();
    }
}
