interface Shape { 
double getArea(); 
} 
 
// Circle.java 
class Circle implements Shape { 
double radius; 
 
Circle(double radius) { 
this.radius = radius; 
} 
71  
 
public double getArea() { 
return Math.PI * radius * radius; 
} 
} 
 
// Rectangle.java 
class Rectangle implements Shape { 
double length, width; 
 
Rectangle(double length, double width) { 
this.length = length; 
this.width = width; 
} 
 
public double getArea() { 
return length * width; 
} 
} 
 
// Main.java 
public class Main { 
public static void main(String[] args) { 
Shape circle = new Circle(5); 
Shape rectangle = new Rectangle(4, 6); 
 
System.out.println("Circle Area: " + circle.getArea()); 
System.out.println("Rectangle Area: " + rectangle.getArea()); 
} 
} 
