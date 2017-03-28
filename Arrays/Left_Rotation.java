import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Left_Rotation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++){
            arr[i] = scan.nextInt();
        }
        
        for(int i=0; i<d;i++){
            
            //perform 1 rotation
            int temp = arr[0];
            for(int j = 1;j<n;j++){
                arr[j-1] = arr[j];
            }
            arr[n-1] = temp;
            
        }
        
        for(int i=0; i<n ;i++){
            System.out.print(arr[i]+" ");
        }
      
    }
}   