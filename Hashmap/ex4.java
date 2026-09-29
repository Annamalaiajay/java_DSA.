package Hashmap;
//find dupicate 
import java.util.*;
public class ex4 {
    public static void main(String[] args) {
        String s="SATHYABAM UNIVERSITY";
        HashMap <Character,Integer>map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        if(s.length()!=map.size()){
            System.out.println(false);
        }else{System.out.println(true);}
    }
}
