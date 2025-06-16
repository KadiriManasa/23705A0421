class Main {
    public static void main(String[] args) {
        printRange(1,5);
        //System.out.println("Try programiz.pro");
    }
    public static void printRange(int start,int end){
        if (start>end){
            return;
        }
        //System.out.println(start);
        printRange(start+1,end);
        System.out.println(start);
    }
}