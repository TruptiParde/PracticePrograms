package com.java.main;

import java.util.HashMap;
import java.util.TreeMap;

//create hashmap
/*public class Map {
    public static void main (String[] args){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("English" , 67);
        map.put("Marathi" ,80);
        map.put("Hindi",77);
        map.put("Science",55);
        System.out.println(map);

    }
}*/
//add elements in hashmap
/*public class Map{
    public static void main (String[] args){
        HashMap<String,Integer> h1 = new HashMap<>();
        System.out.println("without add elements" +h1);
        h1.put("trupti" ,89);
        h1.put("shruti" ,94);
        h1.put("swati" ,87);
        System.out.println("After adding elements" +h1);
    }cess e
}*/
//Acesses elements, keys, values, from hashmap using keySet(),entrySet(),value
/*public class Map{
    public static void main (String[] args){
        HashMap<Integer,String> m1 = new HashMap<>();
        m1.put(90, "Apple");
        m1.put(50, "Orange" );
        m1.put(30, "WaterMelon");
        m1.put(60, "Graphs" );
        System.out.println("without access the list is " +m1);
        String value = m1.get(90);
        System.out.println("after accessing element: " + value);
        System.out.println(m1.keySet());
        System.out.println(m1.entrySet());
    }
}*/
//change HashMap value using replace() method and remove keyvalue to use remove()
/*public class Map{
    public static void main (String[] args){
        HashMap<Integer,String> m2 = new HashMap<>();
        m2.put(1,"one");
        m2.put(2,"twenty");
        m2.put(3,"three");
        System.out.println("original list " + m2);
        m2.replace(2, "two");
        System.out.println("After replacing " +m2);
        m2.remove(3,"three");
        System.out.println("after remove " + m2);
    }
}*/
//Iterate through HashMap
/*import java.util.Iterator;
import java.util.Map;

public class Hashmap{
    public static void main (String[] args){
        HashMap<Integer,String> Hash1 = new HashMap<Integer,String>();
        Hash1.put(1,"Asha");
        Hash1.put(2,"Bunny");
        Hash1.put(3,"pintu");
        Hash1.put(4,"alia");

        Iterator itr = Hash1.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<Integer, String> map = (Map.Entry) itr.next();
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }


}*/
//creating HashMap from other Maps
/*public class Hashmap{
    public static void main (String[] args){
        TreeMap<Integer,String> hash = new TreeMap<>();
        hash.put(11,"Cricket");
        hash.put(02, "Chess");
        hash.put(20, "kabbadi");
        hash.put(04, "ludo");
        System.out.println("Treemap:- " + hash);
        HashMap<Integer,String> hash1 = new HashMap<>();
        hash1.put(02,"cockbat");
        hash1.put(15, "hockey");
        System.out.println("HashMap:- " + hash1);

    }

}*/
