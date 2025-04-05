/ Base Employee class 
class Employee { 
String name; 
Employee(String name) { 
this.name = name; 
} 
void work() { 
System.out.println(name + " is working."); 
38  
 
} 
} 
interface Lead { 
void leadTeam(); 
} 
interface Supervise { 
void superviseWork(); 
} 
 
class Manager extends Employee implements Lead { 
Manager(String name) { 
super(name); 
} 
 
public void leadTeam() { 
System.out.println(name + " is leading the team."); 
} 
} 
 
// Director class inheriting Manager and implementing Supervise 
class Director extends Manager implements Supervise { 
Director(String name) { 
super(name); 
} 
 
public void superviseWork() { 
System.out.println(name + " is supervising the work."); 
} 
} 
 
// Main class to test the implementation 
public class HybridInheritanceExample { 
39  
 
public static void main(String[] args) { 
Director director = new Director("Alice"); 
 
director.work(); // Inherited from Employee 
director.leadTeam();  // Implemented from Lead 
director.superviseWork(); // Implemented from Supervise 
} 
} 
