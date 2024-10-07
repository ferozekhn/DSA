// Implement Queue using two stacks 
class Stack
{
    class Node
   {
        int data; // integer data
        Node next; // pointer to the next node
        Node(int data){
            this.data = data;
            this.next = null;
        }
   }

//     private Node top;
      public Stack() {
      //this.top = null;
    }
    int size=0;
     Node head;

     // Utility function to add an element x in the stack
     
     public void push(int x) 
 {
    Node newNode = new Node(x);
 if(head==null){
    head= newNode;
 }
    else{
       newNode.next=head;
       head=newNode;
       size++;

    }
 }

 public boolean isEmpty()
 {
    boolean a=false;
    if (head == null) {
        a= true;
        
    }
    return a;
 }

 /// Utility f9unction to return top element in a stack
 public int top()
 {
    int a=0;
    if (isEmpty()) {
        System.out.println(" our list is empty.");
        
    }else{
         a=head.data;
    }
    return a;
 }
 // Utility function to pop top element from the stack andcheck for Stack underflow
 public int  pop()
 {
   int a=0;
    if (isEmpty()) {
        System.out.println(" our list is empty.");
        
    }else{
      
        a= head.data;
        head=head.next;
         
       
         size--;
    }
    return a;

 }

}
// class StackImpl
// {
//  public static void main(String[] args)
//  {
//  Task2Lab4 stack= new Task2Lab4();
//  stack.push(1);
//  stack.push(2);
//  stack.push(3);
//  System.out.println("Top element is " + stack.top());
//  stack.pop();
//  stack.pop();
//  //stack.pop();
 
// stack.pop();

//  if (stack.isEmpty()) {
//  System.out.print("Stack is empty");
//  } else {
//  System.out.print("Stack is not empty");
//  }
//  }
// }

//creat Queue using two stacks
class Task5Lab4 {
 private Stack s1, s2;
 // Constructor 
 Task5Lab4() {
 s1 = new Stack();
 s2 = new Stack();
 }
 // Enqueue an item to the queue 
 public void enqueue(int data)
 {     
    s1.push(data); 
 }
 // Dequeue an item from the queue 
 public int dequeue()
{
  while(!s1.isEmpty()){
    s2.push(s1.pop());
  }
//   int temp=s2.pop();
//   while(!s2.isEmpty()){
//     s1.push(s2.pop());
//   }
  return s2.pop();
 }
 public static void main(String[] args) {
 int keys[] = { 1, 2, 3, 4, 5 };
 Task5Lab4 q = new  Task5Lab4();
 // insert above keys 
 for (int key : keys) {
 q.enqueue(key);
 }
 System.out.println(q.dequeue()); // print 1 
 System.out.println(q.dequeue()); // print 2 
 }
}