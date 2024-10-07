class Node
{
 int data;  
 Node next; 
 public Node(int data)
 {
 this.data = data;
 this.next = null;
 }
}

class Queue
{ 
     Node head;
   //  Node rear = null, front = null;

     public  int Dequeue() // delete at the beginning 
    {   
      int num=0;
        if (isEmpty()){
           return -1;

       }else{
        num=head.data;
        head=head.next;
        
      }
        return num;
    
    }

 // Utility function to add an item in the queue 
     public  void Enqueue(int item) 
    {  
        Node newNode =new Node (item);
         if (isEmpty()){
         head=newNode;
         }else{
          Node temp = head;
          while(temp.next!=null){
          temp=temp.next;
         }
         temp.next=newNode;
        }
     
    }
 // Utility function to check if the queue is empty or not 
 public  boolean isEmpty()
 {    if (head==null) {
      return true;
     }
    return false;
 }
}

// create Stack using two queue
class Task6Lab4 {
     Queue s1, s2;
    // Constructor 
    Task6Lab4() {
    s1 = new Queue();
    s2 = new Queue();
    }
    // Enqueue an item to the queue 
    public void push(int data)
    {     
       s2.Enqueue(data);
       while(!s1.isEmpty()){
        s2.Enqueue(s1.Dequeue());
       }

       while(!s2.isEmpty()){
        s1.Enqueue(s2.Dequeue());
       }
    }
    // Dequeue an item from the queue 
    public int pop()
   {
    return s1.Dequeue();
    }
    public static void main(String[] args) {
    int keys[] = { 1, 2, 3, 4, 5 };
    Task6Lab4 q = new  Task6Lab4();
     for(int key: keys){
        q.push(key);
    }
    
    
   // q.push(3);
    System.out.println(q.pop()); // print 1 
    System.out.println(q.pop()); // print 2 
    }
   }