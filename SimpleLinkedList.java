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

        list.insertAfter(list.head, 40);
        list.printData();

        list.pop();
        list.printData();

    }
}
