package Programs;
import java.util.*;
//. Longest Consecutive Sequence Input: [100, 4, 200, 1, 3, 2] Output: 4
public class program2 {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);//before:[100, 4, 200, 1, 3, 2]
                            //after:[1,2,3,4,100,200]
                            //index:[0,1,2,3,4,5]

        int longest = 1;
        int current = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {//2==2-1=>2==1=> 2==[2-2]+1;2==2;current=2,longest=1;
                                            //3==3-1=>3==2=> 3==[3-1]+1=>;current=3;longest=1;
                                        //4==4-1=>4-3==1=> 4==[4-1]+1=>  ;current=4;longest=1;
                                        //100==100-1=99 =>100==[4+1]=>;current=1;longest=4;
                                        //200==200-1=199 =>200==[100]+1;current=1;longext=4

                continue;
            }

            if (nums[i] == nums[i - 1] + 1) {
                current++;
            } else {
                longest = Math.max(longest, current);
                current = 1;
            }
        }

        return Math.max(longest, current);
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(arr)); // Expected output: 4
    }
}

