import java.util.Scanner;

public class Day5 {


    public static void main(String[] args) {
     Scanner sc  = new Scanner(System.in);

     System.out.print("Enter a number : " );
    // List of Prime Number
    //  int n = sc.nextInt();

    //  for (int num = 2; num <=n; num++) {
    //     int count = 0;
    //     for (int i = 1; i<= num ; i++) {
    //         if(num % i == 0){
    //             count++;
    //         }
    //      }
    //      if(count == 2){
    //         System.out.println(num);
    //      }
    //  }
    
    // count digit
    // int n = sc.nextInt();
    // int count = 0;
    // while(n != 0){
    //     count++;
    //     n = n / 10;
    // }
    // System.out.println(count);

    // Reverse a number 

    // int n = sc.nextInt();
    // int rev = 0;
    // while(n != 0 ){
    //     rev = (n % 10)+ rev*10;
    //     n /= 10;
    // }
    // System.out.println(rev);

    // Palindrome

 int n = sc.nextInt();
    int rev = 0;
    int org = n;
    while(n != 0 ){
        rev = (n % 10)+ rev*10;
        n /= 10;
    }
    if(org == rev){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not Palindrom");
    }
}

}

