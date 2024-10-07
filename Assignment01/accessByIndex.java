class accessByIndex{
     class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;

        }
     }

     Node head;
     Node tail;
     public void addToBack(int data){
        Node newNode=new Node(data);
        if (head==null) {
            head=newNode;
            
        }else{
            Node temp=head;
            while (temp.next!=null) {
                temp=temp.next;
                
            }
            temp.next=newNode;
            newNode.prev=temp;
            tail=newNode;
        }


     }

     public boolean isEmpty(){
        if (head==null) {
            return true;
        }
        return false;
     }
      public int nthFromLast(int data){
        int num=0;  
        if (isEmpty()) {
            System.out.println("The list is empty.");
            
           }else{
             for (int i = 1; i <(data); i++){
                tail=tail.prev;
             }
             num=tail.data;
           }
           return num;
      }


      void display(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
      }
    public static void main(String[] args) {
        accessByIndex ai=new    accessByIndex();
        ai.addToBack(10);
        ai.addToBack(20);
        ai.addToBack(30);
        ai.addToBack(40);
        ai.addToBack(50);
      System.out.println( ai.nthFromLast(4));
      // ai.display();
      System.out.println(ai.tail.data);

    }
}