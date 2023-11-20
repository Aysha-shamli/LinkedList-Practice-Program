package linkedListPrograms;

public class LinkedList {
    public Node addNode(int data,Node head){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return head;
        }else{
            Node temp = head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next = newNode;
            return head;
        }
    }

    public void printData(Node head){
        if(head==null){
            System.out.println("The list is empty");
        }else{
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data+" ->");
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node head = list.addNode(56, null);
        list.addNode(30, head);
        list.addNode(70, head);
        list.printData(head);
    }

}
