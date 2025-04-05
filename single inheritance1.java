import java.util.Scanner; 
class salary{ 
int n; double sal; 
double cal(int n){ 
sal = n*2500; 
return sal; 
}} 
class details extends salary{ 
String na ; int eid; String d; int n; 
void display(String na,int eid,String d,int n,double sal){ 
System.out.println("Name"+na); 
System.out.println("Employee id:"+eid); 
System.out.println("Designation:"+d); 

System.out.println("Number of days worked:"+n); 
System.out.println("SALARY:"+sal); 
}} 
public class j3{ 
public static void main(String[] args) 
{ 
Scanner obj = new Scanner(System.in); 
System.out.println("Enter your name"); 
String na = obj.nextLine(); 
System.out.println("Enter employee id"); 
int eid = obj.nextInt(); 
System.out.println("Enter designation"); 
obj.nextLine(); 
String d = obj.nextLine(); 
System.out.println("Enter Number of days worked:"); 
int n = obj.nextInt(); 
details de = new details(); 
double sal = de.cal(n); 
de.display(na,eid,d,n,sal); 
obj.close(); 
} 
} 
