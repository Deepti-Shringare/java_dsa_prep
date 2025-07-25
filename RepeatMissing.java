import java.util.*;

public class RepeatMissing {

    public int[] repeatNumber(final int[] A) {
        int n = A.length;
        int[] count = new int[n + 1]; // To count occurrences of numbers

        // Count frequency of each number
        for (int num : A) {
            count[num]++;
        }

        int repeat = -1, missing = -1;

        // Check for missing and repeating numbers
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                repeat = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }

        return new int[]{repeat, missing};
    }

    public static void main(String[] args) {
        RepeatMissing obj = new RepeatMissing();

        // Sample input: numbers from 1 to 6, but 1 is repeated and 5 is missing
        int[] A = {4, 3, 6, 2, 1, 1};

        int[] result = obj.repeatNumber(A);

        System.out.println("Repeating Number: " + result[0]);
        System.out.println("Missing Number: " + result[1]);
    }
}
