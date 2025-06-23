public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // count of elements not equal to val
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        // Print the modified array up to the new length
        System.out.println("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        return k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println("Original array: " + java.util.Arrays.toString(nums));
        int k = solution.removeElement(nums, val);
        System.out.println("Number of elements not equal to " + val + ": " + k);
    }
}
