package Programs;
import java.util.*;
//4. Find Duplicate Number (Without Modifying Array) Input: [1,3,4,2,2] Output: 2
public class program4 {
    public static int findDuplicate(int[] nums) {

        int a = nums[0];
        int b = nums[0];


        do {
            a = nums[a];
            b = nums[nums[b]];
        } while (a != b);


        b = nums[0];

        while (a != b) {
            a = nums[a];
            b = nums[b];
        }

        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(arr));
    }
}


