package grokking_algorithms.binary_search;

public class LinkedListImpl {
    public static void main(String[] args) {
        CustomLinkedList node = new CustomLinkedList(5);
        node.insert(1);
        node.insert(2);
        node.insert(3);
        node.insert(4);
        node.insert(5);
        node.display();
    }
}
