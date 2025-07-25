import java.util.*;

public class KthLargest {
    public int findKthLargest( int [] nums , int k){
        //main heap

        PriorityQueue <Integer> minHeap=new  PriorityQueue<>();

        for(int num:nums){
            minHeap.offer(num);

{
    minHeap.poll();

}       
 }
 return minHeap.peek();
    }
}
