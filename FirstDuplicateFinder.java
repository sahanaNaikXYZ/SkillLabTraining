import java.util.HashSet;
import java.util.Scanner;

public class FirstDuplicateFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 10 numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int firstDuplicate = findFirstDuplicate(numbers);
        
        if (firstDuplicate != -1) {
            System.out.println("First duplicate: " + firstDuplicate);
        } else {
            System.out.println("No duplicates found.");
        }
        
        scanner.close();
    }

    public static int findFirstDuplicate(int[] numbers) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : numbers) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1;
    }
}
