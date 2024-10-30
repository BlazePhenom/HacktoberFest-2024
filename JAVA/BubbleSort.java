public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int N = arr.length;
        
        for (int i = 0; i < N - 1; i++) { // this is done to perform the sorting operation for the complete input till it gets sorted
            for (int j = 0; j < N -i -1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];  // the lines 8 to 10 allow us to swap values after comparing the consecutive values otherwise of which we might lose the values.
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;    
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        
        System.out.println("Original array:");
        for (int num : arr) System.out.print(num + " ");
        
        bubbleSort(arr);
        
        System.out.println("\nSorted array:");
        for (int num : arr) System.out.print(num + " ");
    }
}
