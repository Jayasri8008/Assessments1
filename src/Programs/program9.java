package Programs;

import java.util.Arrays;
//9. Move All Zeroes to End Input: [0,1,0,3,12] Output: [1,3,12,0,0]
public class program9 {
    public static void moveZeroes(int[] nums) {

        int index = 0;


        for (int num : nums) {
            if (num != 0) {
                nums[index] = num;
                index++;
            }
        }


        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr)); // [1, 3, 12, 0, 0]
    }
}

