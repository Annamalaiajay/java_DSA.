package jfundamentals.String;
//Count the vowels and consonants in
public class ex3 {
    public static void main (String[]args){
    char [] target={'a','e','i','o','u'};
    String v="aeiou";
    String given="JAVA-STRING-basics";
    String s=given.toLowerCase();
    int count=0;
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(Character.isAlphabetic(c)){
        if(v.indexOf(c)!=-1){ count+=1;}}
      }
      System.out.print(count);
  
}}
