//Problem: Given an array and a target, find the length of the smallest sub-array whose sum is ≥ target.
//arr = {1, 4, 4} and target = 4
package Slidingwindow;
public class ex2 {
    public static void main(String[] args) {
        int[]arr={1,4,4};
        int target=4;
        int s=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            while(sum>=target)//use of while we need to check multiple times so instead of "if",
            //we use while
            {
                min=Math.min(min,i-s+1);//fomula to find currne t len(end-start+1)
                sum-=arr[s];
                s++;
            }

        }
        System.out.println("The len is :"+min);

    }
}