//for every window of size k, count how many times the number 1 appears in that window. Print the maximum count found across all windows.
package Slidingwindow;
//int[] arr = {1, 2, 1, 3, 4, 1, 1, 5};
//int k = 3;
public class ex4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 1, 1, 5};
        int k = 3;
        int count=0;
    
        for(int i=0;i<k;i++){
            if(arr[i]==1){
                count+=1;
            }}//first window for temp
        int max=count;//set max as count for camparing 
        for(int j=k;j<arr.length;j++){
            if(arr[j]==1){
                count++;//in count sums count should be incread  if the currnt number is 1
            }
            if(arr[j-k]==1){
                count--;//in count sums count should be reduced if the currnt number is 1

            }
            max=Math.max(max,count);//camparing function 

        }
       
 System.out.println("count"+max);
        }
        
        
    }
    

