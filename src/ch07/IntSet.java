package ch07;

import java.util.Arrays;

public class IntSet {

    private int max;
    private int num;
    private int[] set;

    public IntSet(int capacity){
        max=capacity;
        num=0;
        try{
            set = new int[max];
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public int capacity(){
        return max;
    }
    public int size(){
        return num;
    }
    public int indexOf(int n){
        if(num<=0 || set==null){
            return -1;
        }
        for (int i = 0; i < num; i++) {
            if(set[i]==n){
                return i;
            }
        }
        return -1;
    }

    public boolean contains(int n){
        if(num<=0 || set==null){
            return false;
        }
        return indexOf(n)!=-1?true:false;
    }

    public boolean add(int n){
        if(num>max || contains(n)){
            return false;
        }
        set[num++]=n;
        return true;
    }

    public boolean remove(int n){
        if(indexOf(n)==-1){
            return false;
        }
        // Set 이라서 순서 유지 안해도됨!!
//        for (int i = indexOf(n); i < num-1; i++) {
//            set[i] = set[i+1];
//        }
//        num--;
        set[indexOf(n)]=set[--num];
        return true;
    }

    public void print(){
        System.out.println(Arrays.toString(set));

    }

    public static void main(String[] args) {
        IntSet intSet = new IntSet(10);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.print();
        System.out.println(intSet.indexOf(3));
        System.out.println(intSet.capacity());
        System.out.println(intSet.size());
        intSet.remove(2);
        intSet.print();
        System.out.println(intSet.size());
        intSet.add(6);
        intSet.add(7);
        intSet.print();
        System.out.println(intSet.contains(1));
        System.out.println(intSet.contains(2));
    }
}
