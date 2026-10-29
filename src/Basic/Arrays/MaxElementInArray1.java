package Basic.Arrays;
//Find the maximum element from the given array of integers.
//Approach B
import java.util.*;
public class MaxElementInArray1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //Read the size of the arrayy
        int n = sc.nextInt();
        int a[] = new int[n];
        
        //Reading the Array elements
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        
        //Initialising max with smallest possible int value
        int max=Integer.MIN_VALUE;
        
        //Traversing to find max element
        for(int i=0; i<n; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        
        //Printing the max element
        System.out.println(max);
        
        //TC:O(N)
        //SC:O(1)
    }
}
