package linkedListPrograms;
public class SimpleLinkedList {
    Node head;
    public void addNode(int data){
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }
    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("Previous node can't be null.");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }
    public void pop() {
        if (head != null) {
            head = head.next;
        } else {
            System.out.println("Cannot pop from an empty list.");
        }
    }
    public void popLast() {
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }
    public Node search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                System.out.println("The element exist in Linkedlist");
                return current;
            }
            current = current.next;
        }
        return null;
    }
    public void popElement(int key) {
        if (head == null) {
            System.out.println("Cannot remove from an empty list.");
            return;
        }

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node with key " + key + " not found.");
            return;
        }

        prev.next = current.next;
    }
    public void printData(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ->");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();

        list.addNode(56);
        list.addNode(70);
        list.printData();

        list.insertAfter(list.head, 30);
        list.printData();
        list.search(30);

        Node nodeWith30 = list.head;
        while (nodeWith30 != null && nodeWith30.data != 30) {
            nodeWith30 = nodeWith30.next;
        }

        if (nodeWith30 != null) {
            list.insertAfter(nodeWith30, 40);
        } else {
            System.out.println("Node with value 30 not found in the linked list.");
        }
        list.printData();
        list.popElement(40);
        list.printData();
    }
}



