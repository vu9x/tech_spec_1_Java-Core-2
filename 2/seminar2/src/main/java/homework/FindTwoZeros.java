package homework;

public class FindTwoZeros {
    public static boolean find(int[] arr){
        if(arr.length < 2) throw new ArrLengthException("Array elements should be 2 or more.");

        for (int i = 0; i < arr.length; i++) {
            if(i+1 < arr.length && arr[i] == 0 && arr[i+1] == 0){
                return true;
            }
        }

        return false;
    }
}
