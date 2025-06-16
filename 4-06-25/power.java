public class main{
    public static void main(String[] args){
        System.out.println(npowx(2,3));
    }

    public static int npowx(int n,int x){
    if (x+1==1){
        return 1;
    }
    
    int val=n*npowx(n,x-1);
    return val;
    }
    
}