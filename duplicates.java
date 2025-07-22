import java.util.*;

public class duplicates {
    public boolean containsDuplicate(int[] nums) {
        // Sort the array
        Arrays.sort(nums);

        // Check adjacent elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};

        // Create object of the class to call non-static method
        duplicates obj = new duplicates();
        boolean result = obj.containsDuplicate(nums);

        // Print result
        System.out.println("Result: " + result);
    }
}
