package SelectionTest;

import java.util.Scanner;

public class LYCalculation {
    public static void main(String[] args) {
        int year;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a year : ");
        year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year! ");
        }
        else {
            System.out.println(year + " is not a leap year! ");
        }
    }
}
