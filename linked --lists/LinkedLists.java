import java.util.Scanner; 
 
 class linkedLists{
static class Node{
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}


static void main(String[] args){
Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numbner of Nodes you want ? ")
    int n = sc.nextInt();
    
while(current != null){
    System.out.println("following nodes: " + current.data);
    current = current.next;
}

}
}