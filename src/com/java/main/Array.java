package com.java.main;
//program to print addition of same number between two numbers in array
/*public class Array{
    public static void main(String[] args){
        int[] array1 = {4,5,6,7};
        int[] array2 = {5,7,4,6};
        for (int i=0; i<array1.length;i++){
            for (int j=0; j<array2.length;j++){
                if(array1[i]==array2[j]);
                System.out.println("duplicate elements is " +array1[i] + "is");
                System.out.println(array1[i]+array2[j]);
            }
        }
    }
}*/
//copying all elements of one array to another array
/* public class Array {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = new int[arr1.length];
        for(int i=0; i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        for (int ele:arr1) {
            System.out.println(ele + "");
        }
            for (int elements:arr2){
                System.out.println(elements+"");
            }

    }
} */
//program to print same elements of two arrays
/*public class Array{
    public static void main(String[] args){
        int[] arr1 = {0,1,2,3,4,5};
        int[] arr2 = {6,7,3,8,9,0};
        for(int i=0;i<arr1.length;i++) {

            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}*/

//programe to print arrays in reverse order
/*public class Array{
    public static void main(String[] args){
        int[] arr1={7,5,9,2,4,7};
        for( int i=arr1.length-1;i>=0;i--){
            System.out.println(arr1[i]);
        }

    }
}*/

//To print elements present on even position in an array
/*public class Array{
    public static void main(String[] args){
        int[] arr1= {5,0,9,7};
        for (int i=1;i<arr1.length;i=i+2){
            System.out.println(arr1[i]+"");

        }

    }
}*/
//To print elements present on odd position in an array
/*public class Array{
    public static void main(String[] args){
        int[] arr1 = {5,2,8,1,0,6};
        for (int i=0;i<arr1.length;i=i+2){
            System.out.println(arr1[i] +"");
        }
    }
}*/

//To print maximum elemetn in array
/*public class Array{
    public static void main(String[] args){
        int[] arr1 = {2,5,8,1};
        int max = arr1[0];
        for(int i = 0 ; i<arr1.length; i++){
            if(arr1[i]>max){
                max = arr1[i];
            }
        }
        System.out.println(max);
    }

}*/
//To print smallest element in array
/*public class Array{
    public static void main(String[] args){
        int[] arr1 = {3,4,1,0,6,7};
        int min = arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]<min){
                min = arr1[i];
        }

    }
        System.out.println(min);
}}*/
//program to print sum of all numbers in the array
/*public class Array{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {

        sum = sum + arr1[i];
    }
        System.out.println(sum);

}}*/
/*public class Array{
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4};
        int max = arr1[0];
        for (int i=0;i<arr1.length;i++){
            if(arr1[i]>max){
                max = arr1[i];
            }

        }
        System.out.println(max);

    }

}*/
//program to sort array elements in ascending order
/*public class Array{
    public static void main (String[] args){
        int[] arr1 = {4,2,9,6,1,0,};
        int temp=0;
        System.out.println("elements of original array: ");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]>arr1[j]){
                    temp = arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
            System.out.print(arr1[i]+" ");
        }



    }
}*/
//Porgram to print avarage
/*public class Array{
    public static void main (String[] args){
        int[] arr1 = {1,2,3,4};
        int sum = 0;
        for (int i=0;i<arr1.length;i++){
            sum = sum+arr1[i];
            }
        int avarage = sum/arr1.length;
        System.out.println(avarage);
        }

    }*/
