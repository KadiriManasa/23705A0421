class Main {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.pop();
        s.print();
       
    }
}











class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
        
    }
}
class Stack{
    Node head;
    Node top;
    Stack(){
        this.head=null;
        htis.top=null;
    }
    boolean isEmpty(){
        if (top==null){
            return true;
        }else{
            return false;
        }
    }
    void push(){
        Node newNode=new Node(val);
        newNode.next=top;
        top=newNode;
        
    }
    int  pop(){
        
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
            int num=top.data;
            top=top.next;
            return num;
        }
    }
    int peak(){
        if (isEmpty()){
            System.out.println("Stack is empty");
        }else{
            return top.data;
        }
    }
    void print(){
        if (isEmpty()){
            return;
        }
        Node temp=top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}        
    
   