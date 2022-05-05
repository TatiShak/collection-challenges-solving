package collection.challenges;

import java.util.*;

public class Challenges {


    //You must complete the implementation of these methods so that unit test pass.

    /*
        Given an array nums, return a new array where only unique sorted values exist
    */
    public int[] uniqueValues(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            uniqueNums.add(nums[i]);
        }
        int[] result = new int[uniqueNums.size()];
        Iterator<Integer> iterator = uniqueNums.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            result[i] = iterator.next();
            i++;
        }
        Arrays.sort(result);
        return result;
    }

    /*
        Given an array nums, return the max value. If the array is empty, simply return -1
    */
    public int maxFromArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        if (nums.length == 0) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }

        }
        return max;
    }

    /*
        Given a list of String elements, return a new list where there are only elements that have more than 3 chars
    */
    public List<String> charsOver3(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String stringItem = list.get(i);
            if (stringItem.length() > 3) {
                newList.add(stringItem);
            }
        }
        return newList;
    }

    /*
        Given two lists, return a new list where only unique elements from 2 lists exist
    */
    public List<Integer> addTwoLists(List<Integer> list1, List<Integer> list2) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int i = 0; i < list1.size(); i++) {
            uniqueSet.add( list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            uniqueSet.add(list2.get(i));
        }
        Iterator<Integer> iterator = uniqueSet.iterator();
        List<Integer> result = new ArrayList<>();
        while (iterator.hasNext()) {
            result.add(iterator.next());

        }
        return result;
    }

    /*
        Given String str, return how many 'ab' repeats in this str. You can ignore case sensitivity
    */
    public int repeatAbCount(String str) {
        int i = 0;
        int repeats = 0;
        //abc
        if (str == null || str.length() < 2) {
            return repeats;
        }
        while (i < str.length() - 1) {
            char each1 = str.toLowerCase().charAt(i);
            char each2 = str.toLowerCase().charAt(i + 1);
            if (each1 == 'a' && each2 == 'b') {
                repeats++;
            }
            i++;
        }
        return repeats;
    }

    /*
        Given the argument list, return the difference between the largest and the smallest values.
        In case of empty list, return -1
    */
    public int bigDiff(List<Integer> list) {
        // 1,2,3,4 -> 3
        if (list.size() == 0)
            return -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
            if (list.get(i) > max) {
                max = list.get(i);

            }

        }
        return max - min;
    }

    /*
        Given two lists, calculate their averages separately and return the largest of them.
        Return 0 in case both lists are empty
    */
    public double maxAverage(List<Integer> list1, List<Integer> list2) {
        int sum1 = 0;
        int sum2 = 0;
        if (list1 == null && list2 == null)
            return 0;
        for (int i = 0; i < list2.size(); i++) {
            sum2 = sum2 + list2.get(i);
        }
        for (int i = 0; i < list1.size(); i++) {
            sum1 = sum1 + list1.get(i);
        }
        double average1 = sum1 / list1.size();
        double average2 = sum2 / list2.size();

        return Math.max(average1, average2);
    }

    /*
        Given a list of String values and leng, return the number of elements that have the same length as leng
    */
    public int wordsCount(List<String> list, int leng) {
        int i = 0;
        int count = 0;
        while (i < list.size()) {
            String str = list.get(i);
            if (str.length() == leng) {
                count++;
            }
            i++;
        }
        return count;
    }


    /*
        Given int num, return a list where it contains values from 0 to num (excluded)
    */
    public List<Integer> fillArr(int num) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < num) {
            list.add(i);
            i++;
        }
        return list;
    }
}

