public class Main{
    public static void main(String[] args){
        Tree t=new Tree(new int[] {1,2,-1,-1,3,-1,-1});
        t.InOrder();
    }
}


class Node {
    int data;
    Node left;
    Node right;
    Node (int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Tree{
    Node root;
    int index=-1;
    Tree (int [] nodes){
        this.root=buildTreeUsingArrays(nodes);
        System.out.println(index);
    }
    public Node buildTreeUsingArrays(int [] nodes){
        index++;
        if (index >=nodes.length){
        return null;
        }
        if (nodes[index]==-1)
        return null;
        Node newNode = new Node(nodes[index]);
        newNode.left=buildTreeUsingArrays(nodes);
        newNode.right=buildTreeUsingArrays(nodes);
        return newNode;
        
    }
    public void InOrder(){
        Node temp=this.root;
        InOrderHelper(temp);
    }
    private void InOrderHelper(Node temp){
        if (temp==null) return;
        
        InOrderHelper(temp.left);
        System.out.print(temp.data + " ");
        InOrderHelper(temp.right);
    }
}