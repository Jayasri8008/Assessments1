package Programs;
import java.util.*;
//5. Rotate Array by K Steps Input: [1,2,3,4,5,6,7], k = 3 Output: [5,6,7,1,2,3,4]
public class program5 {
    public static void rotate(int[] nums, int k) {

        int n = nums.length;
        int[] result = new int[n];   // new array

        // Normalize k (in case k > n)
        k = k % n;

        // Place each element in its new position
        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = nums[i];
        }

        // Copy result back into nums
        for (int i = 0; i < n; i++) {
            nums[i] = result[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
        // Output: [5,6,7,1,2,3,4]
    }
}

