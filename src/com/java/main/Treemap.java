package com.java.main;
//to create a simple TreeMap and add new key-value pairs to it. The entries in the TreeMap will be sorted based on the natural ordering of keys -
/*import java.util.SortedMap;
import java.util.TreeMap;
    public class Treemap{
        public static void main (String[] args){
            SortedMap<String,String> file = new TreeMap<>();
            file.put("Tiger","Animal");
            file.put("Parrot","Bird");
            file.put("orange","Fruit");
            System.out.println(file);
        }
    }*/

import java.util.*;

//how to create a TreeMap with a custom comparator that orders the TreeMap entries in the descending order of keys -
/*public class Treemap{
    public static void main (String[] args){
        SortedMap<String,String> sort = new TreeMap<>(new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return s2.compareTo(s1);
            }
        });
        sort.put("dhoni","Cricketer");
        sort.put("shahid","Actor");
        sort.put("udhav","CM");
        sort.put("modi","PM");
        System.out.println(sort);

    }
}*/
//how to create a Case Insensitive Map by passing a custom CASE_INSENSITIVE_ORDER comparator to the TreeMap
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;
/*public class Treemap{
    public static void main (String[] args){
        SortedMap<String,String> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        map.put("Trupti","Java developer");
        map.put("Ashish", "Fullstack developer");
        map.put("Sunidhi", "Backend developer");
        map.put("Rachna","Frontend developer");
        System.out.println(map);

    }
}*/
//demonstrates how to -
// Find the size of a TreeMap,
// Check if a given key exists in a TreeMap,
// Retrieve the first entry in the TreeMap,
// Retrieve the last entry in the TreeMap,
// Retrieve the entry whose key is just lower than the given key,
// Retrieve the entry whose key is just higher than the given key.
/*import java.util.Map;
public class Treemap{
    public static void main (String[] args){
        TreeMap<Integer,String> students = new TreeMap<>();
        students.put(101,"manisha");
        students.put(102,"pooja");
        students.put(103,"parth");
        students.put(104,"yash");
        System.out.println("students map : " +students);
        System.out.println("Total no. of students: " +students.size() );
        Integer rollno = 103;
        if (students.containsKey(rollno)){
            String name = students.get(rollno);
            System.out.println("student with roll no. " + rollno +":" +name);
        }else{
            System.out.println("student does not exist with roll no. " + rollno);
        }
        System.out.println("first entry of students : " + students.firstEntry());
        System.out.println("last entry of students : " + students.lastEntry());

        Map.Entry<Integer,String> studentbelow = students.lowerEntry(101);
        Map.Entry<Integer,String> studentabove = students.higherEntry(101);
        System.out.println("student just below roll no. " +studentbelow);
        System.out.println("student just above roll no. " +studentabove);

    }*/
//Remove a key from a TreeMap.
//Remove a key from a TreeMap only if it is associated with a given value.
//Remove the first entry of the TreeMap.
//Remove the last entry of the TreeMap.
/*public class Treemap{
    public static void main (String[] args){
        TreeMap<String,String> treeMap = new TreeMap<>();
        treeMap.put("India" ,"In");
        treeMap.put("Australia","Aus");
        treeMap.put("Pakistan","Pak");
        treeMap.put("China" ,"CN");
        System.out.println("TreeMap: " +treeMap);
        String countryName = "China";
        String shortname = treeMap.remove(countryName);
        System.out.println("after remove china  : " +treeMap);

        Map.Entry<String, String> firstEntry = treeMap.pollFirstEntry();
        System.out.println("Removed firstEntry : " + firstEntry + ", New TreeMap : " + treeMap);


        Map.Entry<String, String> lastEntry = treeMap.pollLastEntry();
        System.out.println("Removed lastEntry : " + lastEntry + ", New TreeMap : " + treeMap);
    }

    }*/

