//375 QUESTIONS
//1

import java.util.*;

public class MiniMaxFinder {
    public static int setmini (int [] A , int N){
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            if(A[i]<mini){
                mini=A[i];
            }
        }
        return mini;

    }

    public static int setmax(int[]A, int N){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            if(A[i]>maxi){
                maxi=A[i];
            }
        }
        return maxi;
    }
    

    public static void main(String [] args){
        int[] A={4,5,4,3,9,2};
        int N=A.length;
        System.out.println("minimum element: " + setmini(A, N));
        System.out.println("max element: " + setmax(A, N));
    }
}
