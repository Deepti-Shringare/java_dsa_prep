import java.util.Arrays;

public class nextPermutation {

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        // Step 1: Find the first decreasing element from the right
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: If found, find the next larger element and swap
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }

            // Swap
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Step 3: Reverse the rest of the array (suffix)
        reverse(nums, i + 1, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // Driver code
    public static void main(String[] args) {
        nextPermutation np = new nextPermutation();

        int[] nums = {1, 2, 3};
        System.out.println("Original: " + Arrays.toString(nums));

        np.nextPermutation(nums);
        System.out.println("Next Permutation: " + Arrays.toString(nums));
    }
}
