public class ReverseLL{
    public class Node {
     
        int data;
         Node next;
         Node(int data ){
            this.data=data;
            this.next=null;
    
        }
    }
 
  static  Node head;
  //static Node temp ;
 // static Node temp1 ;
  static Node head1;

  public void addToBack(int data){
          Node newNode=new Node(data);
          if (head==null) {
            head=newNode;

          }
          else{
         Node temp=head;
            while (temp.next!=null) {
                temp=temp.next;
            }
            temp.next=newNode;
          }
    }
 

    public void push(int data) // insert at the beginning
    {  
       Node newNode1 = new Node(data);
    if(head1==null){
       head1= newNode1;
    }
       else{
          newNode1.next=head1;
          head1=newNode1;

   
       }    }
    

  public  int  pop()
{
      int a=0;
    if (isEmpty()) {
        System.out.println(" our list is empty.");
        
    }else{
        a = head1.data;
        head1 = head1.next;
        
    }
    return a;
  
 }

 public boolean isEmpty()
 {
    boolean a=false;
    if (head1== null) {
        a= true;
        
    }
    return a;
 }

    public static void main(String[] args) {
        ReverseLL rl=new ReverseLL();
        rl.addToBack(5);
        rl.addToBack(4);
        rl.addToBack(3);
        rl.addToBack(2);
        rl.addToBack(1);

       

        Node temp = head;
        
        while (temp!=null) {
           rl.push(temp.data);
            temp=temp.next;
        }

        
        while (head1 != null) {
           System.out.println( rl.pop());
        }
       


    }
}
