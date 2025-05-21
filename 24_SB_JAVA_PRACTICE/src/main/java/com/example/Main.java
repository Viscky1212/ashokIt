package com.example;

import java.util.*;

class Main {

    // Instance method (not static)
    public  List<Integer> mergedList(List<List<Integer>> lists) {
        List<Integer> mergedList = new ArrayList<>();
        for (List<Integer> list : lists) {
            mergedList.addAll(list);
        }
     
        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 2, 4, 5);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 7);
        List<Integer> list3 = Arrays.asList(10, 11, 12, 13);
        List<List<Integer>> inputList = Arrays.asList(list1, list2, list3);

        // Create object to call non-static method
        Main obj = new Main();
        List<Integer> mergeList = obj.mergedList(inputList);

        System.out.println(mergeList);
    }
}

