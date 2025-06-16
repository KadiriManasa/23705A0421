class Main {
    public static void main(String[] args) {
        int [] nums={2,4,5,6,8,9,1};
        int min=nums[0];
        for(int i =0;i<nums.length;i++){
            int value=nums[i];
            if(value<min){
                min=value;
            }
        }
        System.out.println("Min :"+min);
    }
}