package Hashmap;
//first non repeating character
import java.util.*;
public class ex2 {
    public static void main(String[] args) {
    String s ="JAVA";
    HashMap<Character,Integer> map = new HashMap<>();
    for(int i=0;i<s.length();i++){
        char c =s.charAt(i);
        map.put(c,map.getOrDefault(c,0)+1);
    }
    System.out.println(map);
    for(int j=0;j<s.length();j++){
        char a =s.charAt(j);
        if(map.get(a)==1){
            System.out.println("The first non-repeating char : "+a);
            break;
        }
    }
}
}
