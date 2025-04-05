import java.util.Scanner; 
class ShapeAreaCalculator { 
// Area of square 
public void calculateArea(double side) { 
double area = side * side; 
System.out.println("Area of square: " + area + " sq. units"); 
} 
 
// Area of rectangle 
public void calculateArea(double length, double breadth) { 
double area = length * breadth; 
System.out.println("Area of rectangle: " + area + " sq. units"); 
} 
 
// Area of circle 
55  
 
public void calculateArea(double radius, boolean isCircle) { 
if (isCircle) { 
double area = Math.PI * radius * radius; 
System.out.println("Area of circle: " + area + " sq. units"); 
} 
} 
} 
 
public class l2 { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
ShapeAreaCalculator calculator = new ShapeAreaCalculator(); 
 
System.out.println("Choose shape to calculate area:"); 
System.out.println("1. Square"); 
System.out.println("2. Rectangle"); 
System.out.println("3. Circle"); 
System.out.print("Enter option (1-3): "); 
int option = scanner.nextInt(); 
 
switch (option) { 
case 1: 
System.out.print("Enter side length of square: "); 
double side = scanner.nextDouble(); 
calculator.calculateArea(side); 
break; 
case 2: 
System.out.print("Enter length of rectangle: "); 
double length = scanner.nextDouble(); 
System.out.print("Enter breadth of rectangle: "); 
double breadth = scanner.nextDouble(); 
calculator.calculateArea(length, breadth); 
break; 
case 3: 
System.out.print("Enter radius of circle: "); 
56  
 
double radius = scanner.nextDouble(); 
calculator.calculateArea(radius, true); 
break; 
 
default: 
System.out.println("Invalid option!"); 
} 
scanner.close(); 
} 
} 
