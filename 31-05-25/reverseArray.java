// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int j=0;
        int[] arr=new int[nums.length];
        for (int i=nums.length-1;i>=0;i--){
            int val=nums[i];
            arr[j]=val;
            j++;
        }
        System.out.print(Arrays.toString(arr));

    }
}