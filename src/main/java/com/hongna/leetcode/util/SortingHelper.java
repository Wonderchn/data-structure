package com.hongna.leetcode.util;

import com.hongna.leetcode.Sort.BubbleSort;
import com.hongna.leetcode.Sort.InsertSort;
import com.hongna.leetcode.Sort.QuickSort;
import com.hongna.leetcode.Sort.SelectionSort;

public class SortingHelper {
    private SortingHelper() {
    }

    ;

    public static <E extends Comparable<E>> boolean isSorted(E[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].compareTo(arr[i]) > 0)
                return false;
        }
        return true;

    }

    public static <E extends Comparable<E>> void sortTest(String sortname, E[] arr) {
        long startTime = System.nanoTime();
        if (sortname.equals("SelectionSort")) {
            SelectionSort.sort(arr);
        }
        if (sortname.equals("InsertionSort")){
            InsertSort.sort(arr);
        }
        if (sortname.equals("QuickSort")){
            QuickSort.sort(arr);
        }
        else if (sortname.equals("BubbleSort")){
            BubbleSort.sort(arr);
        }
        long endTime = System.nanoTime();
        double time = (endTime - startTime) / 1000000000.0;

        if (!SortingHelper.isSorted(arr)) {
            throw new RuntimeException(sortname + " 执行错误");
        }
        System.out.println(String.format("%s, n= %d : %f s", sortname, arr.length, time));

    }
}
