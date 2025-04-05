import java.util.Scanner; 
class vehicle{ 
void speedup(int s){ 
} 
} 
44  
 
class car extends vehicle{ 
@Override 
void speedup(int s){ 
s=s+20; 
System.out.println("Car Speed:"+s); 
} 
} 
class bike extends vehicle{ 
@Override 
void speedup(int s){ 
s=s+10; 
System.out.println("bike speed"+s); 
} 
} 
public class r3{ 
public static void main(String[] args){ 
Scanner obj = new Scanner(System.in); 
System.out.println("Enter your current speed"); 
int s = obj.nextInt(); 
car c = new car(); 
bike b = new bike(); 
c.speedup(s); 
b.speedup(s); 
} 
}
