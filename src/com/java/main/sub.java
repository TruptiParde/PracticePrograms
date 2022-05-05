package com.java.main;
//program on string manupulation of using toLowerCase() and compareTo() together.
/*public class sub {
    public static void main (String[] args){
        String string1 = "Hello";
        String string2 = "hii";
        String string3 = string1.toLowerCase();
        String string4 = string2.toLowerCase();
        int i = string3.compareTo(string4);
        if(i==0){
            System.out.println("Both string are equal");
        }else{
            System.out.println("String are not equal");
        }

    }
}*/
//String concatenation
/*public class sub{
    public static void main (String[] args){
        String str1 = "Hello";
        String str2 = "World";
        String result = str1 + "" + str2;
        System.out.println(result);
        System.out.println("length of string : " +str1.length());
        System.out.println("Actual String" +  str1);
        System.out.println("String reverse : ");
        for(int i = str1.length()-1; i>=0; i--){
            System.out.println(str1.charAt(i));
        }
    }
}*/
//Getting the substring from a given string
/*public class sub{
    public static void main (String[] args){
        String str1 = "ksj recrument , ajay residency wakad pune";
        System.out.println(str1.substring(0,15));
        System.out.println(str1.substring(15));
    }
}*/
//
/*class sub implements Runnable{
    private String message;
    //class constructor
    public sub(String message) {
        this.message = message;
    }
    //run method
    public void run() {
        while(true) {
            System.out.println(message);
        }
    }

}*/
//program demonstrates the usage of interrupt () method to stop the thread.
/*class sub extends Thread{
    @Override
    public void run(){
        while (Thread.interrupted()){
            System.out.println("Thread is running");
        }
        System.out.println("Thread stop");
    }
}*/
//
/*public class sub{
    public static void main(String[] args){
        Multi thread = new Multi();
        thread.start();
        for(int i=0;i<5;++i){
            System.out.println("Thread start" +Thread.currentThread());
        }
        System.out.println("Thread end:" +Thread.currentThread());
    }
}*/
