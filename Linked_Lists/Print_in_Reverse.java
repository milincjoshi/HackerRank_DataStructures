/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

void ReversePrint(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    
    Node node = head;
    int count =0;
    while(node != null){
        count++;
        node = node.next;
    }
    //System.out.println(count+" size");
    node = head;
    int[] arr = new int[count+1];
    int i=0;
    while(node != null){
        arr[i] = node.data;
        i++;
        node = node.next;
    }
    
    for(int j=i-1;j>=0;j--){
        System.out.println(arr[j]);
    }
    

}
