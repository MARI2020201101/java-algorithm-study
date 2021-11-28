package ch10;

import java.util.Comparator;

public class BinTree<K,V> {

    public boolean remove(K key){
        Node<K,V> ptr = root;
        Node<K,V> prev = null;
        boolean isLeft = true;

        if(root==null) return false;

        while(true){
            if(ptr==null) return false;

            int ret = compare(key, ptr.key);
            if(ret==0){
                break;
            }
            if(ret<0){
                isLeft = true;
                prev = ptr;
                ptr = ptr.left;
            }else{
                isLeft = false;
                prev = ptr;
                ptr = ptr.right;
            }
        }
        if(ptr.left==null){
            if(ptr==root){
                ptr=ptr.right;
            }
            else if(isLeft){
                prev.left = ptr.right;
            }else{
                prev.right = ptr.right;
            }

        }else if(ptr.right==null){
            if(ptr==root){
                ptr=ptr.left;
            }else if(isLeft){
                prev.left = ptr.left;
            }else{
                prev.left = ptr.left;
            }
        }else{
            prev = ptr;
            Node<K,V> left = ptr.left;
            isLeft = true;

            while(left.right!=null){
                prev = left;
                left = left.right;
                isLeft = false;
            }
            prev.key = left.key;
            prev.value = left.value;

            if(isLeft){
                prev.left = left.left;
            }else{
                prev.right = left.left;
            }
        }
            return true;
    }



    public void add(K key, V value){
        if(root==null){
            root = new Node<>(key,value,null,null);
        }else{
            addNode(root, key, value);
        }
    }

    private void addNode(Node<K, V> root, K key, V value) {
        int ret = compare(key, root.key);
        if(ret==0)return;
        if(ret<0){
            if(root.left==null){
                root.left = new Node<>(key,value,null,null);
            }else{
                addNode(root.left,key,value);
            }
        }else{
            if(root.right==null){
                root.right = new Node<>(key,value,null,null);
            }else{
                addNode(root.right,key,value);
            }
        }
    }

    public V search(K key){
        Node<K,V> ptr = root;
        while(ptr!=null ){
            int ret = compare(key , ptr.key);
            if(ret==0){
                return ptr.value;
            }else{
                ptr=ret < 0?ptr.left:ptr.right;
            }
        }
        return null;
    }

    private int compare(K key1, K key2){
        return comparator.compare(key1,key2);
    }

    public BinTree(){
        root = null;
    }
    public BinTree(Comparator c){
        this();
        this.comparator = c;
    }

    private Node<K,V> root;
    private Comparator comparator = null;

    static class Node<K,V>{
        private K key;
        private V value;
        private Node<K,V> left;
        private Node<K,V> right;

        Node(K key, V value,Node<K,V> left, Node<K,V> right){
            this.key=key;
            this.value = value;
            this.left =left;
            this.right = right;
        }

        public K getKey(){
            return key;
        }
        public V getValue(){
            return value;
        }
    }
}
