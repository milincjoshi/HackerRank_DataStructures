 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value)
{
    if(root == null){
        root = new Node();
        root.data = value;
        return root;
    }
    else{
        
        if(value>root.data){
            if(root.right == null){
                Node node = new Node();
                node.data = value;
                root.right = node;
            }
            else{        
                Insert(root.right, value);
            }
        }
        if(value< root.data){
            if(root.left == null){
                Node node = new Node();
                node.data = value;
                root.left = node;
            }
            else{        
                Insert(root.left, value);
            }
        }
        
        return root;
    }

    
       
}


