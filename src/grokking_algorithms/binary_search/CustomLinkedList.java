package grokking_algorithms.binary_search;

public class CustomLinkedList {
    private int data;
    private CustomLinkedList head;


    public CustomLinkedList(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public CustomLinkedList getNextNode() {
        return head;
    }

    public void setNextNode(CustomLinkedList nextNode) {
        this.head = nextNode;
    }

    public void insert(int data){
        CustomLinkedList newNode = new CustomLinkedList(data);
        if(this.head == null){
            head = newNode;
        }else {
            CustomLinkedList currentNode = head;
            while(currentNode.getNextNode() != null){
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
        }
    }


    public void display() {
        if (head != null) {
            CustomLinkedList currentNode = head;
            while(currentNode.getNextNode() != null){
                System.out.println(currentNode.getData());
                currentNode = currentNode.getNextNode();
            }
            System.out.println(currentNode.getData());
        }
    }
}


