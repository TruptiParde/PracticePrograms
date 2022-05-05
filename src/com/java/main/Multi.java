package com.java.main;
//creation of thread by implements Rnnable interface
/*abstract class Multi implements Runnable{
    public static void main(String[] args){
        Thread multi = new Thread("Multiprocessing");
        Thread multi1 = new Thread("Multitasking");
        multi.start();
        multi1.start();
        System.out.println("Thread names are following: ");
        System.out.println(multi.getName());
        System.out.println(multi1.getName());
    }
    @Override
    public void run(){

    }
}*/
//to create a thread and explore built in methods available for threads.
/*public class Multi implements Runnable{
    @Override
    public void run(){
    }
    public static void main(String[] args) {
        Thread task = new Thread();
        task.start();
        try{
            task.sleep(900);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        task.setPriority(1);
        int taskpriority = task.getPriority();
        System.out.println(taskpriority);
        System.out.println("Thread Running");


    }
}*/
// two threads and fetch the names of the thread.
/*public class Multi implements Runnable{
    public static void main (String[] args){
        Thread taskthread = new Thread("task");
        Thread processthread = new Thread("process");
        taskthread.start();
        processthread.start();
        System.out.println("Thread names are: " );
        System.out.println(taskthread.getName());
        System.out.println(processthread.getName());}
        @Override
        public void run () {

        }
    }*/
//create thread by extend a class
/*class Multi extends Thread{
    public void run() {
        System.out.println("My thread is in running state");
    }
    public static void main(String[] args){
        Multi obj = new Multi();
        obj.start();
    }
}*/
// demonstrates the use of the Runnable interface to create a thread instance.
/*public class Multi{
    public static void main(String[] args){
        Runnable hello = new sub("Hello Pune");
        Thread thread1 = new Thread(hello);
        thread1.setDaemon(true);
        thread1.setName("hii");
        System.out.println("Start First thread...");

        thread1.start();

        Runnable bye = new sub ("Bye....");
        Thread thread2 = new Thread(bye);    thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.setDaemon(true);
        System.out.println("Start goodbye thread...");

        thread2.start();
        System.out.println("main() is ending...");
    }
}*/
//program demonstrates the usage of interrupt () method to stop the thread.
/*public class Multi{
    public static void main(String[] args){
        sub stop = new sub();
        stop.start();
        try{
            Thread.sleep(100);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        stop.interrupt();

    }
}*/
//programe to print maximum priority of thread
/*public class Multi extends Thread{
    public void run(){
        System.out.println("maximum priority of thread is : " +Thread.currentThread().getPriority());
        ;
    }
    public static void main(String[] args){
        Multi m1 = new Multi();
        m1.setPriority(Thread.MAX_PRIORITY);
        m1.start();

    }
}*/
//To print minimum priority of thread
/*public class Multi extends Thread{
    public void run(){
        System.out.println("maximum priority of thread is : " +Thread.currentThread().getPriority());
        ;
    }
    public static void main(String[] args) {
        Multi m2 = new Multi();
        m2.setPriority(Thread.MIN_PRIORITY);
        m2.start();
    }}*/
//To print normal priority of thread
/*public class Multi extends Thread{
    public void run(){
        System.out.println("maximum priority of thread is : " +Thread.currentThread().getPriority());
        ;
    }
    public static void main(String[] args){
        Multi m3 = new Multi();
        m3.setPriority(Thread.NORM_PRIORITY);
        m3.start();
    }}*/
//programe to print user define priority of thread
/*public class Multi extends Thread{
    public void run(){
        System.out.println("running...");
    }
    public static void main(String args[]){
        Multi t1 = new Multi();
        Multi t2 = new Multi();
        t1.setPriority(6);
        t2.setPriority(9);
        System.out.println("priority of thread t1 is:" + t1.getPriority());
        System.out.println("priority of thread t2 is:" + t2.getPriority());
        t1.start();

    }
}*/
//simple example of daemon thread
/*public class Multi extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("daemon thread work");
        }
        else{
            System.out.println("user thread work");
        }
    }
    public static void main(String[] args){
        Multi t1=new Multi();
        Multi t2=new Multi();
         Multi t3=new Multi();

        t1.setDaemon(true);//now t1 is daemon thread

        t1.start();//starting threads
        t2.start();
        t3.start();
    }
}*/
//program to execute and allocate processor to other threads.
/*class Multi extends Thread{
    public void run(){
        for (int i = 0; i<5;++i){
            Thread.yield();
            System.out.println("Thread start" + Thread.currentThread().getName());
        }
        System.out.println("Thread ended:" + Thread.currentThread().getName());
    }
}*/
//create daemon thread and use of setdaemon() method
/*public class Multi extends Thread{
    public Multi(String name1){
        super(name1);
    }
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println(getName() + " is Daemon thread ");
        } else {
            System.out.println(getName() + " is user thread ");
        }
    }
    public static void main(String[] args){
        Multi d1 = new Multi("d1");
        Multi d2 = new Multi("d2");
        Multi d3 = new Multi("d3");

        d1.setDaemon(true);
        d1.start();

        d2.start();
        d3.setDaemon(true);
        d3.start();
    }
}*/
//to check the priority of daemon thread
/*public class Multi extends Thread{
    public Multi(String name1){
        super(name1);
    }
    public void run() {
        if(Thread.currentThread().isDaemon()) {
            System.out.println(getName() + " is Daemon thread");
        } else {
            System.out.println(getName() + " is user thread ");
        }
        System.out.println(getName()+ " priority " + Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        Multi m1 = new Multi("m1");
        Multi m2 = new Multi("m2");
        Multi m3 = new Multi("m3");

        m1.setDaemon(true);
        m1.start();
        m2.start();
        m3.setDaemon(true);
        m3.start();
    }
}*/
//program on
