import java.util.*;

public class Day9 {
    public static void main(String[] args) {
        // Word Frequency
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Sentance : ");
        // String text = sc.nextLine();
        // String words [] = text.split(" ");
        // HashMap<String,Integer> frequency = new HashMap<>();
        // for (String word : words) {
        //     frequency.put(word, frequency.getOrDefault(word, 0)+1);
        // }
        // System.out.println(frequency);


        // Dupicte characters
        // Scanner sc = new Scanner(System.in);
        // String word = sc.next();
        // HashMap<Character,Integer> words = new HashMap<>();
        // for (char ch :word.toCharArray()) {
        //     words.put(ch,words.getOrDefault(ch,0)+1);
        // }
        // for (char ch : words.keySet()) {
        //     if(words.get(ch)>1){
        //         System.out.println(ch + "  Appears "+ words.get(ch)+  " times ");
        //     }
        // }

        // RemoveSpace from string 
        Scanner sc =  new Scanner(System.in);
        String text = sc.nextLine();
        String result = text.replace(" ", "");
        System.out.println(result);

    }
}
