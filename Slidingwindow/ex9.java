public class ex9 {
    public static void main(String[] args) {
    int k=3;
    int[]nums={1,2,3,4,5};
    if (k<=1){System.out.println(-1);}
    int base = 0;
    int start = 0;
    int product = 1;
    for (int j = 0; j < nums.length; j++) {
            product *= nums[j];
            while (product >= k) {
                product /= nums[start];
                start++;
                }
                base += j - start + 1;
                }
                System.out.println(base);

}}
