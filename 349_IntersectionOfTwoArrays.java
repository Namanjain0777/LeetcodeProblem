// TC -> O(M+N)
// SC -> O(M+N)
import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Create a set to store unique elements from nums1
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        // Use another set to store the intersection
        HashSet<Integer> intersection = new HashSet<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        // Convert the intersection set to an array
        int[] result = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            result[i++] = num;
        }
        return result;
    }
}
