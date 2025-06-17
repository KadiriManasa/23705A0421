// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        generateCombinations(new int[] {2,8,9,4}, 0 , new ArrayList<>());
        
    }
    public static void generateCombinations(int[] nums,int index,ArrayList<Integer>result){
        if (index==nums.length){
            System.out.println(result);
           
            return;
        }
        result.add(nums[index]);
        generateCombinations(nums,index+1,result);
        result.remove(result.size() -1);
        generateCombinations(nums,index+1,result);
    }
}