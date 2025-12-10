package Programs;
import java.util.*;

//1. Find the First Missing Positive Integer Input: [3, 4, -1, 1] Output: 2
public class program1 {
    public static int firstMissingPositive(int[] nums) {

            Arrays.sort(nums);//Before sort: [3, 4, -1, 1]
                                //After sort:  [-1, 1, 3, 4]


        int smallest = 1;
            for (int num : nums) {
                if (num == smallest) {//-1==1;smallest=1;
                                        //1==1;smallest=2;
                                        //3==2;smallest=2;
                                        //4==2;smallest=2;
                    smallest++;
                }
            }

            return smallest;
        }

        public static void main(String[] args) {
            int[] arr = {3, 4, -1, 1};
            System.out.println(firstMissingPositive(arr)); // Output: 2
        }
    }
