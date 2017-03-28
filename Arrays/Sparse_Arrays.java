import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sparse_Arrays {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        
        Scanner scan = new Scanner(System.in);
        
        int n = Integer.parseInt(scan.nextLine());
        String[] narr= new String[n];
        for(int i=0;i<n;i++){
            narr[i] = scan.nextLine();
        }
        
        int q = Integer.parseInt(scan.nextLine());
        String[] qarr = new String[q];       
        for(int i=0;i<q;i++){
            qarr[i] = scan.nextLine();
        }
        
        for(String i : qarr){
            int count = 0;
            for(String j : narr){
                if(j.equals(i)){
                    count++;
                }
            }
            System.out.println(count);
            
        }
        
    }
}