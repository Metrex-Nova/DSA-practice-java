public class Solution1 {

    // Method to check for duplicates
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Main method — entry point
    public static void main(String[] args) {
        Solution1 sol = new Solution1();

        int[] nums = {1, 2, 3, 4}; 
        boolean result = sol.containsDuplicate(nums);

        System.out.println("Contains duplicate? " + result);
    }
}
