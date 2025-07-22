import java.util.*;

public class nextPermutation  {
    public void nextPermutation(int[] nums){
        int i = nums.length-2;
      
        //step1 : find first decreasing element from the right

        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }

        //step2: if found ,find next larger element and swap
        
    }
}
