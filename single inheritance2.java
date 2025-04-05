import java.util.Scanner; class 
person{ 

 
void   displayinfo   (String   name,int 
age){ System.out.println("name: "+name); 
System.out.println("age: "+age); 
} 
} 
public class human{ 
public static void main(String []args){ Scanner 
scan=new Scanner(System.in); 
System.out.print("Enter your name: "); String 
name=scan.nextLine(); System.out.print("Enter 
your age: "); int age=scan.nextInt(); 
person p=new person(); 
p.displayinfo(name,age); 
} 
} 
