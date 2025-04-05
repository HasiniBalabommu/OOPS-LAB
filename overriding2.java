import java.util.Scanner; 
class games{ 
void show(){ 
} 
} 
class cricket extends games{ 
@Override 
void show(){ 
System.out.println("No of players:11"); 
} 
} 
class hockey extends games{ 
@Override 
void show(){ 
System.out.println("No of players:11"); 
} 
} 
class football extends games{ 
@Override 
void show(){ 
System.out.println("No of players:11"); 
43  
 
} 
} 
public class r2{ 
public static void main(String[] args){ 
cricket c = new cricket(); 
hockey h = new hockey(); 
football f = new football(); 
c.show(); 
h.show(); 
f.show(); 
} 
} 
