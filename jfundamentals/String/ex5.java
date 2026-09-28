package jfundamentals.String;
//Remove all vowels from "SATHYBAMA UNIVERSITY".
public class ex5 {
    public static void main(String[] args) {
          String given="SATHYBAMA UNIVERSITY";
          StringBuilder ans = new StringBuilder();
          String v="aeiouAEIOU";
          for(int i =0;i<given.length();i++){
            char c=given.charAt(i);
            if(v.indexOf(c)==-1){
                ans.append(c);
            }
          }
          String res=ans.toString().replaceAll("\\s+","");
          System.out.println(res);
    }
  
}
