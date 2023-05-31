package classOne;

import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class one {
    Scanner sc = new Scanner(System.in);

    public void add() {
        System.out.print("Enter two integer value ");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(n1 + n2);
    }

    public void multi() {
        System.out.print("Enter two integer value ");
        Scanner sc = new Scanner(System.in);
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();

        System.out.println(n1 * n2);
    }

    public void printInt() {
        System.out.print("Enter an integer value ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        System.out.println(n1);
    }

    public void asci() {
        System.out.print("Enter two integer value ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        // int n2 = sc.nextInt();
        int asciiValue = (int) ch;
        System.out.println(asciiValue);
    }

    public void reminder() {
        System.out.print("Enter an integer value ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = n1 % n2;
        int n4 = n1 / n2;
        System.out.println("Quotient is " + n4 + " Reminder is " + n3);
    }

    public void Swap() {
        System.out.print("Enter an integer value ");
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("number1 " + n1 + " number2 " + n2);
        int n3 = n1;
        n1 = n2;
        n2 = n3;
        System.out.println("After swap, number1 " + n1 + " number2 " + n2);
    }

    public void evenOdd() {
        System.out.print("Enter an integer value ");
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        if (n1 % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        // System.out.println("After swap, number1 " + n1 + " number2 " + n2);
    }

    public void vowelConst() {
        System.out.print("Enter two integer value ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        // int n2 = sc.nextInt();
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("consonent");
        }
    }

    public void largest() {
        System.out.print("Enter an integer value ");
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int largest = n2;
        if (n1 > n2) {
            largest = n1;
        }
        if (n3 > n2) {
            largest = n3;
        }
        System.out.println(largest);
        // System.out.println("After swap, number1 " + n1 + " number2 " + n2);
    }

    public void quadratic() {
        System.out.print("Enter an integer value ");
        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

        float x1 = (float) ((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
        float x2 = (float) ((-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
        // System.out.println(largest);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(" number1 " + df.format(x1) + " number2 " + df.format(x2));
        ;
    }

    public void pyramid() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 3 - 1; i >= 1; i--) {
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void squre() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // for (int i = 3 - 1; i >= 1; i--) {
        // for (int j = 1; j <= 3 - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= 2 * i - 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
    }

    public void vectorAplication() {
        Vector<Integer> v = new Vector<>();
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            v.add(arr[i]);
        }
        Collections.sort(v);
        Collections.reverse(v);
        for (int i : v) {
            System.out.print(i);
        }
        int firstEle = v.firstElement();
        int lastEle = v.lastElement();
        int eleAt = v.elementAt(lastEle);
        boolean cont = v.contains(2);
        int indOf = v.indexOf(3);
        System.out.println(firstEle);
        System.out.println(lastEle);
        System.out.println(eleAt);
        System.out.println(cont);
        System.out.println(indOf);

    }

}
