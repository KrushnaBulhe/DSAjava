public class DoubleLL {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public int size;

    // Add a node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Print the Doubly Linked List
    public void print() {
        Node temp = head;
        System.out.print("null <-> ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    //add the node at the end
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.prev = tail ;
        tail.next = newNode ;
        tail = newNode ;

    }


    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.addLast(4);
        dll.addLast(5);

        dll.print(); // Expected: null <-> 1 <-> 2 <-> 3 <-> null
        System.out.println("Size: " + dll.getSize()); // Size: 3
    }
}
