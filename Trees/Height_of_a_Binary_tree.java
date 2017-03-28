	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
    static int height = 0;
	static int height(Node root) {
      	// Write your code here.
        if(root == null){
            return -1;
        }
        else{
            Node node = root;
            return 1+Math.max(height(node.left), height(node.right));            
        }
    }
