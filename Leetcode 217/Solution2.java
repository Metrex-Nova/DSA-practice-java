import java.util.HashSet;

public class Solution2 {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();
        for (int i : nums) {
            if (numsSet.contains(i)) {
                return true;
            }
            numsSet.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();

        int[] nums = {1, 2, 3, 1}; 
        boolean result = sol.containsDuplicate(nums);

        System.out.println("Contains duplicate? " + result);
    }
}

