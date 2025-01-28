TC -> O((N−M)∗M)
SC -> O(1)

class Solution {
    public int strStr(String haystack, String needle) {
        // If needle is empty, return 0 as per the problem statement
        if (needle.isEmpty()) {
            return 0;
        }

        // Iterate through haystack, ensuring there is enough room for the needle
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Check if the substring of haystack matches the needle
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i; // Return the starting index of the match
            }
        }

        return -1; // Return -1 if no match is found
    }
}
