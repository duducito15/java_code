public class BubleSort {
    public static void main(String[] args) {
        int[] array = {5, -2, 8, 12, 1, 55, 40, 25, 0, 38, -5, -30};
        bubbleSort(array);
        
        for (int element : array) {
        System.out.print(element + " ");
        }
        }
        
        public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
        if (array[j] > array[j + 1]) {
        int temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
        }
        }
        }
        }
    }
