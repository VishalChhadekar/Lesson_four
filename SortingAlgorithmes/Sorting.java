package com.DSA.SortingAlgorithmes;


public class Sorting {
    public static void main(String[] args) {
        int[] arr = {9,6,3,1,2,4,5};
        int length = arr.length;
        selectionSort(arr);
        System.out.println("The sorted elements are:");
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int index =i;
            System.out.println("Value of the index: "+index);
            for(int j=i+1;j<arr.length;j++){
                System.out.println("The value of j: "+j);
                if(arr[j]<arr[index]){
                    System.out.println("Inside the if condition");
                    index =j;
                }
            }
            int smallNumber = arr[index];
            System.out.println(smallNumber);
            arr[index]= arr[i];
            System.out.println("arr[index]: "+arr[index]);
            arr[i]= smallNumber;
        }
    }
}