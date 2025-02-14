public class QuickSelectTemperature {
    
    public static int findKthClosest(int[] readings, int target, int k) {
        quickSelect(readings, 0, readings.length - 1, k, target);
        return readings[k - 1];  // After QuickSelect, the k-th closest element is at index k-1
    }

    private static void quickSelect(int[] arr, int left, int right, int k, int target) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right, target);
            if (pivotIndex == k - 1) return;
            else if (pivotIndex > k - 1) quickSelect(arr, left, pivotIndex - 1, k, target);
            else quickSelect(arr, pivotIndex + 1, right, k, target);
        }
    }

    private static int partition(int[] arr, int left, int right, int target) {
        int pivot = arr[right];
        int pivotDiff = Math.abs(pivot - target);
        int i = left;
        
        for (int j = left; j < right; j++) {
            if (Math.abs(arr[j] - target) < pivotDiff) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, right);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] readings = {72, 75, 68, 80, 74};
        int target = 73;
        int k = 2;

        System.out.println(findKthClosest(readings, target, k));  // Expected output: 74
    }
}