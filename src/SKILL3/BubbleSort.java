package SKILL3;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
