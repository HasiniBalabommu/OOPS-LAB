public class p { 
public static String reverseWords(String sentence) { 
String[] words = sentence.split("\\s+"); 
StringBuilder reversed = new StringBuilder(); 
for (int i = words.length - 1; i >= 0; i--) { 
92  
 
reversed.append(words[i]).append(" "); 
} 
return reversed.toString().trim(); 
} 
public static void main(String[] args) { 
String sentence = "Hello World from Java"; 
System.out.println("Original: " + sentence); 
System.out.println("Reversed: " + reverseWords(sentence)); 
} 
} 
