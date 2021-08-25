package com.company;

public class MyHashTable {
    private MyLinkListNode arr[];
    private int size;



    MyHashTable(int size) {
        this.arr = new MyLinkListNode[size];
        for (int i = 0; i < size; i++) {
            this.arr[i] = new MyLinkListNode();
        }
        this.size = size;
    }


    void put(String k, Integer v) {
        int idx = hash(k);
        MyLinkListNode node = new MyLinkListNode();
        node.data = v;
        node.key = k;
        node.next = this.arr[idx].next;
        this.arr[idx].next = node;
    }
    
    Integer get(String k) {
        int idx = hash(k);


                MyLinkListNode hd = this.arr[idx];
                while(hd.next != null){
                    hd = hd.next;
                    if(hd.key.equals(k)){
                        return hd.data;
                    }
                }
        return null;

    }

//    O(1)
    private int hash(String a) {
        return (int)(a.charAt(0) + a.charAt(a.length() - 1)) % this.size;
    }

    //    O(1)
//    private int hash(int a) {
//        return a;
//    }

    public static void main(String[] args) {
        MyHashTable hash = new MyHashTable(5);
        hash.put("1351122", 1);
        hash.put("135322", 2);

        System.out.println(hash.get("1351122"));
        hash.put("135", 3);
        System.out.println(hash.get("1351122"));
    }
}
