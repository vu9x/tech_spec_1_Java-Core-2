package org.example;
import homework.ArrLengthException;
import homework.EvenCounts;
import homework.FindTwoZeros;
import homework.MinMaxDiff;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 1, 2, 3, 4};
        int[] arr2 = new int[]{2, 0, 0};
        int[] arr3 = new int[]{1, 3, 5};
        int[] arr4 = new int[]{};


        //1. Написать метод, возвращающий количество чётных элементов массива.
        // countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
        System.out.println("ex1: ");
        System.out.println(EvenCounts.countEvens(arr1));
        System.out.println(EvenCounts.countEvens(arr2));
        System.out.println(EvenCounts.countEvens(arr3));

        //2. Написать функцию, возвращающую разницу между самым большим и самым
        // маленьким элементами переданного не пустого массива.
        System.out.println("ex2: ");
        try{
            System.out.println(MinMaxDiff.diff(arr1));
            System.out.println(MinMaxDiff.diff(arr2));
            System.out.println(MinMaxDiff.diff(arr3));
            System.out.println(MinMaxDiff.diff(arr4));
        } catch (ArrLengthException ex){
            System.out.println(ex.getMessage());
        }

        //3. Написать функцию, возвращающую истину, если в переданном массиве есть два
        // соседних элемента, с нулевым значением.
        System.out.println("ex3: ");
        try{
            System.out.println(FindTwoZeros.find(arr1));
            System.out.println(FindTwoZeros.find(arr2));
            System.out.println(FindTwoZeros.find(arr3));
            System.out.println(FindTwoZeros.find(arr4));
        } catch (ArrLengthException ex){
            System.out.println(ex.getMessage());
        }

    }
}