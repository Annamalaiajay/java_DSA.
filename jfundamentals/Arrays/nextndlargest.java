package jfundamentals.Arrays;

public class nextndlargest {
    public static void main(String[] args) {
    int[]arr={1,2,3,4,5,6};
    int sec=Integer.MIN_VALUE;
    int fir=Integer.MIN_VALUE;
    for(int i=1;i<arr.length;i++){
        if(arr[i]>=fir){
            sec=fir;
            fir=arr[i];
        }
        else if (arr[i]>sec && arr[i]!=fir){
            sec=arr[i];
        }
    }
System.out.println("Scond largest is :"+sec);
    }
}

