interface Flyable { 
void fly(); 
} 
 
interface Swimmable { 
void swim(); 
} 
class Bird implements Flyable { 
public void fly() { 
System.out.println("Bird is flying."); 
36  
 
} 
} 
class Duck implements Flyable, Swimmable { 
public void fly() { 
System.out.println("Duck is flying."); 
} 
 
public void swim() { 
System.out.println("Duck is swimming."); 
} 
} 
public class m1 { 
public static void main(String[] args) { 
Bird bird = new Bird(); 
bird.fly(); 
 
Duck duck = new Duck(); 
duck.fly(); 
duck.swim(); 
} 
} 
