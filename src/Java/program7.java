package Java;
//7. Write a Java program to find the sum of all elements in an integer array.
public class program7 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum of array elements: " + sum);
    }
}

