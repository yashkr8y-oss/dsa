import java.util.*;

public class treeI {
    boolean search_I(Node root, int target){
        if (root == null){
            return false;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node current = q.remove();
            System.out.println(current.value);
            if(current.left != null){
                q.add(current.left);
            }
            if(current.right!= null){
                q.add(current.right);
            }
    }
    return false;
}

    void main(){
        System.out.println("Hello");
    }
}
