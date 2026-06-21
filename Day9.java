import java.util.*;

public class Day9 {
    public static void main(String[] args) {
        // Word Frequency
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentance : ");
        String text = sc.nextLine();
        String words [] = text.split(" ");
        HashMap<String,Integer> frequency = new HashMap<>();
        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0)+1);
        }
        System.out.println(frequency);
    }
}
