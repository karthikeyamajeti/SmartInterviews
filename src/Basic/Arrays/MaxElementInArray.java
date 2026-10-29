package Basic.Arrays;
//Find the maximum element from the given array of integers.
//Approach A
import java.util.*;
public class MaxElementInArray {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        
        //Read the size of the arrayyy
        int n = sc.nextInt();
        int a[] = new int[n];
        
        //Reading the array elements 
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        //Taking a variable called max which initialises with the first element 
        int max = a[0];
        
        //Now comparing the first elements with remaining element using traversing
        for(int i=0; i<n; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        
        //Printing the max value
        System.out.println(max);
        
        //TC:O(N)
        //SC:O(1)
        //Note: The array must contains atleast one element
    }
}
