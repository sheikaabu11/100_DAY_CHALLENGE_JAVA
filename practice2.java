import java.util.HashMap;
import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text  = sc.nextLine();
        String word [] = text.split(" ");
        HashMap<String,Integer> map =  new HashMap<>();
    
        for (String val : word) {
            map.put(val,map.getOrDefault(val, 0)+1);
        }
        System.out.println(map);
    }
}
