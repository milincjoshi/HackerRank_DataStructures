/*
   class Node 
       int data;
       Node left;
       Node right;
*/
void left_traverse(Node root){
    if(root.left!= null){
        left_traverse(root.left);
    }
    System.out.print(root.data+" ");    

}
void right_traverse(Node root){
    if(root!= null){
        System.out.print(root.data+" ");    
        right_traverse(root.right);
    }

}

void top_view(Node root)
{
    left_traverse(root);
    right_traverse(root.right);
    
}
