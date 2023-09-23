import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String inputText = scanner.nextLine();

        System.out.println("Number of words in the text: " + countWords(inputText));
        System.out.println("Number of unique words in the text: " + countUniqueWords(inputText));

        Map<String, Integer> wordFrequencyMap = calculateWordFrequency(inputText);
        System.out.println("Word frequency:");
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static int countWords(String text) {
        String[] words = text.trim().split("\\s+");
        return words.length;
    }

    public static int countUniqueWords(String text) {
        String[] words = text.split("\\s+");
        Map<String, Integer> uniqueWordsMap = new HashMap<>();

        for (String word : words) {
            uniqueWordsMap.put(word, uniqueWordsMap.getOrDefault(word, 0) + 1);
        }

        return uniqueWordsMap.size();
    }

    public static Map<String, Integer> calculateWordFrequency(String text) {
        String[] words = text.split("\\s+");
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        for (String word : words) {
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }

        return wordFrequencyMap;
    }
}