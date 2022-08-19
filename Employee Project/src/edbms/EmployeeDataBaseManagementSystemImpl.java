package edbms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


class EmployeeDataBaseManagementSystemImpl implements EmployeeDataBaseManagementSystem {
	Scanner scan=new Scanner(System.in);
	LinkedHashMap<Integer,Employee>db=new LinkedHashMap<Integer,Employee>();
	
@Override
public void addEmployee(){
	System.out.println("Enter Id ,Name,Age and Salary:");
	int id=scan.nextInt();
	String name=scan.next();
	int age=scan.nextInt();
	double salary=scan.nextDouble();
	
	Employee emp=new Employee(id,name,age,salary);
	db.put(id, emp);
	System.out.println("Employees Record Inserted Successfully");
	
}
@Override
public void removeEmployee() {
     System.out.println("Enter Employee Id:");
     int id=scan.nextInt();
     
     if(db.containsKey(id)){
    	 db.remove(id);
    	 System.out.println("Employee Record Deleted");
    	 
    	 
     }
     else{
    	 try{
    	 throw new EmployeeNotFoundException("Employee Data Not Found!");
     }
    	 catch(EmployeeNotFoundException e){
    		 System.out.println(e.getMessage());
    	 }}
	
}

@Override
public void removeAllEmployee() {
db.clear();
System.out.println("All the Employees Records are Deleted Successfully");
	
}

@Override
public void displayEmployee() {
System.out.println("Enter Employee Id:");
int id=scan.nextInt();

if(db.containsKey(id)){
	Employee emp=db.get(id);
	System.out.println("Id is:"+emp.getId());
	System.out.println("Age is:"+emp.getAge());
	System.out.println("Name is:"+emp.getName());
	System.out.println("Salary is :"+emp.getSalary());
}
else{
	try{
		throw new EmployeeNotFoundException("Employee Data Not Found!");
	}
	catch(EmployeeNotFoundException e){
		System.out.println(e.getMessage());
	}
}
	
}

@Override
public void displayAllEmployee() {
	Set<Integer> setOfKeys=db.keySet();
	for(int id:setOfKeys){
		System.out.println(db.get(id));
	}

	
}

@Override
public void updateEmployee() {
System.out.println("Enter the Employee id");
int id=scan.nextInt();

if(db.containsKey(id)){
	Employee e=db.get(id);
	System.out.println("1.Update Age\n2:Update Name:\n3:Update Salary");
	System.out.println("Enter choice:");
	int choice=scan.nextInt();
	switch(choice){
	case 1:
		System.out.println("Entet Age:");
		int age=scan.nextInt();
		e.setAge(age);
		break;
	case 2:
		System.out.println("Entet Name:");
		String name=scan.next();
		e.setName(name);
		break;
	case 3:
		System.out.println("Entet Salary:");
		double salary=scan.nextDouble();
		e.setSalary(salary);
		break;
	
		default:
			System.out.println("Invalid choice!");
		
	

}}

	
}

@Override
public void countEmployees() {
	System.out.println("No of Employee Records Present:"+db.size());
	
}

@Override
public void sortEmployees() {
ArrayList<Employee>l=new ArrayList<Employee>();
Set<Integer>e=db.keySet();
for(int id:e){
	l.add(db.get(id));
}
System.out.println("1:Sort Based on Id\n2:Sort Based On Name");
System.out.println("3:Sort Based on Salary\n4:Sort Based On Age");
System.out.println("Enter choice:");
int choice=scan.nextInt();

switch(choice){
case 1:
	Collections.sort(l,new SortEmployeeById());
	for(Employee e1: l){
		System.out.println(e1);
	}
	break;
case 2:
	Collections.sort(l,new SortEmployeeByName());
	display(l);
	
	break;
case 3:
	Collections.sort(l,new SortEmployeeByAge());
	display(l);
	
	break;
case 4:
	Collections.sort(l,new SortEmployeeByMarks());
	display(l);
	
	break;

   default:
		System.out.println("Invalid Choice!");
}

	
}
private static void display(List<Employee>l)
{
	for(Employee e1: l){
		System.out.println(e1);
	}

}}
