// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int[]  nums={1,3,9,7,8,2};
        for (int j=0;j<nums.length-1;j++){
            boolean isSwapped=false;
            for(int i=0;i<nums.length-j-1;i++){
                if (nums[i]>nums[i+1]){
                    int temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                    isSwapped=true;
                }
            }
            if (!isSwapped) break;
        }
        for(int val:nums){
            System.out.println(val);
        }
    }
}