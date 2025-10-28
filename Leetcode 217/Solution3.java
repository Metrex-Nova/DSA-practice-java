import java.util.Arrays;

public class Solution3 {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);  // O(n log n)
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution3 sol = new Solution3();

        int[] nums = {1, 2, 3, 4, 1}; 
        boolean result = sol.containsDuplicate(nums);

        System.out.println("Contains duplicate? " + result);
    }
}
