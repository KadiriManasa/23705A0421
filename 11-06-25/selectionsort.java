// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[]  nums={1,3,9,7,8,2};
        for (int i=0;i<nums.length-1;i++){
            int minIndex=i; 
            for(int j=i+1;j<nums.length;j++){
                if (nums[minIndex]>nums[j]){
                    minIndex=j;
                  
                }
            }
            int temp=nums[i];
            nums[i]=nums[minIndex];
            nums[minIndex]=temp;
        }
        for(int val:nums){
            System.out.println(val);
        }
    }
}