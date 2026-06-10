import java.util.*;

public class Day2{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c :");
        int c = sc.nextInt();

        if(a >= b && a >= c){
            System.out.println(a +" is largest in 3 number");
        }
        else if(b >= a && b >= c) {
            System.out.println(b +" is largest in 3 number");
        }
        else{
            System.out.println(c +" is largest in 3 number");
        }
    }
}