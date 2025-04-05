import java.util.Scanner; 
class Shape { 
double calculateArea() { 
return 0; 
} 
double calculatePerimeter() { 
33  
 
return 0; } } 
class Rectangle extends Shape { 
double length, width; 
Rectangle(double l, double w) { 
length = l; 
width = w; 
} 
 
double calculateArea() { 
return length * width; 
} double calculatePerimeter() { 
return 2 * (length + width 
} } 
class Circle extends Shape { 
double radius; double pi = 3.14159; 
Circle(double r) { 
radius = r; 
} 
 
double calculateArea() { 
return pi * radius * radius; 
} 
double calculatePerimeter() { 
2 * pi * radius; 
} } 
class j4 { 
public static void main(String[] args) { 
Scanner obj = new Scanner(System.in); 
System.out.println("Enter the length"); 
double l = obj.nextDouble(); 
System.out.println("Enter breadth"); 
double w = obj.nextDouble(); 
System.out.println("Enter radius"); 
double r = obj.nextDouble(); 
34  
 
Shape rect = new Rectangle(l,w); 
System.out.println("Rectangle Area: " + rect.calculateArea()); 
System.out.println("Rectangle Perimeter: " + rect.calculatePerimeter()); 
Shape circ = new Circle(r); System.out.println("\nCircle Area: " + 
circ.calculateArea()); System.out.println("Circle Perimeter: " + 
circ.calculatePerimeter()); 
} 
}
