




public class LinkedList {
    class Node {
        int data;
        Node next;
    
        // Constructor to initialize the node with data
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        LinkedList l=new LinkedList();
        l.addFirst(55);
        l.addFirst(67);
        l.add(23);
        System.out.println(l);

        
    }
    
    Node head; // Starting node of the linked list

    // Method to add a node at the end of the list
    public void add(int data) {
         Node newNode = new Node(data);

        // If the list is empty, set the new node as the head
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            // Traverse to the end of the list
            while (current.next != null) {
                current = current.next;
            }
            // Link the new node at the end
            current.next = newNode;
        }
    }

    // Method to delete a node by value
    public void delete(int data) {
        // If the list is empty
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If the node to be deleted is the head
        if (head.data == data) {
            head = head.next;
            return;
        }

        // Traverse the list to find the node to delete
        Node current = head;
        Node prev = null;
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }

        // If the node was not found
        if (current == null) {
            System.out.println("Node with data " + data + " not found.");
            return;
        }

        // Unlink the node from the list
        prev.next = current.next;
    }

    // Method to display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==nu ll){
            head.data=data;
            head.next=null;
            return;
        }
        if(head!=null){
            newNode.next=head;
            head=newNode;
            return;

        }
    }
}


