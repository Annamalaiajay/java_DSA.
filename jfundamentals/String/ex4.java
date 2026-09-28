package jfundamentals.String;
//Count the words in "I love java programming"
public class ex4 {
    public static void main(String[]args){
    String given="I love java programming";
    String para="""
            Hello I am learning Java
Java is useful for DSA
I practice every day
            """;
    // int count =given.trim().split("\\s+").length;
    // System.out.print(count);
    int count=0;
    String [] text=para.split("\\R");
    for(String line:text){
        if(!line.trim().isEmpty()){
            count += line.trim().split("\\s+").length;
           
        }
    }System.out.print(count);
}}
