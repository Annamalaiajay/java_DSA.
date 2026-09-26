public class ex7 {
    public static void main(String[] args) {
        int[] customers = {1, 2, 3, 4, 5, 6};
        int[] grumpy = {0, 1, 0, 1, 1, 1};
        int m = 3;

        int n = customers.length;
        int satisfied = 0;

        for (int i = 0; i < n; i++) {
            if (grumpy[i] != 1) {
                satisfied += customers[i];
            }
        }

        int temp = 0;

        for (int j = 0; j < m; j++) {
            if (grumpy[j] == 1) {
                temp += customers[j];
            }
        }

        int maxGain = temp;

        for (int k = m; k < n; k++) {

            if (grumpy[k] == 1) {
                temp += customers[k];
            }

            if (grumpy[k - m] == 1) {
                temp -= customers[k - m];
            }

            maxGain = Math.max(maxGain, temp);
        }

        System.out.println(satisfied + maxGain);
    }
}