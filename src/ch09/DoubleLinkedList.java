package ch09;

import java.util.Comparator;

public class DoubleLinkedList<E> {

    private Node<E> head;
    private Node<E> curr;

    public DoubleLinkedList(){
        head = curr = new Node<>();
    }

    public void removeCurrentNode(){
        if(isEmpty() || head.next == head) return;
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
        curr = curr.prev;
        if(curr==head) curr =curr.next;

    }
    public void addLast(E obj){
        curr = head.prev;
        add(obj);
    }
    public void addFirst(E obj){
        curr = head;
        add(obj);
    }
    public void add(E obj){
        Node<E> node = new Node<>(obj,curr,curr.next);
        curr.next = node;
        curr.next.prev = node;
        curr = node;
    }

    public E search(E obj, Comparator c){
        Node<E> ptr = head.next;
        while(ptr!=head){
            if(c.compare(ptr.data, obj)==0){
                curr = ptr;
                return ptr.data;
            }
            ptr = ptr.next;
        }
        return null;
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
