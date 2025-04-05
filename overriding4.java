import java.util.Scanner; 
class Bank{ 
double getInterestrate(){ 
return 0; 
} 
} 
class SBI extends Bank{ 
@Override 
double getInterestrate() 
{ 
return 8.77; 
} 
} 
class ICICI extends Bank{ 
@Override 
double getInterestrate(){ 
return 8.22; 
} 
} 
class RBI extends Bank{ 
@Override 
double getInterestrate(){ 
return 8.0; 
} 
} 
47  
 
public class m1{ 
public static void main(String[] args){ 
Scanner obj = new Scanner(System.in); 
System.out.println("Enter your bank name"); 
String bankname = obj.nextLine().trim().toUpperCase(); 
Bank bank; 
switch(bankname){ 
case "SBI": 
bank = new SBI(); 
break; 
case "ICICI": 
bank = new ICICI(); 
break; 
case "RBI": 
bank = new RBI(); 
break; 
default: 
System.out.println("Inavlid bank name"); 
obj.close(); 
return; 
} 
System.out.println("Interest Rate is:"+bank.getInterestrate()+"%"); 
obj.close(); 
} 
}
