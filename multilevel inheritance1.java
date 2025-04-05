import java.util.Scanner; 
class Person{ 
 
 
String name; 
int age; 
void display(String name,int age){ 
System.out.println("Employee name:"+name); 
System.out.println("AGE:"+age); 
} 
} 
class Employee extends Person{ 
double sal; 
void display(String name,int age,double sal){ 
System.out.println("Employee name:"+name); 
System.out.println("AGE:"+age); 
System.out.println("Salary:"+sal); 
} 
} 
class Manager extends Employee{ 
String dept; 
void display(String name,int age,double sal,String dept){ 
System.out.println("Employee name:"+name); 
System.out.println("AGE:"+age); 
System.out.println("Salary:"+sal); 
System.out.println("Department:"+dept); 
} 
} 
public class ml1{ 
public static void main(String[] args){ 
Scanner obj = new Scanner(System.in); 

 
System.out.println("Enter your name"); 
String name = obj.nextLine(); 
System.out.println("Enter your age"); 
int age = obj.nextInt(); 
System.out.println("Enter your Salary"); 
double sal = obj.nextDouble(); 
System.out.println("Enter your department"); 
obj.nextLine(); 
String dept = obj.nextLine(); 
Person p = new Person(); 
p.display(name,age); 
Manager m = new Manager(); 
m.display(name,age,sal,dept); 
} 
} 
