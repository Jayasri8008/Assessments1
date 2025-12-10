package Java;
import java.util.*;
//1. Write a Java program to check whether a given number is prime.
public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is NOT a prime number.");
        }
    }
}

