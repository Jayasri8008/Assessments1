package Programs;
import java.util.*;
//6. Product of Array Except Self Input: [1,2,3,4] Output: [24,12,8,6]
public class program6 {
    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Build prefix products
        // result[i] will store the product of all elements on the LEFT of i
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Multiply with suffix products
        // suffix keeps the product of all elements on RIGHT of i
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix = suffix * nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}

