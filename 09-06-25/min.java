import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        int count=0;
        if (val%2!=0){
            perform(val);
            count++;
            if (val==2){
                val=val-1;
                System.out.println(count);
            }
        }else{
            perform2(val);
            System.out.println(count);
            
        }
    }




    public static int perform(int val){
        val=val-1;
        count++;
        int temp=val/2;
        val=val/temp;
        count=count++;
        return count;
    
    }
    public static int perform2(int val){
        int temp=val/2;
        count++;
        val=val/temp;
        val=val-1;
        count++;
        return count;
    }
    
}