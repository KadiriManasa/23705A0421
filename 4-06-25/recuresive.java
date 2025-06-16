import java.util.Stack; 
public class Main{
    public static void main(String[] args){
        Stack<Integer> s=new Stack<Integer>();
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(10);
        pushBottom(s,60);
        System.out.println("Elemenys in the stack are : ");
        System.out.println(s);
    }


    public static void pushBottom(Stack<Integer> stack,int ele){
        
        if (stack.isEmpty()){
        stack.push(ele);
        return;
        }
        int val=stack.pop();
        pushBottom(stack,ele);
        stack.push(val);
    }
}



output:
Elemenys in the stack are : 
[60, 20, 30, 40, 10]
