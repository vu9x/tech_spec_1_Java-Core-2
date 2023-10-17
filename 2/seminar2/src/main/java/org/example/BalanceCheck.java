package org.example;

public class BalanceCheck {

    private static int arrSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/2;
    }

    public static boolean balancedArr(int[] arr){

        int halfIndex = 0;
        int halfSum = arrSum(arr);

        int firstHalf = 0;
        for (int i = 0; i < arr.length; i++) {

            firstHalf += arr[i];

            if(firstHalf == halfSum) {
                halfIndex = i;
                firstHalf = halfSum;
                break;
            } else {
                return false;
            }
        }
        // я быстро не проверю задание. Если у кого то готово, можете предложить свой вариант

        int secondHalf = 0;
        for (int i = halfIndex+1; i < arr.length; i++) {
            secondHalf += arr[i];
        }

        if(firstHalf == secondHalf) {
            return true;
        }
        return false;
    }
}


//public class Main {
//    public static void main(String[] args) {
//       int[] arr =new int[]{1,1,1,2,1};
//        boolean isBalance = false;
//        for (int i = 0; i < arr.length; i++) {
//            if(subSum(arr, 0, 0) == subSum(arr, i+1, arr.length-1 )){
//                isBalance = true;
//            }
//        }
//        System.out.println(isBalance);
//    }
//
//    public static int subSum(int[] arr, int firstIndex, int lastIndex){
//        int subSum = 0;
//        for (int i = firstIndex; i <= lastIndex ; i++) {
//            subSum += arr[i];
//        }
//        return subSum;
//    }
//}

//только ошибка в ифе
//там до i первую половину брать нужно
//if(subSum(arr, 0, i) == subSum(arr, i+1, arr.length-1 ))
