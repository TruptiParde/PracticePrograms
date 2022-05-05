package com.java.main;
//programe to check hashset is empty or not
/*import java.util.HashSet;
public class set{
    public static void main (String[] args){
        HashSet<String> hset = new HashSet<String>();
        hset.add("first");
        hset.add("second");
        hset.add("third");
        System.out.println(hset);
        System.out.println("is hashset is empty? " +hset.isEmpty());

    }
}*/
//programe to remove element from hashset
/*import java.util.HashSet;
public class set{
    public static void main (String[] args){
        HashSet<String> s1 = new HashSet<String>();
        s1.add("math");
        s1.add("science");
        s1.add("electronics");
        s1.add("english");
        System.out.println("before remove :" +s1);
        s1.remove("electronics");
        System.out.println("after remove :" +s1);
    }
}*/

//programe to print the size of hashset
import java.util.HashSet;
public class set{
    public static void main(String[] args){
        HashSet<Integer> h2 = new HashSet<Integer>();
        h2.add(2);
        h2.add(8);
        h2.add(6);
        h2.add(0);
        System.out.println("size of the hashset is: " +h2.size());
    }
}
//programe to demonstrate treeset
/*import java.util.TreeSet;
public class Tree {
    public static void main (String[] args){
        TreeSet<String> Tree = new TreeSet<String>();
        Tree.add("mina");
        Tree.add("sima");
        Tree.add("rima");
        Tree.add("tina");
        System.out.println("tree components:" +Tree);
        }
 }*/
//programe of how to copy tree content to another treeset
/*import java.util.TreeSet;
public class Tree{
    public static void main(String[] args){
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(120);
        tree.add(578);
        tree.add(349);
        tree.add(871);

        System.out.println("Tree Set" + tree);

        TreeSet<Integer> tree1 = new TreeSet<Integer>();
        tree1.add(732);

        tree1.addAll(tree);
        System.out.println("New Treeset" +tree1);



    }
}*/
//displaying hashset elements
/*import java.util.HashSet;
public class set{
    public static void main (String[] args){
        HashSet<String> hset = new HashSet<String>();
        hset.add("Rachana");
        hset.add("Bhagyshree");
        hset.add("Sunidhi");
        hset.add("Trupti");
        hset.add("Priyanka");
        System.out.println("HashSet Contains:" +hset);



    }
}*/
//How to delete all elements from HashSet
/*import java.util.HashSet;
public class set{
    public static void main (String[] args){
        HashSet<String> hash = new HashSet<String>();
        hash.add("lemon");
        hash.add("orange");
        hash.add("apple");
        hash.add("watermelon");
        System.out.println("The hash list is :" +hash);

        hash.clear();
        System.out.println("After clear list" +hash);


    }
}*/
//How to copy all elements from hashset to an array
/*import java.util.HashSet;
public class set{
    public static void main (String[] args){
        HashSet<String> set = new HashSet<String>();
        set.add("lan");
        set.add("man");
        set.add("wan");
        System.out.println("HashSet Content: " +set);
        String[] arr = new String[set.size()];
        set.toArray(arr);
        System.out.println("copied array content");
        for(String str: arr){
        System.out.println(str);
        }


    }
}*/
//how to compare two sets and retain elements which are same on both sets
//import java.util.HashSet;
/*public class set{
    public static void main (String[] args){
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(90);
        set.add(78);
        set.add(56);
        set.add(34);
        set.add(55);
        System.out.println(set);
        HashSet<Integer> subset = new HashSet<Integer>();
        subset.add(34);
        subset.add(78);
        subset.add(56);
        set.retainAll(subset);
        System.out.println(set);

    }*/

