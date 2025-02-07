public class DebitCounter {
    public static void main(String[] args) {
        int[] transactions = {900, 1500, 600, 1200, 400};
        int debitCount = countDebits(transactions);
        
        System.out.println("Number of debits: " + debitCount);
    }

    public static int countDebits(int[] transactions) {
        int count = 0;
        for (int amount : transactions) {
            if (amount < 1000) {
                count++;
            }
        }
        return count;
    }
}
