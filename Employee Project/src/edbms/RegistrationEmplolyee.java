package edbms;

import java.util.Scanner;

class RegistrationEmployee {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Welcome to EDBMS");
	System.out.println("--------------------------");
	
	EmployeeDataBaseManagementSystem obj=new EmployeeDataBaseManagementSystemImpl();
	
	while(true){
		System.out.println("1:ADD EMOPLOYEE\n2:REMOVE EMPLOYEE");
		System.out.println("3:REMOVEALL EMOPLOYEE\n4:DISPLAY EMPLOYEE");
		System.out.println("5:DISPLAYALL EMPLOYEE\n6:UPDATE EMPLOYEE:");
		System.out.println("7:COUNT EMOPLOYEE\n8:SORT EMPLOYEE\n9:Exit");
		System.out.println("Enter Choice:");
		int choice=scan.nextInt();
		switch(choice){
		case 1:
			obj.addEmployee();
			break;
		case 2:
			obj.removeEmployee();
			break;
		case 3:
            obj.removeAllEmployee();
			break;
		case 4:
			obj.displayEmployee();
			break;
		case 5:
			obj.displayAllEmployee();
			break;
		case 6:
			obj.updateEmployee();
			break;
		case 7:
			obj.countEmployees();
			break;
		case 8:
			obj.sortEmployees();
			break;
		case 9:
			System.exit(0);
			System.out.println("Thank You!");
		default:
			System.out.println("Invalid choice!,kindly enter valid choice");
			break;
		
		
		}
		System.out.println("----------------");
	}
}
}
