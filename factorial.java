import java.util.*; 
public class Factorial { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
System.out.print("Enter a number: "); 
18  
 
int number = scanner.nextInt(); 
int factorial = 0; 
for (int i = 1; i <= number; i++) { 
factorial *= i; 
} 
System.out.println("Factorial of " + number + " is " + factorial); 
scanner.close(); 
} 
}
