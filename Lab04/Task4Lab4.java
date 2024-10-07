// class Node
// {
//  int data;  
//  Node next; 
//  public Node(int data)
//  {
//  this.data = data;
//  this.next = null;
//  }
// }

// class Queue
// { 
//      static Node head;
//  private static Node rear = null, front = null;
//  // Utility function to remove front element from the queue 
// //and check for Queue Underflow 
//  public static int dequeue() // delete at the beginning 
//  {   
//     int num=0;
//     if (isEmpty()){
//         System.out.println(" ");

//     }else{
//         num=head.data;
//         head=head.next;
        
//     }
//     return num;
    
//  }
//  // Utility function to add an item in the queue 
//  public static void enqueue(int item) // insertion at the end 
//  {  front=head; 
//     Node newNode =new Node (item);
//     if (isEmpty()){
//       //  System.out.println("")
//        head=newNode;
//     }else{while(front.next!=null){
//         front=front.next;
//     }
//         front.next=newNode;
//     }
     
//  }
//  // Utility function to return top element in a queue 
//  public static int peek()
//  {
//     return head.data;
    
//  }
//  // Utility function to check if the queue is empty or not 
//  public static boolean isEmpty()
//  {  
//     boolean b= false;
//      if(head == null){
//         b= true;
//      } 
//      return b;
//  }
// }
// class Task4Lab4 {
//  public static void main(String[] args)
//  {
//  Queue q = new Queue();
//  q.enqueue(1);
//  q.enqueue(2);
//  q.enqueue(3);
//  q.enqueue(4);
//  System.out.printf("Front element is %d\n", q.peek());
//  q.dequeue();
//  q.dequeue();
//  q.dequeue();
//  q.dequeue();

 

 
//  if (q.isEmpty()) {
//  System.out.print("Queue is empty");
//  } else {
//  System.out.print("Queue is not empty");
//  }
//  }
// }
