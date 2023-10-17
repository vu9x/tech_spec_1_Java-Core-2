package org.example;

public class MinMaxCheck {
    //Задача: Задать одномерный массив. Написать методы поиска в нём
    //минимального и максимального элемента;

    public static int[] minCheck (int[] arr) {
        int result = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(result > arr[i]) {
                result = arr[i];
                index = i;
            }
        }

        int[] answer = {index, result};
        return answer;
    }

    public static int[] maxCheck (int[] arr) {
        int result = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if(result < arr[i]) {
                result = arr[i];
                index = i;

                //Спасибо)
            }
        }
        int[] answer = {index, result};
        return answer;

    }
}
