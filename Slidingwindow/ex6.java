//LEETCODE:76. Minimum Window Substring[HARD]
package Slidingwindow;
import java.util.HashMap;
public class ex6 {
    public static void main(String[] args) {
        String s="Ajay";
        String t="Aj";
        HashMap<Character,Integer>need= new HashMap<>();
        HashMap<Character,Integer>have=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            need.put(c,need.getOrDefault(c,0)+1);
        }
        int target=need.size();
        int count=0;
        String ans="";
        int start=0;
        int min=Integer.MAX_VALUE;
        for (int j =0 ; j<s.length();j++){
            char a=s.charAt(j);
            have.put(a,have.getOrDefault(a,0)+1);
            if (need.containsKey(a)&&have.get(a).equals(need.get(a))){
                count++;
            }
            while(count==target){
                String current=s.substring(start,j+1);
                if(ans.equals("")||ans.length() > current.length()){
                    ans=current;
                }
                char remove=s.charAt(start);
have.put(remove, have.get(remove) - 1);
if(need.containsKey(remove)&& need.get(remove)>have.get(remove)){
    count--;
}
start++;
            }}
        System.out.println(ans);
    }
}
    
    

