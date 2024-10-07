class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    
    public int nthFromLast(int n) {
        if (head == null) {
            return -1;
        }
        
        
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        
        
        int targetPos = length - n;
        if (targetPos < 0) {
            return -1;
        }
        
        
        temp = head;
        for (int i = 0; i < targetPos; i++) {
            temp = temp.next;
        }
        
        return temp.data; 
    }
    
    
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.display();
        
        int n = 2;
        int result = list.nthFromLast(n);
        
        if (result != -1) {
            System.out.println("The " + n + "th node from the end is: " + result);
        } else {
            System.out.println("LIST_EMPTY or n is greater than the length of the list.");
        }
    }
}
