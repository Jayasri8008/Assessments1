package Java;
//5. Write a Java program to count the number of vowels in a string.
public class program5 {
    public static void main(String[] args) {

        String str = "hello world";
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}

