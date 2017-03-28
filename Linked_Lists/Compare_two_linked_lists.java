/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
  
    int compare = 1;
    
    if(headA == null && headB == null){
        compare = 1;
    }
    else{
        Node nodeA = headA;
        Node nodeB = headB;
        
        int max_size =0;
        int sizeA = 0,sizeB=0;
        
        
        while(nodeA != null){
            sizeA++;
            nodeA = nodeA.next;
        }
        while(nodeB != null){
            sizeB++;
            nodeB = nodeB.next;
        }
        
         
        if(sizeA>sizeB){
            max_size = sizeA;
            return 0;
        }
        else if(sizeB>sizeA){
            max_size = sizeB;
            return 0;
        }
        else{
            max_size = sizeA;
        }
        
        nodeA = headA;
        nodeB = headB;
    
        int count=0;
        while(count!= max_size){
           // System.out.println("Comparing "+nodeA.data+" "+nodeB.data);
            if(nodeA.data == nodeB.data){
                nodeA = nodeA.next;
                nodeB = nodeB.next;
            }
            else{
                compare =0;
                break;
            }
            
            count++;
        }
    }
    
    return compare;
}
