package Basic.Arrays;
//Find the maximum element from the given array of integers.
//Approach C
import java.util.Scanner;
public class MaxElementInArray2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //Reading the size of the array
        int n = sc.nextInt();
        int a[] = new int[n];
        
        //Reading the Array elements 
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        //Initialising the max value with the first element 
        int max = a[0];
        
        //Using Math.max() function
        for(int i=0; i<n; i++){
            max=Math.max(a[i],max);
        }
        
        //Printing the max value
        System.out.println(max);
        
        //TC:O(N)
        //SC:O(1)
    }
}
