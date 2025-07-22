import java.util.*;

public class chocoDist {
    public static int findMinDiff( int [] arr, int m){
        int n=arr.length;
        //sort
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;

        for(int i=0;i+m-1<n;i++){
            //cal difference of current windows

            int diff= arr[i+m-1]-arr[i];

            if(diff<minDiff){
                minDiff=diff;
            }
            
        }
            return minDiff;

       
    }
    public static void main(String [] args){
            int [] arr={7,3,2,4,9,12,56};
            int m=3;
            System.out.println(findMinDiff(arr,m));
        }
}
