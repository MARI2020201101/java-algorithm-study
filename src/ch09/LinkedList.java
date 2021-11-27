package ch09;

import java.util.Comparator;

public class LinkedList<E> {

    class Node<E>{
        private E data;
        private Node<E> next;

        Node(E data, Node<E> next){
            this.data = data;
            this.next = next;
        }
    }

    private Node<E> head;
    private Node<E> curr;

    public LinkedList(){
        this.head = null;
        this.curr = null;
    }


    public boolean next(){
        if(curr==null || curr.next == null) return false;
        curr=curr.next;
        return true;
    }

    public void clear(){
        while(head!=null){
            removeFirst();
        }
        curr= null;
    }

    public void remove(Node p){
        if(head==null) return;
        else{
            Node<E> ptr = head;
            while(ptr.next!=p && ptr!=null){
                ptr = ptr.next;
            }
            if(ptr==null) return;
            ptr.next = p.next;
            curr = ptr;
        }

    }
    public void removeFirst(){
        if(head==null) return;
        else{
            curr = head = head.next;
        }
    }

    public void removeLast(){
        if(head==null) return;
        else if(head.next==null) removeFirst();
        else{
            Node<E> ptr = head;
            Node<E> prev = head;
            while(ptr.next!=null){
                prev = ptr;
                ptr = ptr.next;
            }
            prev.next = null;
            curr = prev;

        }
    }

    public void addFirst(E obj){
        Node<E> ptr = head = new Node<E>(obj,head);
    }

    public void addLast(E obj){
        if(head == null) addFirst(obj);
        else{
            Node<E> ptr = head;
            while(ptr.next!=null){
                ptr = ptr.next;
            }
            ptr.next = curr = new Node<E>(obj,null);
        }
    }
    public E search(Object obj, Comparator c){
        Node<E> ptr = head;
        while(ptr!=null){
            if(c.compare(ptr, obj)==0){
                curr = ptr;
                return ptr.data;
            }
            ptr = ptr.next;
        }
        return null;
    }
}
