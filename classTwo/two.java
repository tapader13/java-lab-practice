package classTwo;

import java.util.Scanner;
//import java.util.Vector;

public class two {
    Scanner scanner = new Scanner(System.in);

    public void leapYear() {

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public void posetiveNegative() {

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    public void alphabetCheck() {

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("The character is an alphabet.");
        } else {
            System.out.println("The character is not an alphabet.");
        }
    }

    public void SumNatural() {

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        int sum = calculateSum(n);
        System.out.println("Sum of the first " + n + " natural numbers is: " + sum);
    }

    public int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public void factorial() {
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        long factorial = calculateFactorial(n);
        System.out.println("Factorial of " + n + " is: " + factorial);
    }

    public int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public void multi() {
        System.out.print("Enter a positive integer: ");

        int n = scanner.nextInt();

        generateMultiplicationTable(n);
    }

    public void generateMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public void fibonacci() {
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci Series:");
        int f = 0;
        int s = 1;
        System.out.println(f);
        System.out.println(s);
        for (int i = 2; i < n; i++) {
            int t = f + s;
            f = s;
            s = t;
            System.out.println(s);
        }
    }

    public void gcd() {
        System.out.print("Enter two positive integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int gcd = calculateGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    public int calculateGCD(int num1, int num2) {
        if (num1 == 0) {
            return num2;
        }
        if (num2 == 0) {
            return num1;
        }
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num1;
    }

    public void lcm() {
        System.out.print("Enter two positive integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int lcm = calculateLCM(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    public int calculateLCM(int num1, int num2) {
        int gcd = calculateGCD(num1, num2);
        return (num1 * num2) / gcd;
    }

    public void alphabet() {
        System.out.println("Alphabets (A to Z):");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
    }

    public void digitCount() {
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int digitCount = 0;
        while (number != 0) {
            digitCount++;
            number = number / 10;
        }
        System.out.println("Number of digits: " + digitCount);
    }

    public void reverse() {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;

        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        System.out.println("Reversed number: " + reversedNumber);
    }

    public void powerOfNumber() {

        System.out.println("Result: " + power());
    }

    public int power() {
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        return result;
    }

    public void palindrom() {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }

    public void prime() {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int flag = 0;
        if (number <= 1) {
            flag = 1;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public void IntervalPrime() {
        System.out.print("Enter the lower bound: ");
        int lowerBound = scanner.nextInt();
        System.out.print("Enter the upper bound: ");
        int upperBound = scanner.nextInt();

        for (int i = lowerBound; i <= upperBound; i++) {
            if (prm(i) != 0) {
                System.out.println(i);
            }
        }
    }

    private int prm(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return 0;
            }
        }
        return i;
    }

    public void armstrong() {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int result = 0;
        int n = String.valueOf(number).length();

        while (number != 0) {
            int remainder = number % 10;
            result += Math.pow(remainder, n);
            number /= 10;
        }

        if (originalNumber == result) {
            System.out.println(" Armstrong number.");
        } else {
            System.out.println(" Not an Armstrong number.");
        }
    }

    public void calculator() {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Error.");
        }
    }

    public void countVCInSntnc() {
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}
