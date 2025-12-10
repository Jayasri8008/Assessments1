package Programs;
//10. Longest Substring Without Repeating Characters Input: "pwwkew" Output: 3
public class program10 {
    public static int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[128]; // last positions for ASCII chars
        for (int i = 0; i < lastIndex.length; i++) lastIndex[i] = -1;

        int start = 0;
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);


            if (lastIndex[c] >= start) {
                start = lastIndex[c] + 1;
            }

            lastIndex[c] = i;


            int windowLen = i - start + 1;
            if (windowLen > maxLen) maxLen = windowLen;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String input = "pwwkew";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: " + result); // expected 3
    }
}
