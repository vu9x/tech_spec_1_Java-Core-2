package org.example;

public class SquareArr {
    //Задача: Создать квадратный целочисленный массив (количество строк и
    //столбцов одинаковое), заполнить его диагональные элементы единицами,
    //используя цикл(ы)

    // Спасибо!

    public static int[][] filledArr(int size){
        int[][] result = new int[size][size];

        for (int i = 0; i < size; i++) {
            result[i][i] = 1;
            result[i][size - i - 1] = 1;
        }
        return result;
    }

}
