import java .util.Stack;
public class Main{
    public static void main(String[] args){
        Stack<Integer> s=new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println("Elements in the stack are: ");
        System.out.println(s);
    }
    public static void reverse(Stack<Integer> stack){
    if (stack.isEmpty()){
        return;
    }
    int val=stack.pop();
    stack.push(val);
    }
}
