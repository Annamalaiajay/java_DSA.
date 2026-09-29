package Hashmap;
//highest frequency in string

import java.util.HashMap;

public class ex3 {
    public static void main(String[] args) {
        String s="banana";
        HashMap<Character,Integer>map=new HashMap<>();
         char ans='\0';
        for (int i =0;i<s.length();i++) {
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
       
        int count=0;
        for(int i=0;i<s.length();i++){
            char z=s.charAt(i);
            if(map.get(z)>count){
            ans=z;
            count=map.get(z);}
        }
        System.out.print(ans);

    }
}
