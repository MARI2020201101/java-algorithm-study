package ch11;

public class ChainHash<K,V> {
    private int size;
    private Node<K,V>[] table;

    public int remove(K key){
        int hash = hashValue(key);
        Node<K,V> ptr = table[hash];
        Node<K,V> prev = null;

        while(ptr!=null){
            if(ptr.key.equals(key)){
                if(prev!=null) {
                    prev.next=ptr.next;
                }else{
                    table[hash]=ptr.next;
                }
                return 0;
            }
            prev=ptr;
            ptr=ptr.next;
        }
        return 1;
    }



    public int add(K key, V value){
        int hash = hashValue(key);
        Node<K, V> node = table[hash];
        while(node!=null){
            if(node.key.equals(key)){
                return 1;
            }
            node = node.next;
        }
        Node<K,V> newNode = new Node(key,value,table[hash]);
        table[hash] = newNode;
        return 0;
    }

    public V search(K key){
        int hash = hashValue(key);
        Node<K, V> node = table[hash];

        while(node!=null){
            if(node.key.equals(key)){
                return node.value;
            }
            node = node.next;
        }
        return null;
    }
    public ChainHash(int capacity){
        try{
            this.table = new Node[size];
            this.size = capacity;
        }catch (OutOfMemoryError e){
            this.size = 0;
            System.out.println("메모리가 부족합니다..");
        }
    }

    public int hashValue(Object key){
        return key.hashCode()%size;
    }



    public class Node<K,V>{
        private K key;
        private V value;
        private Node<K,V> next;

        public Node(K key,V value, Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
        public K getKey(){
            return key;
        }
        public V getValue(){
            return value;
        }
        public int hashcode(){
            return key.hashCode();
        }
    }
}
