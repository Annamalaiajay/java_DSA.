//3550. Smallest Index With Digit Sum Equal to Index
//You are given an integer array nums.Return the smallest index i such that the sum of the digits of nums[i] is equal to i.
//If no such index exists, return -1.
package jfundamentals.Arrays;
public class LC3550 {
    public static void main(String[] args) {
        int[]nums={1,2,3};
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int ans2=0;
            while(temp>0){
                int d=temp%10;
                ans2+=d;
                temp/=10;
            }
            if (ans2==i){
                if(i<ans){
                    ans=i;
                }
            }
        }
        if (ans==Integer.MAX_VALUE){
            System.out.println(-1); 

        }else{
            System.out.println(ans);
        }
        
    }
}