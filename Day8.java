import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Count vowels 
        // String val = sc.next();
        // int count = 0;
        // for (int i = 0; i < val.length(); i++) {
        //     char ch = Character.toLowerCase(val.charAt(i));
        //     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        //         count++;
        //     }
        // }
        // System.out.println("Number of Vowels :  "+count);
        // sc.close();

        // Reverse a String 
        // System.out.println("Enter a String : ");
        // String str = sc.nextLine();
        // String reverse = "";
        // for (int i = str.length() - 1; i >= 0; i--) {
        //     reverse += str.charAt(i);
        // }
        // System.out.println("Reverse String : " + reverse);
        // sc.close();

        // Pallindrome String 
         System.out.println("Enter a String : ");
         String str = sc.nextLine();
         String reverse = "";
         String org = str;
         for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
         }
         if(org.equals(reverse)){
            System.out.println("Palindrome String ");
         }
         else{
            System.out.println("not Palindrome Strings");
         }

    }
}
