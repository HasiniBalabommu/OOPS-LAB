interface Vehicle { 
void start(); 
void stop(); 
int getSpeed(); 
} 
class Car implements Vehicle { 
public void start() { 
System.out.println("Car started."); 
} 
public void stop() { 
System.out.println("Car stopped."); 
} 
 
public int getSpeed() { 
return 80; 
} 
} 
class Bike implements Vehicle { 
public void start() { 
System.out.println("Bike started."); 
} 
 
public void stop() { 
System.out.println("Bike stopped."); 
} 
 
public int getSpeed() { 
return 60; 
} 
} 
73  
 
public class VehicleTest { 
public static void main(String[] args) { 
Vehicle car = new Car(); 
Vehicle bike = new Bike(); 
 
car.start(); 
System.out.println("Car speed: " + car.getSpeed() + " km/h"); 
car.stop(); 
 
System.out.println(); 
 
bike.start(); 
System.out.println("Bike speed: " + bike.getSpeed() + " km/h"); 
bike.stop(); 
} 
} 
