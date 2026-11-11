
import java.util.Scanner;
public class prinitng {
    void main(){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the value of N");
 int n = sc.nextInt();
 for (int i = 0; i < n; i ++){
    for (int j = 0; j <i; j++){
        System.out.print(" *");
    } 
    System.out.print("\n");
 }
    
    for (int i = n; i > 0; i --){
    for (int j = 0; j <i; j++){
        System.out.print(" *");
    } 
    System.out.print("\n");
 }
    
    
}
}
