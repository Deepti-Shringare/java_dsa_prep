import java.util.Arrays;
import java.util.Scanner;

public class leetcode {

    public int removeDuplicates(int[] arr) {
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
         int[] nums = new int[size];

         System.out.println("Enter the elements of the array:");
         for (int i = 0; i < size; i++) {
             nums[i] = scanner.nextInt();
         }

        // Now you can use the nums array
         System.out.println("INPUT: " + Arrays.toString(nums));

         System.out.println(removeDuplicates.[int[1,1,2,2]arr]);

        // String input=Arrays.toString(nums);

        // for(int i=0; i<input.length();i++){
        //     for(int j=0;j<input.length();j++){
        //         if(i==j){
                    
        //             char newChar =' ';
        //             StringBuilder sb= new StringBuilder(input);
        //             sb.setCharAt(i, newChar);
        //             String modified_String=sb.toString();
        //             System.out.println(modified_String);
        //         }
                
                
        //     }
        // }

        
       
    }

    
    
}
