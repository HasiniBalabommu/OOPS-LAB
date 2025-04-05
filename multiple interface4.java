// Printable.java 
interface Printable { 
void print(); 
} 
// Scannable.java 
interface Scannable { 
void scan(); 
} 
// PrinterScanner.java 
class PrinterScanner implements Printable, Scannable { 
public void print() { 
System.out.println("Printing document..."); 
} 
 
public void scan() { 
System.out.println("Scanning document..."); 
} 
} 
 
public class e { 
public static void main(String[] args) { 
PrinterScanner device = new PrinterScanner(); 
 
device.print(); 
device.scan(); 
} 
}
