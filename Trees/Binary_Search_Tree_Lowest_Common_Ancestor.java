

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

    static ArrayList<Node> l1;
    static ArrayList<Node> l2;
    static Node lca(Node root,int v1,int v2)
    {
        l1 = new ArrayList<Node>();
        l2 = new ArrayList<Node>();
               
        
        traverse1(root, v1);
        traverse2(root, v2);
        
        int n = 0;
        //System.out.println(l1.size()+" - "+l2.size());
       
        if(l1.size()>l2.size()){
            n = l2.size();
        }
        else{
            n = l1.size();
        }
       // System.out.println(n);

        for(int i=0; i<n; i++){
            //System.out.println(l1.get(i).data+" "+l2.get(i).data);                
            if(l1.get(i).data != l2.get(i).data){
               // System.out.println("returned in if "+l1.get(i-1).data);
                return l1.get(i-1);
            }
        }
        
        if(l1.size()>l2.size()){
           // System.out.println("returned in if 1 "+l1.get(n).data);
            return l1.get(n-1);
        }
        else{
           // System.out.println("returned in else  "+l2.get(n).data);
            return l2.get(n-1);            
        }
    }

    static void traverse2(Node node, int v2){
     
        if(v2<node.data){
            l2.add(node);
            traverse2(node.left, v2);
        }
        if(v2>node.data){
            l2.add(node);
            traverse2(node.right, v2);
        }
        if(v2 == node.data){
            l2.add(node);
            return;
        }
        
        
    }

    static void traverse1(Node node, int v1){
     
        if(v1<node.data){
            l1.add(node);
            traverse1(node.left, v1);
        }
        if(v1>node.data){
            l1.add(node);
            traverse1(node.right, v1);
        }
        if(v1 == node.data){
            l1.add(node);
            return;
        }
        
        
    }




