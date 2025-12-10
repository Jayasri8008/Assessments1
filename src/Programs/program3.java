package Programs;
import java.util.*;
//3. Maximum Subarray Sum Input: [-2,1,-3,4,-1,2,1,-5,4] Output: 6
public class program3 {
    public static int maxSubArray(int[] nums) {

        int currentSum = 0;
        int maxSum = nums[0];
        for (int num : nums) {

            currentSum = currentSum + num;

            if (currentSum < num) {
                currentSum = num;
            }


            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
    }
}

