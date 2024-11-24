
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] arr = {15, 3, 28, 9, 42, 56, 7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();
        int high = arr.length-1;
        if(arr.length>2) {
            for (int i = arr.length - 2; i >= 0; i--) {
                if (arr[high] != arr[i]) {
                    System.out.println("Second highest element is: "+arr[i]);
                    return;
                }
            }
            System.out.println("no distinct element found");
        } else if (arr.length==2) {
            if(arr[0]!=arr[1]) {
                System.out.println(arr[0]);
            }else{
                System.out.println("no distinct element in array");
            }
        }else{
            System.out.println("array length too short");
        }
    }
}