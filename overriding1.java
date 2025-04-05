import java.util.Scanner; 
class Employee { 
double sal; 
int n; 
void calculateSalary(double sal,int n){ 
} 
} 
class programmer extends Employee{ 
@Override 
void calculateSalary(double sal,int n){ 
sal = n*2500; 
System.out.println("Programmers Salary:"+sal); 
} 
} 
class manager extends Employee{ 
@Override 
void calculateSalary(double sal,int n){ 
sal=n*1500; 
41  
 
System.out.println("Manager Salary:"+sal); 
} 
} 
public class r1{ 
public static void main(String[] args){ 
Scanner obj = new Scanner(System.in); 
programmer p = new programmer(); 
manager m = new manager(); 
System.out.println("Enter the number of days worked"); 
int n = obj.nextInt(); 
double sal = 0; 
p.calculateSalary(sal,n); 
m.calculateSalary(sal,n); 
} 
}
