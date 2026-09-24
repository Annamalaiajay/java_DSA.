//Find the maximum sum of any k consecutive elements.
//int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};
//int k = 2;
package Slidingwindow;
public class ex3 {
    public static void main(String[] args) {
        int max=0;
        int k=2;
        int[]arr={3,1,4,1,5,9,2,6};
        int start=max;
        for(int i=0;i<k;i++){
            max+=arr[i];
        }
        int temp=max;
        for(int j=k;j<arr.length;j++){
            temp+=arr[j];
            temp-=arr[j-k];
            if(temp>=max){
                max=temp;
            }

        }
        System.out.println("The maximum sum is :"+max);
    }
    
}
