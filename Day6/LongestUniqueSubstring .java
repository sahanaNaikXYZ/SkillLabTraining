import java.util.*;

public class LongestUniqueSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0, maxLength = 0;
        Set<Character> window = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (window.contains(s.charAt(right))) {
                window.remove(s.charAt(left));
                left++;
            }
            window.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        String r = "bbbbb";
        String p = "pwwkew";

        System.out.println("Length of Longest Substring in '" + s + "': " + lengthOfLongestSubstring(s));
        System.out.println("Length of Longest Substring in '" + r + "': " + lengthOfLongestSubstring(r));
        System.out.println("Length of Longest Substring in '" + p + "': " + lengthOfLongestSubstring(p));
    }
}