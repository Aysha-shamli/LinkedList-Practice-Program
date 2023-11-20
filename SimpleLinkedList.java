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


    public void printData(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();
        list.addNode(70);
        list.addNode(30);
        list.addNode(56);
        list.printData();

    }

}
