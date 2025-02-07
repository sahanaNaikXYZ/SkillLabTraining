public class SalesAnalyzer {
    public static void main(String[] args) {
        int[] sales = {900, 1500, 600, 1200, 400};
        int highestSalesDay = findHighestSalesDay(sales);
        
        System.out.println("Day with highest sales: " + (highestSalesDay + 1));
    }

    public static int findHighestSalesDay(int[] sales) {
        int maxIndex = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > sales[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
