package com.java.main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

    public class Main {

        public static void main(String[] args) {

            List<Employe> employeList = new ArrayList<>();
            employeList.add(new Employe(101, 25000, "abc"));
            employeList.add(new Employe(102,10000,"efg"));
            employeList.add(new Employe(103,50000,"jkl"));
            employeList.add(new Employe(104,12000,"mnp"));
            employeList.add(new Employe(105,40000,"xyz"));
            employeList.add(new Employe(106,100000,"stu"));
            employeList.add(new Employe(107,29000,"def"));
            employeList.add(new Employe(108,60000,"lmn"));
            employeList.add(new Employe(109,20000,"yut"));
            employeList.add(new Employe(110,66000,"qew"));

            Collections.sort(employeList,new Comparator<Employe>(){
                public int compare (Employe e0, Employe e1){
                    return e0.getSalary()-e1.getSalary();
                }

            });
            System.out.println(employeList);







        }
}
