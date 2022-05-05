package com.java.main;
//Exception handling using try...catch
/*public class Excep {
    public static void main (String[] args){
        try{
            int divideByZero = 15/0;
            System.out.println("Rest of code in try block");
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException : " + e.getMessage());
        }
    }

}*/
//Exception Handling using finally block
/*class Excep{
    public static void main(String[] args){
        try{
            int divideByZero = 5/0;
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException : " + e.getMessage());
        }
        finally{
            System.out.println("This is the finally block");
        }
    }
}*/
//program to use the try and catch and finally block
/*class Excep {
    public static void main(String[] args){
        int a = 40 , b = 4, c= 4;
        int result;
        try{
            result = a / (b-c);
        } catch (ArithmeticException ae) {
            System.out.println("Cannot divide by zero." + ae);
        } finally {
            System.out.println("finally block");
        }
        result = a / (b+c);
        System.out.println("Result: " +result);
    }
}*/
//Exception handling using Java throw
/*class Excep {
    public static void divideByZero() {
        throw new ArithmeticException("Trying to divide by 0");
    }
    public static void main(String[] arg) {
        divideByZero();
    }
}*/
//programe to illustrate multiple catch block using command line argument
/*class Excep {
    public static void main(String[] args){
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException ae) {
            System.out.println("Enter second number except zero." );
        } catch (ArrayIndexOutOfBoundsException ai){
            System.out.println("Both numbers are required");
        } catch(NumberFormatException ne){
            System.out.println("Enter only integer value. ");
        } finally{
            System.out.println("Finally Block");
        }
    }
}*/
//Write a programe to illustrate the throws keywords in java
/*public class Excep{
    static void throwMethod1() throws NullPointerException{
        System.out.println ("Inside throwMethod1");
        throw new NullPointerException ("Throws_Demo1");
    }
    static void throwMethod2() throws ArithmeticException {
        System.out.println("Inside throwsMethod2");
        throw new ArithmeticException("Throws_Demo2");
    }
    public static void main(String[] args){
        try{
            throwMethod1();
        } catch (NullPointerException exp){
            System.out.println ("Exception is: " +exp);
        } try {
            throwMethod2();
        } catch(ArithmeticException ae) {
            System.out.println("Exception is: " + ae);
        }
    }
}*/
//Write a programe to demonstrate the chained exception in java
/*public class Excep{
    public static void main(String[] args){
        try{
            Exception ae = new Exception("Exception");
            ae.initCause(new ArithmeticException("Cause of th ArithmeticException"));
            throw ae;
        }catch (Exception ae) {
            System.out.println(ae);
            System.out.println(ae.getCause());
        } try {
            NumberFormatException ex = new NumberFormatException("NumberFormatException");
            ex.initCause(new NullPointerException("Cause of the NullPointerException"));
            throw ex;
        } catch(NumberFormatException ex){
            System.out.println(ex);
            System.out.println(ex.getCause());
        }
    }
}*/
//program to create custom exception in java
/*class Excep extends Exception{
    public Excep (String str){
        super(str);
    }
    }
     class Multi {
    static void validate (int age) throws Excep {
        if (age < 18) {
            throw new Excep("age is not valid to vote");
        } else {
            System.out.println("welcome to vote");
        }
    }
    public static void main(String[] args) throws Excep {
        try{
            validate(13);
        } catch (Excep ex) {
            System.out.println("Caught the exception");
            System.out.println("Exception occured: " + ex);
        }
        System.out.println("rest of the code...");

        for(int i=2;i<20;i=i+2){
            System.out.println("i= " + i );
            if(i==8){
                throw new Excep ("My Exception Occurred");
            }
        }
    }
}*/






