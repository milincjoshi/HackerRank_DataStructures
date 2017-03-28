/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
ArrayList<Integer> mainlist;
boolean isBinaryTree = true;
boolean checkBST(Node root) {
   
    mainlist = new ArrayList<Integer>();

    InOrder(root);
    
    for(int i =1; i<mainlist.size(); i++){
        if(! (mainlist.get(i)> mainlist.get(i-1)) ){
            return false;
        }
        
    }
    
    return true;

}
void InOrder(Node node){
  
    if(node == null){
        return;
    }
    
    InOrder(node.left);    
    mainlist.add(node.data);
    InOrder(node.right);    
    
}