package dataStructureImpl;

public class LinkedListImpl {

    public static void main(String[] args) {

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add(10);
        singleLinkedList.add(20);
        singleLinkedList.add(30);
        singleLinkedList.add(40);

        System.out.println(singleLinkedList);
        System.out.println(singleLinkedList.searchElementAtIndex(50));

        singleLinkedList.reverse();
        System.out.println(singleLinkedList);

    }
}

class SingleLinkedList {

    private Node head;

    public SingleLinkedList() {
        this.head = null;
    }
    //  501                            101         201         301

    // 1/101(next pointer) -->     2/201  -->   3/301  -->  4/null
    // head, prev

    // 1/null               <---    2/501   <---       3/101   <---     4/201 (head)

    public void reverse() {
        Node current = this.head;
        while (current != null) {
            current = current.getNext();
        }
    }

    public int searchElementAtIndex(int element) {
        Node current = this.head;
        int i = 0;
        if (this.head.getElement() == element) return 0;
        while (current.getNext() != null) {
            i++;
            if (current.getNext().getElement() == element) return i;
            current = current.getNext();
        }
        return -1;
    }

    public void add(int element) {
        Node node = new Node(element);
        node.setNext(null);
        if (this.head == null) {
            this.head = node;
        } else {
            Node current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
    }

    /*@Override
    public String toString() {
        Node current = this.head;
        System.out.println(current.getElement());
        while (current.getNext() != null) {
            System.out.println(current.getNext().getElement());
            current = current.getNext();
        }
        return "";
    }*/
}

class Node {

    private int element;
    private Node next;

    public Node(int element) {
        this.element = element;
        this.next = null;
    }

    public int getElement() {
        return this.element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
