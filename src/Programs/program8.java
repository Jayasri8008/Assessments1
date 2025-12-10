package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//. 3-Sum (Triplets That Sum to Zero) Input: [-1,0,1,2,-1,-4] Output: [-1,-1,2], [-1,0,1]
public class program8 {
    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);   // Step 1: Sort the array
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first numbers
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // Skip duplicates on left
                    while (left < right && nums[left] == nums[left - 1]) left++;

                    // Skip duplicates on right
                    while (left < right && nums[right] == nums[right + 1]) right--;

                } else if (sum < 0) {
                    left++;   // we need a bigger number
                } else {
                    right--;  // we need a smaller number
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));
        // Output: [[-1, -1, 2], [-1, 0, 1]]
    }
}