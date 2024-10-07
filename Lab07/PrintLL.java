import java.util.Scanner;

class PrintLL{
     int count=0; long startTime1,startTime;
    class Node{
                int data;
                Node next;
                Node (int data)
                {
                    this.data=data;
                    this.next=null;
        
                }
            }

    void printRecursive(Node n){
        startTime1 = System.nanoTime();	//record the starting time 
        if (n!=null) {
            System.out.print(n.data+ " ");
            printRecursive(n = n.next);
        }

    }
           
    //   add first
    Node head;
    public void addFirst(int data)
    { count++;
        Node newNode =new Node(data);
         if (head==null) {
            head=newNode;
    
        }
          else { 
            Node temp;
            temp=head;
            head=newNode;
            newNode.next=temp;
        }
    }
         
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintLL ll = new PrintLL();
        System.out.println("Using Altrative: ");
        
        for (int i = 0; i <10 ; i++) {
             ll.startTime = System.nanoTime();	//record the starting time 
            ll.addFirst(i+2+i);
        }
        Node temp1= ll.head;
       while (temp1!=null) {
        System.out.print(temp1.data+" ");
        temp1=temp1.next;
        

      }
      long endTime   = System.nanoTime();	//record the ending time 
      long totalTime = endTime -ll.startTime;//compute the elapsed time

      System.out.println();
      System.out.println("Using Recursive: ");
      Node tp = ll.head;

      ll.printRecursive(tp);
      long endTime1  = System.nanoTime();	//record the ending time 
      long totalTime1 = endTime1 - ll.startTime1;//compute the elapsed time
      System.out.println();
      System.out.println("Time complexity...");
     if (totalTime<totalTime1) {
        System.out.println("iterative time complexity is less than from recursive .");
        
     }else{
        System.out.println("recursive time complexity is less than from iterative .");
     }
 
System.out.println("ieterative: "+totalTime+" "+"recursive"+totalTime1);


    }


//chat code




}