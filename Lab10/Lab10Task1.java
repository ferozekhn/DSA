import java.util.Queue;
import java.util.LinkedList;
class Lab10Task1{

    class Node {
        int data;
        Node left, right;
        Node(int data) {
          this.data = data;
          this.left = right = null;
        }
    }
    
    Node root;
    Lab10Task1() {
        root = null;
    }
    public void Add(int data){
        root = addNode(root, data);
    }

    public Node addNode(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = addNode(root.left, data);
        }
        else if (data > root.data) {
            root.right = addNode(root.right, data);
        }
         return root;
    }


    public void preorder(Node root){
        if(root!=null){
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
// level order traversal for the printing binary tree
    public void levelOrder(Node root){
        if(root== null){
            return;
        }
       Queue<Node> queue = new LinkedList<>();
       queue.add(root);
       queue.add(null);
       while(!queue.isEmpty()){
       Node temp=queue.remove();
       if (temp==null) {
        System.out.println(" ");
       if (queue.isEmpty()) {
        break;
       }else {
        queue.add(null);
       }
       } else {
        System.out.println(temp.data+" ");
        if(temp.left!=null){
            queue.add(temp.left);
        }
        if(temp.right!=null){
            queue.add(temp.right);
        }
    }}

 }
 
 
    public static void main(String[] args) {
        Lab10Task1 task1 = new Lab10Task1();
        task1.Add(5);
        task1.Add(6);
        task1.Add(4);
        task1.preorder(task1.root);
        System.out.println();
        task1.inorder(task1.root);
        System.out.println();
        task1.postOrder(task1.root);
        System.out.println();
        System.out.println();
        task1.levelOrder(task1.root);
        System.out.println();
    }




}