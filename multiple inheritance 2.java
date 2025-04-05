import java.util.Scanner; 
class Bankaccount{ 
int ano; 

 
double b; 
float roi; 
double amt; 
void deposit(double b,double amt){ 
b=b+amt; 
System.out.println("BALANCE:"+b); 
} 
} 
class Savingsaccount extends Bankaccount{ 
double w; 
void withdraw(double b,double w){ 
if(w>b){ 
System.out.println("balance not sufficient"); 
} 
else{ 
b=b-w; 
System.out.println("BALANCE:"+b); 
} 
} 
} 
class fixeddeposit extends Savingsaccount{ 
float getinterest(float r,double b){ 
r=(float)(b*0.77); 
return r; 
} 
} 
public class ml2{ 
 
 
public static void main(String[] args){ 
Scanner obj = new Scanner(System.in); 
System.out.println("Enter the balance in your acount"); 
double b = obj.nextDouble(); 
System.out.println("Enter the amount you want to deposit"); 
double amt = obj.nextDouble(); 
System.out.println("Enter the amount you want to withdraw"); 
double w = obj.nextDouble(); 
Bankaccount ba = new Bankaccount(); 
ba.deposit(b,amt); 
Savingsaccount s = new Savingsaccount(); 
s.withdraw(b,w); 
} 
}
