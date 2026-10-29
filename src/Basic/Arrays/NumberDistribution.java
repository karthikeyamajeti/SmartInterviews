package Basic.Arrays;
/*
Print the count of the occurrences of positive integers, negative integers, 
and zeroes in the given array.
Approach A: Traversal using counters
*/
import java.util.*;
public class NumberDistribution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //Read the size of the arrayyy
        int n = sc.nextInt();
        int a[] = new int[n];
        
        //Read the array elements
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        //Taking 3 variables which we can need to find freq of each variable
        int pos = 0, neg =0, zer = 0;
        
        //Traversing to find positive, negative and zero
        for(int i=0; i<n; i++){
            
            //Finding the element is pos,neg,zero using if else if ladder
            if(a[i]>0){
                pos++;
            }else if(a[i]<0){
                neg++;
            }else{
                zer++;
            }
            
        }
        
        //Printing the occurence of zero's, positive numbers , negative numbers
        System.out.println(zer+" "+pos+" "+neg);
        
        //TC:O(N)
        //SC:O(1)
    }
}
