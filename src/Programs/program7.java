package Programs;
import java.util.*;
//7. Count Subarrays With Sum = K Input: [1,1,1], K = 2 Output: 2
public class program7 {
    public static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);   // very important (prefix sum = 0 has appeared once)

        int count = 0;
        int sum = 0;

        for (int num : nums) {

            sum += num;   // update running sum

            // check if (sum - k) existed
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // store this prefix sum count
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1};
        System.out.println(subarraySum(arr, 2));  // Output: 2
    }
}

