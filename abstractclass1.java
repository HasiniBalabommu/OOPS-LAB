abstract class Ticket { 
double price; 
Ticket(double price) { 
this.price = price; 
 
// Abstract method for price calculation 
abstract double calculatePrice(); 
 
void printTicket() { 
62  
 
System.out.println("Ticket Price: $" + calculatePrice()); 
} 
} 
 
// Bus Ticket class 
class BusTicket extends Ticket { 
BusTicket(double price) { 
super(price); 
} 
 
@Override 
double calculatePrice() { 
return price * 1.05; // 5% tax 
} 
} 
// Train Ticket class 
class TrainTicket extends Ticket { 
TrainTicket(double price) { 
super(price); 
} 
 
@Override 
double calculatePrice() { 
return price * 1.10; // 10% tax 
} 
} 
 
// Main class 
public class TicketBookingSystem { 
public static void main(String[] args) { 
Ticket busTicket = new BusTicket(100); 
Ticket trainTicket = new TrainTicket(200); 
 
System.out.println("Bus Ticket:"); 
busTicket.printTicket(); 
63  
 
 
System.out.println("\nTrain Ticket:"); 
trainTicket.printTicket(); 
} 
} 
