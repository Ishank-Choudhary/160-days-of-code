import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,5,0,0,4};
        int[] tempArr = new int[arr.length];
        int arrSize = arr.length;
        int index =0;
        for(int i=0;i<arrSize;i++){
            if(arr[i]!=0){
                tempArr[index]=arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(tempArr));
    }
}