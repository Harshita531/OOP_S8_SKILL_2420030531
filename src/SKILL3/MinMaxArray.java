package SKILL3;
public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {25, 14, 56, 15, 36, 56, 77, 18};

        int max = arr[0], min = arr[0];

        for (int value : arr) {
            if (value > max)
                max = value;
            if (value < min)
                min = value;
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
