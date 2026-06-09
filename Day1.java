import java.util.*;


public class Day1{
    public static void main(String [] args){
        System.out.println("Hello World !");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("My age is "+ a);

        float celsius = sc.nextFloat();
        float fahrenheit = (celsius * 9/5) + 32;
        System.out.println(fahrenheit);
    
        sc.close();
        
    }
}