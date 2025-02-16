import java.util.*;

public class minstock {
    public static List<Integer> minStockPrices(int[] prices, int k) {
        List<Integer> result = new ArrayList<>(); // Stores final minimum values
        Deque<Integer> deque = new LinkedList<>(); // Stores indexes of potential min values

        for (int i = 0; i < prices.length; i++) {
            // Remove elements from deque that are out of the current window
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst(); // Remove from front
            }

            // Remove elements from deque that are greater than current element
            while (!deque.isEmpty() && prices[deque.peekLast()] > prices[i]) {
                deque.pollLast(); // Remove from back
            }

            // Add current element index to deque
            deque.offerLast(i);

            // Store result when first valid window is formed
            if (i >= k - 1) {
                result.add(prices[deque.peekFirst()]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] prices = {120, 110, 115, 100, 105, 98, 102};
        int k = 3;
        System.out.println(minStockPrices(prices, k)); // [110, 100, 100, 98, 98]
    }
}