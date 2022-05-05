package com.java.main;
//Write a program to traverse (or iterate) ArrayList?
/*
import java.util.ArrayList;
public class Collection {
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(23);
        list.add(45);
        list.add(56);
        list.add(89);
        for (Integer num : list){
        System.out.println(num);

    }
}}*/
//Write a program to convert List to Array.
/*import java.util.*;
public class Collection{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Orange");
        list.add("Graphs");
        list.add("WaterMelon");
        String arr1[] = new String[list.size()];
        for (int j=0;j<list.size();j++){
            arr1[j]=list.get(j);
        }
        for(String k:arr1){
            System.out.println(k);
        }

    }
}*/
//Write a program to traverse or iterate HashSet
/*import java.util.HashSet;
public class Collection{
    public static void main (String[] args){
        HashSet<String> hs = new HashSet<String>();
        hs.add("trupti");
        hs.add("bhagu");
        hs.add("sunnu");
        hs.add("rachana");

        for (String hs1: hs){
            System.out.println(hs1);
        }
    }

}*/
//given an element write a programe to check if element (value) exists in ArrayList?
import java.util.ArrayList;
public class Collection{
    public static void main (String[] args){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(53);
        al.add(89);
        al.add(76);
        al.add(32);
        if(al.contains(99)){
            System.out.println("99 was found in the list");
        }else{
            System.out.println("99 was not found in the list");
        }
    }
}

