package jfundamentals.String;
//Write a program that checks whether "racecar" is a palindrome using the two-pointer method.
public class ex2 {
    public static void main(String[] args) {
        String given="MADAM";
        given.toLowerCase();
        int left=0;
        int right=given.length()-1;
        boolean ispalan=true;
        while(left<right){
            if(given.charAt(right) != given.charAt(left)){
                ispalan=false;
            }
            left++;
            right--;
        }
        System.out.println(ispalan ? "palandrome":"not palandrome");
    }}

