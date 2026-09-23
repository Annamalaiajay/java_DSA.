package Slidingwindow;

public class code {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 9};
        int k = 3;

        int size = 0;

        for (int i = 0; i < k; i++) {
            size += arr[i];
        }

        int compare = size;

        for (int j = k; j < arr.length; j++) {
            size += arr[j];
            size -= arr[j - k];

            compare = Math.max(size, compare);
        }

        System.out.println("The answer is " + compare);
    }
}