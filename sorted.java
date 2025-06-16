class Main {
    public static void main(String[] args) {
        int[] nums={25,75,100,25};
        int flag=0;
        for(int i=0;  i<nums.length-1;i++){
             if(nums[i]>nums[i+1]){
                 flag=1;
                 break;
             }
            
            
        }
        if(flag==0){
            System.out.println("Sorted");
        }else{
            System.out.println("Not sorted");
        }
    }
}