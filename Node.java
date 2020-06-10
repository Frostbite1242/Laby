package lab_7;

public class Node {
    private Coffee coffee;
    private Node next;
    private Node previous;

    public Node(Coffee coffee, Node next, Node previous) {
        this.coffee = coffee;
        this.next = next;
        this.previous = previous;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Coffee getcoffee() {
        return coffee;
    }

    public Node getNext() {
        return next;
    }


    public Node getPrevious() {
        return previous;
    }
}