package homework;

public class MinMaxDiff {

    public static String diff(int[] arr){
        if(arr.length < 2) throw new ArrLengthException("Array elements should be 2 or more.");

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {max = arr[i];}
            if(min > arr[i]) {min = arr[i];}
        }

        return String.format("Max = %d, min = %d, max - min = %d", max, min, max - min);
    }
}
