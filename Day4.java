import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        // Find the Number of Digits 
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int count = 0;
        // while(n != 0){
        //     n = n/10;
        //     count +=1;
        // }
        // System.out.println("The number of Digit is : "+count);

        // Prime Number 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1 ;  i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        if (count == 2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number ");
        }
    }
}
