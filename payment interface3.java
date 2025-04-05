interface Payment { 
void pay(double amount); 
} 
 
class CreditCard implements Payment { 
public void pay(double amount) { 
74  
 
System.out.println("Paid ₹" + amount + " using Credit Card."); 
} 
} 
 
class DebitCard implements Payment { 
public void pay(double amount) { 
System.out.println("Paid ₹" + amount + " using Debit Card."); 
} 
} 
 
class UPIPayment implements Payment { 
public void pay(double amount) { 
System.out.println("Paid ₹" + amount + " using UPI."); 
} 
} 
public class PaymentTest { 
public static void main(String[] args) { 
Payment p1 = new CreditCard(); 
Payment p2 = new DebitCard(); 
Payment p3 = new UPIPayment(); 
p1.pay(1000); 
p2.pay(500); 
p3.pay(250); 
} 
} 
