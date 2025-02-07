import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductRatingTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of ratings: ");
        int n = scanner.nextInt();
        int[] ratings = new int[n];
        
        System.out.println("Enter the ratings: ");
        for (int i = 0; i < n; i++) {
            ratings[i] = scanner.nextInt();
        }
        
        int mostFrequentRating = findMostFrequentRating(ratings);
        
        System.out.println("Most frequent rating: " + mostFrequentRating);
        scanner.close();
    }

    public static int findMostFrequentRating(int[] ratings) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int rating : ratings) {
            frequencyMap.put(rating, frequencyMap.getOrDefault(rating, 0) + 1);
        }
        
        int maxFrequency = 0;
        int mostFrequentRating = -1;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentRating = entry.getKey();
            }
        }
        return mostFrequentRating;
    }
}