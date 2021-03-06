package com.company.bubbleSort;

public class QuickSort {

    private static void swap(int[] arr , int a, int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b]=temp ;
    }

    public static void quickSort(int[] arr , int low, int high){

        if(arr.length==0){
            return ;
        }

        if(low<high){
            int idx= partition( arr,low ,high);
            quickSort(arr,low,idx-1);
            quickSort(arr,idx+1,high);

        }


    }

    private static int partition(int[] arr,int lowerBound , int upperBound){

        int pivotIndex=upperBound ;
        int pivotElement=arr[lowerBound] ;

        for(int i=upperBound;i>lowerBound;i--){
            if(arr[i]>= pivotElement){
                // Swapping Arr[i] and Arr[pivotIndex]
                swap(arr,i,pivotIndex);
                pivotIndex -- ;
            }
        }

        // Swapping Arr[pivotIdx] and Arr[lowerBound]
        swap(arr,pivotIndex,lowerBound);

        return pivotIndex ;
    }
}
