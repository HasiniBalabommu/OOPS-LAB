import java.util.Scanner; 
public class EvenOddCheck { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter a number: "); 
int num = sc.nextInt(); 
19  
 
if (num % 2 == 0) 
System.out.println(num + " is Even."); 
else 
System.out.println(num + " is Odd."); 
sc.close(); 
} 
}
