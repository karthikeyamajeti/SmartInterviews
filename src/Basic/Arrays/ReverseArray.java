package Basic.Arrays;
//Print the array in reverse order
import java.util.*;
public class ReverseArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //Read the size of the array
        int n = sc.nextInt();
        
        //Read the Array elements
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        // Reverse the array by swapping elements from both ends
        // Iterate only till the middle of the array
        for(int i=0; i<n/2; i++){
            int temp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = temp;
        }
        
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        
        //TC:O(N)
        //SC:O(1)
    }
}