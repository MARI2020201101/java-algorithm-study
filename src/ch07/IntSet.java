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

    public void copyTo(IntSet s){
        int n = s.max < num ? max:num; //복사할 요소 개수가 max를 넘어서면 안된다!
        for (int i = 0; i < n; i++) {
            s.set[i] = set[i];
        }
        s.num = n;
    }
    public void copyFrom(IntSet s){
        int n = max < s.num? max:s.num;
        for (int i = 0; i < n; i++) {
            set[i] = s.set[i];
        }
        num = n;
    }

    public void unionOf(IntSet s1, IntSet s2){
        copyFrom(s1);
        for (int i = 0; i < s2.num; i++) {
            add(s2.set[i]);
        }
    }


    public boolean equalTo(IntSet s){
        if(s.num!=num){
            return false;
        }
        for (int i = 0; i < num; i++) {
            int j;
            for (j = 0; j < num; j++) {
                if(set[i]==s.set[j]){
                    break;
                }
            }
            if(j==num) return false;
        }
        return true;
    }

    public String toString(){
        return Arrays.toString(set);
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
        IntSet intSet2 = new IntSet(10);
        intSet2.copyFrom(intSet);
        intSet2.print();
        intSet.equalTo(intSet2);
        intSet2.add(8);
        intSet2.add(9);
        intSet.equalTo(intSet2);
        intSet2.remove(8);
        intSet2.remove(9);
        intSet2.print();
        intSet.unionOf(intSet,intSet2); //set이라서 add할때 중복은 제거됨
        intSet.print();
        System.out.println(intSet.toString());

    }
}
