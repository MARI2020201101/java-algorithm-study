package ch09;

public class DoubleLinkedList<E> {

    private Node<E> head;
    private Node<E> curr;

    public DoubleLinkedList(){
        head = curr = new Node<>();
    }

    public boolean isEmpty(){
        return head.next == head;
    }


    public class Node<E>{
        private E data;
        private Node<E> prev;
        private Node<E> next;

        public Node(){
            data = null;
            next = prev = this;
        }
        public Node(E data, Node prev, Node next){
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
}
