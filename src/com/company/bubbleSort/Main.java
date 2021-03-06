package com.company.bubbleSort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Give the Array Length: ");
        Scanner sc =new Scanner(System.in) ;
        int arrLength= sc.nextInt() ;

        int arr[] = new int[arrLength] ;

        System.out.println("Give The Array Values : ");
        for(int i=0;i<arrLength;i++){

            int value = sc.nextInt();
            arr[i]=value;
        }

        System.out.print("Array Values are :[");
        for(int i=0;i<arrLength;i++){
            if(arrLength-1==i){
                System.out.print(arr[i]+"");
            } else{
                System.out.print(arr[i]+" , ");
            }

        }
        System.out.print("]");
        System.out.println(" ");

        QuickSort.quickSort(arr,0,arr.length-1);


        System.out.println("Quick Sort Done !! ");


        System.out.print("After Quick sort Values are :[");
        for(int i=0;i<arrLength;i++){
            if(arrLength-1==i){
                System.out.print(arr[i]+"");
            } else{
                System.out.print(arr[i]+" , ");
            }

        }
        System.out.print("]");
        System.out.println(" ");


    }
}
