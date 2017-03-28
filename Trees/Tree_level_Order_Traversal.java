   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
    
   
   void LevelOrder(Node root)
    {
       if(root == null){
           return;
       }
       ArrayList<Node> n = new ArrayList<Node>();      
       n.add(root);
       int i = 0;
       while(i<n.size()){
           Node ni = n.get(i);
           if(ni.left != null){n.add(ni.left);}
           if(ni.right != null){n.add(ni.right);}
           i++;             
        
       }
       for(int j =0; j<n.size(); j++){
           System.out.print(n.get(j).data+" ");
       }
      
    }
