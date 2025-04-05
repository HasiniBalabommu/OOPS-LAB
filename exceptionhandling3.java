public class bank { 
 
// Step 2: Method that may throw an exception 
public static void bookFlight(int passengers) throws IllegalArgumentException { 
if (passengers <= 0) { 
throw new IllegalArgumentException("Invalid number of passengers. Must be 
greater than 0."); 
101  
 
} else { 
System.out.println("Flight booked successfully for " + passengers + " 
passengers."); 
} 
} 
 
public static void main(String[] args) { 
try { 
// Step 4: Call the method inside try block 
bookFlight(0); // Change this value to test valid/invalid cases 
} 
catch (IllegalArgumentException e) { 
// Step 5: Catch and handle the exception 
System.out.println("Booking Failed: " + e.getMessage()); 
} 
finally { 
// Step 6: Cleanup or final message 
System.out.println("Thank you for using the Flight Booking System."); 
} 
} 
} 
