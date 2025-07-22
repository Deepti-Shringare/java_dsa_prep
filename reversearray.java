//375 questions 
//2
import java.util.*;

public class reversearray {
    public static void reverse(int [] arr){
        int n=arr.length;

        int[]temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]= arr[n-i-1];
            
        }
        for(int i=0;i<n;i++){
                arr[i]=temp[i];
            }

            
    }
    public static void main(String[]args){

        int[]arr={1,2,3,45,5};
        reverse(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
                
            }
    
}
