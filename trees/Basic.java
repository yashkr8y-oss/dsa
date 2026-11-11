
import java.util.LinkedList;
import java.util.Queue;


class Basic{
public static void main(String[] args){
Node root = new Node(5);
 root.left = new Node(6);
 root.right = new Node(7);
root.right.right = new Node(10);                                                                                             
root.left.right = new Node(20);
root.right.left = new Node(50);
Tree t = new Tree();
t.inorder(root);
t.bfs(root);
int a = t.countLeafNodes(root);
System.out.println(a);
System.out.println(t.heigthTree(root));
System.out.println( t.search(root, 100) + " bollean" );
treeI m = new treeI();
System.out.println(m.search_I(root, 100));
}
}

class Tree{
   void inorder(Node r){// root in middle
    if (r == null){
        return;
   }
   inorder(r.left);
   System.out.println(r.value);
   inorder(r.right);

}
void bfs(Node root){
    // creating a queue
    Queue<Node> q = new LinkedList<>();
    if(root==null){
        return;
    }
    int count = 0;
    q.add(root);
    while(!q.isEmpty())
        {
        Node current = q.remove();
        count ++;
       

        System.out.println(current.value);
        if(current.left != null)
            {
            q.add(current.left);
        }
        if(current.right != null)
        {
            q.add(current.right);
            
        }

        
}
System.out.println("The total number of the  nodes are :"+count);
    }
    int countLeafNodes(Node root){
        if(root == null){
        return 0;
        }
        if (root.left == null &&  root.right == null){
            return 1;
        }
        return  
        ( countLeafNodes(root.left) + countLeafNodes(root.right));
    }
    int heigthTree(Node root){
        if(root == null){
            return 0;
        }
        int heigthLeft = heigthTree(root.left);
        int heightRight = heigthTree(root.right);
        return 1 + Math.max(heightRight,heigthLeft); 
    }
    boolean search(Node root, int target){
        if(root == null){
            return false;
        }
        if(root.value == target){
            return true;
        }
        return search(root.left, target) || search(root.right , target);
    }
}


class Node{
    int value;
    Node left;
    Node right;
    Node(int value){
        this.value = value;
         left = null;
         right = null;

    }
}
