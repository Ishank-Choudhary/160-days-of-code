//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 6, 4, 3, 1};
        int temp =0;
        int diff =0;
        int n = arr.length;
        for(int i=0;i<=n-1;i++){
            for(int j=i+1;j<=n-1;j++){
                if(arr[i]<arr[j]){
                    diff = arr[j] - arr[i];
                    //System.out.println(arr[i]+"-"+arr[j]+"is - "+diff);
                }
                if(diff>temp){
                    temp = diff;
                }
            }
        }
        System.out.print(temp);
    }
}