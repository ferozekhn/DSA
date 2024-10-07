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

    
    public void reverse() {
        if (head == null) {
            System.out.println("LIST_EMPTY");
            return;
        }
        
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev; 
            prev = current;   
            current = next;
        }
        head = prev;
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

    
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(50);
        list.addLast(40);
        list.addLast(30);
        list.addLast(20);
        list.addLast(10);
        
        System.out.println("Original List:");
        list.printList();
        
        list.reverse();
        
        System.out.println("Reversed List:");
        list.printList();
    }
}
