import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 
    class Stack{
	
	StackNode top;
   
	class StackNode{
		int data;
		StackNode next;
    	int max;
    }
   
	public void push(int i){
		StackNode node = new StackNode();
		node.data = i;
		if(top == null){
			top = node;
            node.max = node.data;
		}
		else{
            int j = top.max;
            if(i>j){
                node.max = node.data;
            }
            else{
                node.max = top.max;
            }
            node.next = top;
			top = node;
		}
	}

	public StackNode pop(){
		StackNode node = top;
        top = top.next;
		return node;
	}

	public int peek(){
		return top.data;
	}

	public boolean isEmpty(){
		if(top == null){
			return true;
		}
		else{
			return false;
		}
	}

}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        Solution sol = new Solution();
        Solution.Stack s = sol.new Stack();
        int n = scan.nextInt();
        for(int i=0; i<n ;i++){
            int a = scan.nextInt();
            
            if(a == 1){
                int b = scan.nextInt();
                s.push(b);
            }
            else if(a == 2){
                Solution.Stack.StackNode ss = s.pop();
            }
            else if(a == 3){
                System.out.println(s.top.max);
            }
        }
        
    }
}