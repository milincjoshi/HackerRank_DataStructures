/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root)
{

    if(root.equals( null)){
            
    }
    else{

        char[] main_arr = S.toCharArray();

        Node node = root;
  
        
    
    for(char c : main_arr){
        
        if(c == '0'){
            node = node.left; 
            if(node.left == null && node.right == null){
                System.out.print(node.data);
                node = root;
            }
        }
        if(c == '1'){
            node = node.right;
           //System.out.print(node.left==null);
           //System.out.print(node.right == null );

            if(node.left == null  && node.right == null ){
                
                System.out.print(node.data);
                node = root;
            }
        }
        

    }
    }

       
}
