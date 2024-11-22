public class BinaryTreeLab9 { 
   
    class Node {

         int data;
         Node left, right;
         Node(int data) {   
        this.data = data;         
       this.left = null; 
       this.right =null;

        }
    }     
     
    Node root;     
        BinaryTreeLab9(int data)  {          
        root = new Node(data);     
        }     
        BinaryTreeLab9() {  
        root = null;
        }  
        // Methods  

        public void addNode(Node root,int data) {    
         if (root == null) {
            root = new Node(data);
        } 
         if (data<root.data) {
             if (root.left == null) {
                root.left=new Node(data); 
                return;           
             }else{
              addNode(root.left, data);
             }
        
        }else{
           if (root.right==null) {
            root.right=new Node(data);
           }
        
        }
        
        
    Node temp=root;
       Node newNode=new Node(data);
       if (root.data>newNode.data) {
        temp.left=newNode;
        } else {
        temp.right=newNode;
        }
        temp=newNode;

 // handle all possible exceptions/errors               
      }    
    
      public void preorder() {
            preorderRec(root);
        }
        private void preorderRec(Node root) {
            if (root != null) {
                System.out.print(root.data + " ");
                preorderRec(root.left);
                preorderRec(root.right);
            }
        }
        
        public boolean searchNode(int data) {          
      // search data from Binary Tree and return true/false,  check all possible conditions 
      // handle all possible exceptions/errors 
      Node temp=root;
      if (temp != null) {
        if (root.data == data) {
            return true;
        }
        else if(temp.left==data){
           return true;
        }
        }

       } 
       public int countOfNodes(Node root) { 
         //return the no of nodes in a tree 
         if (root == null) {
            return 0;
         
        } 
        int leftCount = countOfNodes(root.left);
        int rightCount = countOfNodes(root.right);
        return leftCount + rightCount + 1;
    }
        
    public int height(Node root) {
       // return the height/depth of the tree  
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return (leftHeight > rightHeight)? leftHeight + 1 : rightHeight + 1;

        
    }
          public static void main(String[] args ) {  
        // Test the main method by creating node for different  multiple nodes with children  
        BinaryTreeLab9 tree = new BinaryTreeLab9(4);
        tree.addNode(2);
        tree.addNode(6);
        tree.addNode(1);
        tree.addNode(3);
        tree.addNode(5);
        tree.addNode(7);
        System.out.println("Preorder traversal of binary tree is: ");
        tree.preorder();
     //   System.out.println("\nSearch for node 3: " + tree.searchNode(3));
        System.out.println("Count of nodes in the tree: " + tree.countOfNodes(tree.root));
        System.out.println("Height of the tree: " + tree.height(tree.root));
        // You can add more tests as needed for different scenarios.

        
    }
 
} 