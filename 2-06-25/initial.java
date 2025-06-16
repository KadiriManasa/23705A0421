public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Inserting nodes at the beginning
        list.insertBeginning(30);
        list.insertBeginning(20);
        list.insertBeginning(10);

        // Printing the list
        list.printList();
    }
}

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class with insertBeginning method
class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    // Insert at beginning
    public void insertBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
