class Main {
    public static void main(String[] args) {
        int[] nums={10,19,2,3,1,8,9};
        int index=-1;
        int target=9;
        for(int i=0;i<nums.length ;i++){
            if (target==nums[i])
                index=i;
        }
        System.out.println(index==1 ? "Elements not found":
            "element found at index :" + index);
        
    }
}