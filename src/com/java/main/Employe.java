package com.java.main;

public class Employe {
    private int id;
    private int salary;
    private String name;

    public Employe(int id,int salary,String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }
    public int getId(){
        return id;
    }

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}

