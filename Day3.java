import java.util.*;

public class Day3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // Check Sum
    // int sum = n * (n + 1)/2;
    // System.out.println( "Sum of First " + n + " number = " +sum);

    //  Multiple Table
    // for(int i= 1; i <= 10 ; i++){
    //     System.out.println(n+ " X " + i + "  = " + (n*i));
    // }

    // Factorial

    long Factorial = 1;
    for (int i = 1; i <= n; i++){
        Factorial = Factorial * i;
    }
    System.out.println("factorial of " + n + " = " + Factorial);
}

    
}
