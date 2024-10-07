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

    
    public void sort() {
        if (head == null) {
            System.out.println("LIST_EMPTY");
            return;
        }
        
        boolean swapped;
        Node ptr1;
        Node lptr = null; 

        
        do {
            swapped = false;
            ptr1 = head;

            while (ptr1.next != lptr) {
                if (ptr1.data > ptr1.next.data) {
                    
                    int temp = ptr1.data;
                    ptr1.data = ptr1.next.data;
                    ptr1.next.data = temp;
                    swapped = true;
                }
                ptr1 = ptr1.next;
            }
            lptr = ptr1;
        } while (swapped);
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

public class Main1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(50);
        list.addLast(40);
        list.addLast(30);
        list.addLast(20);
        list.addLast(10);
        
        System.out.println("Original List:");
        list.printList();
        
        list.sort();
        
        System.out.println("Sorted List:");
        list.printList();
    }
}
