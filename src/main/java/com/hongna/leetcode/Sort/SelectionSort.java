package com.hongna.leetcode.Sort;

import java.util.Arrays;

public class SelectionSort {
    private SelectionSort(){};

    public static <E extends Comparable> void sort(E[] arr){
        for (int i = 0 ; i <arr.length; i++){
            //循环不变量 arr[i...n)是有序的;arr[i` ]
            int minindex = i;
            for (int j = i ; j < arr.length ; j++){
                if (arr[j] .compareTo(arr[minindex]) <0 ){
                    minindex = j;
                }
            }
            swap(arr,i,minindex);
        }

    }
    private static <E> void swap(E[] arr , int i ,int j){
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static <E> void main(String[] args) {
        Integer[] arr = {1,2,8,56,8,2};
        SelectionSort.sort(arr);
        for (int i :arr){
            System.out.println(i);
            
        }
    }
}
