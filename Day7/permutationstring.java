import java.util.Arrays;

public class permutationstring {
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false; // If s1 is longer than s2, not possible

        int[] s1Freq = new int[26]; // To store character frequency of s1
        int[] s2Freq = new int[26]; // To store character frequency of the current window in s2

        // Fill s1Freq array with character counts of s1
        for (char c : s1.toCharArray()) {
            s1Freq[c - 'a']++;
        }

        int windowSize = s1.length();

        // Traverse s2 with a sliding window
        for (int i = 0; i < s2.length(); i++) {
            s2Freq[s2.charAt(i) - 'a']++; // Add current character to window

            // Remove the character that is no longer in the window (when i >= windowSize)
            if (i >= windowSize) {
                s2Freq[s2.charAt(i - windowSize) - 'a']--;
            }

            // Compare frequency arrays
            if (Arrays.equals(s1Freq, s2Freq)) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo")); // true
        System.out.println(checkInclusion("ab", "eidboaoo")); // false
    }
}
    

