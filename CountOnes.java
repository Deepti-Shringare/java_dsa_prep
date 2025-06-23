public class CountOnes {
    public static int countOnes(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1); // Increment count if the last bit is 1
            n >>= 1; // Right shift to check the next bit
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 29; // Binary: 11101
        int count = countOnes(number);
        System.out.println("Number of 1's in binary representation of " + number + ": " + count);
    }
}