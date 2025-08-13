package SKILL3;
public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {25, 47, 3, 19, 8, 18};

        int min = arr[0];
        int max = arr[0];

        for (int value : arr) {
            if (value < min) min = value;
            if (value > max) max = value;
        }

        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}
