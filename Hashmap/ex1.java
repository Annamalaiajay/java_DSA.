package Hashmap;
import java.util.*;
public class ex1 {
    public static void main(String[] args) {
        int[]nums={1,2,1,2,1,2,4,3,2};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num :nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
     System.out.println(map);}
}
