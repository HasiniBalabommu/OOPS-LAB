class ShoppingCart { 
// Total bill for a single item 
public void calculateBill(double price, int quantity) { 
double total = price * quantity; 
System.out.println("Total bill: ₹" + total); 
} 
 
// Total bill for multiple items 
public void calculateBill(double[] prices) { 
double total = 0; 
for (double price : prices) { 
total += price; 
} 
System.out.println("Total bill for multiple items: ₹" + total); 
58  
 
} 
 
// Total bill with discount 
public void calculateBill(double price, int quantity, double discount) { 
double total = price * quantity; 
double discountAmount = total * (discount / 100); 
double finalAmount = total - discountAmount; 
System.out.println("Total bill after " + discount + "% discount: ₹" + finalAmount); 
} 
} 
 
public class ShoppingTest { 
public static void main(String[] args) { 
ShoppingCart cart = new ShoppingCart(); 
 
cart.calculateBill(500, 2); // Single item 
cart.calculateBill(new double[]{200, 300, 150}); // Multiple items 
cart.calculateBill(1000, 2, 10); // Discounted bill 
} 
}
