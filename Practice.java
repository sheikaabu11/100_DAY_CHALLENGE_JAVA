import java.util.*;
public class Practice {
    // duplicate characters

    public static void main(String[] args) {
        boolean val = false;
        Scanner sc =  new Scanner(System.in);
        String text  = sc.next();
        HashMap<Character,Integer> map = new HashMap<>();
        for (char ch : text.toCharArray()) {
           map.put(ch,map.getOrDefault(ch, 0)+1);
         }
         for (char ch : map.keySet()) {
            if(map.get(ch) > 1){
                System.out.println(ch + "  Appears " + map.get(ch) );
           val = true;
            }
            
         }
         if(!val){
         System.out.println("No Duplicate Characters");
         }

    }
    
}
