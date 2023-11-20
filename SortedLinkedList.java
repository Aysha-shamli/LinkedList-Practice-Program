package linkedListPrograms;
public class SortedLinkedList {
    Node head;
    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null || data < head.data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && data > current.next.data) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
    }
    public void printData() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ->");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SortedLinkedList sortedList = new SortedLinkedList();

        sortedList.addNode(56);
        sortedList.addNode(30);
        sortedList.addNode(40);
        sortedList.addNode(70);

        sortedList.printData();
    }
}
