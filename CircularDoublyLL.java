public class CircularDoublyLL {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static void printCircularList(Node startNode) {
        Node currentNode = startNode;
        do {
            System.out.print(currentNode.data + " <-> ");
            currentNode = currentNode.next;
        } while (currentNode != startNode);
        System.out.println("...");
    }

    public static void main(String[] args) {
        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(13);
        Node node4 = new Node(2);

        // Linking nodes forward
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node1;  // Circular link

        // Linking nodes backward
        node4.prev = node3;
        node3.prev = node2;
        node2.prev = node1;
        node1.prev = node4; // Circular link

        System.out.println("Circular Doubly Linked List:");
        printCircularList(node1);
    }
}
