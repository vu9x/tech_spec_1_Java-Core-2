package homework;

public class EvenCounts {

    public static int countEvens(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                result +=1;
            }
        }
        return result;
    }
}
