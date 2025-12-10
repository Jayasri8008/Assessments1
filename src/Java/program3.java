package Java;
//2. Write a JavaScript program to reverse a string without using the reverse() method.
public class program3 {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;

        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println(fact);
    }
}
