package jfundamentals.String;
//Reverse each word in "hello world". (Expected: olleh dlrow. Hint: split, then reverse each one.)
public class ex6 {
    public static void main(String[] args) {
        String g = "hello world";
        String[] words = g.trim().split("\\s+");
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            // Reverse each individual word using StringBuilder.reverse()
            StringBuilder word = new StringBuilder(words[i]);
            result.append(word.reverse());
            
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        
        System.out.println(result.toString()); // Output: olleh dlrow
    }
}
