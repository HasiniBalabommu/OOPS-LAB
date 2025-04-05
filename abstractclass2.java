abstract class pen{ 
abstract void write(); 
abstract void refill(); 
} 
class pics extends pen{ 
void write(){ 
System.out.println("Writing smoothly with a fountain pen"); 
} 
void refill(){ 
System.out.println("refilling the ink"); 
} 
} 
public class m1{ 
public static void main(String []args){ 
pics p = new pics(); 
p.write(); 
p.refill(); 
} 
}
