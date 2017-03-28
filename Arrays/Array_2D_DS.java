import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Array_2D_DS {

    public static void main(String[] args) {
        
        int sum_final=Integer.MIN_VALUE;
        int sum;
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        
for(int i=0; i<4;i++){        
for(int j=0;j<4;j++){
//System.out.println(arr[row_start][column_start]+","+arr[row_start][column_start+1]+","+arr[row_start][column_start+2]);
//System.out.println("");
    
//System.out.println("  "+arr[row_start+1][column_start+1]);
//System.out.println("");

//System.out.println(arr[row_start+2][column_start]+","+arr[row_start+2][column_start+1]+","+arr[row_start+2][column_start+2]);


sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
if(sum_final<sum){
    sum_final = sum;
}
    

}
}
        
       System.out.println(sum_final); 
        
    }
}
