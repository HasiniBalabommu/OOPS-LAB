class DeliveryEstimator { 
// Delivery time based on distance 
public void estimateTime(double distance) { 
double time = 10 + (2 * distance); 
System.out.println("Estimated Delivery Time: " + time + " minutes"); 
} 
 
// Delivery time with traffic conditions 
public void estimateTime(double distance, boolean heavyTraffic) { 
double time = 10 + (2 * distance); 
if (heavyTraffic) { 
time += 5; 
} 
System.out.println("Estimated Delivery Time (with traffic): " + time + " minutes"); 
} 
60  
 
// Delivery time based on order type (Fast or Normal) 
public void estimateTime(double distance, String orderType) { 
double time = 10 + (2 * distance); 
if (orderType.equalsIgnoreCase("Fast")) { 
time -= 5; // 5 min faster for fast delivery 
} 
System.out.println("Estimated Delivery Time (" + orderType + " Delivery): " + time 
+ " minutes"); 
} 
} 
 
public class DeliveryTest { 
public static void main(String[] args) { 
DeliveryEstimator delivery = new DeliveryEstimator(); 
 
delivery.estimateTime(5); // Distance-based 
delivery.estimateTime(5, true); // Distance with traffic 
delivery.estimateTime(5, "Fast"); // Distance with fast delivery 
} 
} 
