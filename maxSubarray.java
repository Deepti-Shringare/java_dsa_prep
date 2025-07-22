//375 questions
//3

import java.util.*;

public class maxSubarray {
    public static void maxSubArraywithIndicies(int[]nums){
        int maxsum = nums[0];
        int currentSum = nums[0];

        int start=0 , end=0, s=0;

        for(int i=1; i<nums.length; i++){
            if(nums[i] > currentSum+nums[i]){
                currentSum=nums[i];
                s=i;

            }else{
                currentSum+=nums[i];
            }
if(currentSum>maxsum){
    maxsum=currentSum;
    start=s;
    end=i;
}

        }

        System.out.println("max sum"+ maxsum);
        System.out.println("sunarray:");
        for(int i=start; i<=end;i++){
      System.out.println(nums[i] + " ");
        }


    }

    public static void main(String[] args) {
        int [] nums = { -2,1,-3,4,-1,1};
        maxSubArraywithIndicies(nums);
    }
    
}
