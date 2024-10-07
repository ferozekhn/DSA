import java.util.HashSet;

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

   
    public void removeDuplicates() {
        if (head == null) {
            System.out.println("LIST_EMPTY");
            return;
        }
        
        HashSet<Integer> seen = new HashSet<>();
        Node current = head;
        Node prev = null;

        while (current != null) {
            if (seen.contains(current.data)) {
                prev.next = current.next;
            } else {
                seen.add(current.data);
                prev = current; 
            }
            current = current.next;
        }
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

public class Main3 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(5);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(2);
        list.addLast(1);
        list.addLast(4);
        list.addLast(5);
        list.addLast(3);
        
        System.out.println("Original List:");
        list.printList();
        
        list.removeDuplicates();
        
        System.out.println("List after removing duplicates:");
        list.printList();
    }
}
