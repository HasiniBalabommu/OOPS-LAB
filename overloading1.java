import java.util.Scanner; 
50  
 
 
class Payment { 
 
// Cash Payment 
public void makePayment(double amount) { 
System.out.println("Processing cash payment of ₹" + amount); 
} 
 
// Credit Card Payment 
public void makePayment(String cardNumber, double amount) { 
System.out.println("Processing credit card payment..."); 
System.out.println("Card Number: **** **** **** " + 
cardNumber.substring(cardNumber.length() - 4)); 
System.out.println("Amount: ₹" + amount); 
} 
 
// UPI Payment 
public void makePayment(String upiId, double amount, String remarks) { 
System.out.println("Processing UPI payment..."); 
System.out.println("UPI ID: " + upiId); 
System.out.println("Amount: ₹" + amount); 
System.out.println("Remarks: " + remarks); 
} 
 
// UPI QR Payment 
public void makePayment(double amount, String qrCodeData) { 
System.out.println("Processing UPI payment via QR scan..."); 
System.out.println("QR Code: " + qrCodeData); 
System.out.println("Amount: ₹" + amount); 
} 
51  
 
} 
 
public class l1 { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
Payment payment = new Payment(); 
 
System.out.println("Choose payment method:"); 
System.out.println("1. Cash"); 
System.out.println("2. Credit Card"); 
System.out.println("3. UPI"); 
System.out.println("4. UPI via QR Code"); 
System.out.print("Enter option (1-4): "); 
int option = scanner.nextInt(); 
 
switch (option) { 
case 1: 
System.out.print("Enter amount: "); 
double cashAmount = scanner.nextDouble(); 
payment.makePayment(cashAmount); 
break; 
 
case 2: 
scanner.nextLine(); // consume leftover newline 
System.out.print("Enter card number: "); 
String cardNumber = scanner.nextLine(); 
System.out.print("Enter amount: ₹"); 
double cardAmount = scanner.nextDouble(); 
payment.makePayment(cardNumber, cardAmount); 
break; 
52  
 
 
case 3: 
scanner.nextLine(); // consume leftover newline 
System.out.print("Enter UPI ID: "); 
String upiId = scanner.nextLine(); 
System.out.print("Enter amount: ₹"); 
double upiAmount = scanner.nextDouble(); 
scanner.nextLine(); // consume newline 
System.out.print("Enter remarks: "); 
String remarks = scanner.nextLine(); 
payment.makePayment(upiId, upiAmount, remarks); 
break; 
 
case 4: 
scanner.nextLine(); // consume leftover newline 
System.out.print("Enter QR code data: "); 
String qrCode = scanner.nextLine(); 
System.out.print("Enter amount: ₹"); 
double qrAmount = scanner.nextDouble(); 
payment.makePayment(qrAmount, qrCode); 
break; 
 
default: 
System.out.println("Invalid option!"); 
} 
 
scanner.close(); 
} 
}
