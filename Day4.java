import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n != 0){
            n = n/10;
            count +=1;
        }
        System.out.println("The number of Digit is : "+count);

    }
}
