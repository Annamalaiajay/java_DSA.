
//Find the length of the longest substring without any repeating characters.

//Example: in "abcabcbb", the answer is 3, because "abc" is the longest stretch of letters where nothing repeats (once you hit the second a, you'd have a repeat).

package Slidingwindow;
import java .util.*;
public class ex5 {
    public static void main(String[] args) {
    String s ="abcabcbb";
    HashSet<Character>window=new HashSet<>();
    int start=0;
    int len=0;
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        while(window.contains(c)){
            window.remove(s.charAt(start));
            start++;
        }
        window.add(c);
        len=Math.max(len,i-start+1);
    }
    System.out.print("The max len:"+len);
    
    }

}
