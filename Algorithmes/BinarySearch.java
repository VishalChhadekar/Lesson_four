package com.DSA.Algorithmes;



public class BinarySearch {
    public static  void main(String[] args){
        int[] arr = {3,6,9,12,34, 45, 67, 86};
        int key = 67;
        int arrlength = arr.length;
        binarySearch(arr,0,key,arrlength);
    }
    public static void binarySearch(int[] arr, int start, int key, int length){
        int midValue = (start+length)/2;//0+8/2=4
        System.out.println("The index of mid value is: "+midValue);
        System.out.println("MidValu: "+ arr[midValue] );//34
        start = midValue;
        System.out.println("Start: "+ start);
        while(start<=length)//4<8 ==true
        {
            if(arr[midValue]<key)//12<12
            {
                System.out.println(arr[midValue]<key);
                start = midValue + 1;//2+1=3
            } 
            else if(arr[midValue]==key)//12==12
            {
                System.out.println("Element is found at index :"+midValue);
                break;
            }
            else {
                length=midValue-1;//4-1=3
            }
            midValue = (start+length)/2;//3+5/2=4
        }
        if(start>length){
            System.out.println("Element is not found");
        }
    }
}
