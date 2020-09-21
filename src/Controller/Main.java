package Controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import com.itextpdf.text.DocumentException;

import businesslogic.Validation;
import java.time.*;
import java.time.format.DateTimeFormatter;

import dao.*;
import model.*;
class FirstClass {

	
//Manager function	
	void admin() {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
	
		System.out.println("1.Add Expense");
		System.out.println("2.Delete Expense");
		System.out.println("3.Expense Details");
	    System.out.println("4.Exit");
		System.out.println("\nWhich Action You want to Perform?(1-4)");
		System.out.println("*----------------------------------------*");
		String id;
		String Name;
		String Department;
		String Date;
		String Amount;
		String Purpose;
		String yn;
		Details details = null;
		Excelfile excel=new Excelfile();
		//ConverToPDF pdf =new ConverToPDF();
		List<Details> list1=new ArrayList<Details>();
		EmployeeOperations ins=new EmployeeOperations();
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("*----------------------------------------*");
			System.out.println("         Enter Expense Details         ");
			System.out.println("*----------------------------------------*");
			System.out.print("Enter ID : ");
			id = sc.next();
			System.out.print("Enter  Name : ");
			Name = sc.next();
			System.out.print("Enter Department : ");
			Department = sc.next();
			System.out.print("Enter Date : ");
			Date = sc.next();
			System.out.print("Enter Amount : ");
			Amount = sc.next();
			System.out.print("Enter Purpose : ");
			Purpose = sc.next();
			
			
			details = new Details(id,Name,Department,Date,Amount,Purpose);
			System.out.println("Check the details" +Name+" to add");
			System.out.println("ID : "+id+"\nName : "+Name+"\nDepartment : "+Department+"\nDate : "+Date+"\nAmount : "+Amount+"\nPurpose : "+Purpose);
			String Confirm;
			System.out.println("Confirm to add details: \nPress (Y/N) ");
			Confirm=sc.next();
			
			if(Confirm.equalsIgnoreCase("Y")){
			try {
				ins.insert(details);
			} catch (Exception e) {
			
				e.getMessage();
			}
			
			System.out.println("Inserted Successfully!");
			}
			else {
				System.out.println("Enter the Details Properly");
			}
			
		
			break;
		case 2:
			System.out.println("*----------------------------------------*");
			System.out.println("         Delete Expense Details        ");
			System.out.println("*----------------------------------------*");
			System.out.print("Enter  ID  to Delete : ");
			id = sc.next();
			System.out.print("Enter Date  to Delete : ");
			Date = sc.next();
			System.out.print("Enter Purpose  to Delete : ");
			Purpose = sc.next();
			
			excel.deleteitem(id,Date,Purpose);
			
			System.out.println("*----------------------------------------*");
			break;
		
		case 3:
			System.out.println("*-----------------------------------------------------------------------------------------------------*");
			System.out.println("                                        Expense Details            ");
			System.out.println("*-----------------------------------------------------------------------------------------------------*");
			System.out.println("Id             Name           Department          Date                  Amount           Purpose    ");
			System.out.println("*-----------------------------------------------------------------------------------------------------*");
			ins.getAllDetails();
			System.out.println("*-----------------------------------------------------------------------------------------------------*");

			break;
			
		case 4:
			System.out.println("THANK YOU!");
			System.exit(0);
			break;
		
		default:
			System.out.println("Wrong Choice");
			break;
		}
	 }while(choice!=4);
	}
	
	
	//Employee function	
	@SuppressWarnings("null")
	void employee() {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
	
		System.out.println("1.Add Expense");
		System.out.println("2.Delete Expense");
	    System.out.println("3.Exit");
		System.out.println("\nWhich Action You want to Perform?(1-3)");
		System.out.println("*----------------------------------------*");
		String id;
		String Name;
		String Department;
		String Date;
		String Amount;
		String Purpose;
		Details details = null;
		Excelfile excel=new Excelfile();
		//ConverToPDF pdf =new ConverToPDF();
		List<Details> list1=new ArrayList<Details>();
		EmployeeOperations ins=new EmployeeOperations();
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("*----------------------------------------*");
			System.out.println("         Enter Expense Details         ");
			System.out.println("*----------------------------------------*");
			System.out.print("Enter ID : ");
			id = sc.next();
			System.out.print("Enter  Name : ");
			Name = sc.next();
			System.out.print("Enter Department : ");
			Department = sc.next();
			System.out.print("Enter Date : ");
			Date = sc.next();
			System.out.print("Enter Amount : ");
			Amount = sc.next();
			System.out.print("Enter Purpose : ");
			Purpose = sc.next();
			
			
			details = new Details(id,Name,Department,Date,Amount,Purpose);
			System.out.println("Check the details to add");
			System.out.println("ID : "+id+"\nName : "+Name+"\nDepartment : "+Department+"\nDate : "+Date+"\nAmount : "+Amount+"\nPurpose : "+Purpose);
			String Confirm;
			System.out.println("Confirm to add details: \nPress (Y/N) ");
			Confirm=sc.next();
			
			if(Confirm.equalsIgnoreCase("Y")){
			try {
				ins.insert(details);
			} catch (Exception e) {
			
				e.getMessage();
			}
			
			System.out.println("Inserted Successfully!");
			}
			else {
				System.out.println("Enter the Details Properly");
			}
			
			
			break;
		case 2:
			System.out.println("*----------------------------------------*");
			System.out.println("         Delete Expense Details        ");
			System.out.println("*----------------------------------------*");
			System.out.print("Enter ID  to Delete : ");
			id = sc.next();
			System.out.print("Enter Date to Delete : ");
			Date = sc.next();
			System.out.print("Enter Purpose to Delete : ");
			Purpose = sc.next();
			
			excel.deleteitem(id,Date,Purpose);
			
			System.out.println("*----------------------------------------*");
			break;
		case 3:
			System.out.println("THANK YOU!");
			System.exit(0);
			break;
	
		
		default:
			System.out.println("Wrong Choice");
			break;
		}
	 }while(choice!=3);
	}
}

public class Main {

	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("*----------------------------------------*");
		System.out.println("        EXPENSE MANAGEMENT SYSTEM          ");
		System.out.println("*----------------------------------------*");
		while (true) {
			System.out.println("1.Manager");
			System.out.println("2.Employee");
			System.out.println("3.Exit");
			System.out.println("*----------------------------------------*");
			String username;
			String password;
		
			FirstClass fc = new FirstClass();
		
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			int choice = sc.nextInt();
			
			Validation validate=new Validation();
			switch(choice) {
				case 1:
					System.out.print("Enter your username : ");
				    username = sc.next();
					System.out.print("Enter you password :");
					password = sc.next();
					if(validate.adminlogin(username,password) ){
						System.out.println("Login Successfull!");
						System.out.println("*----------------------------------------*");
						fc.admin();
					}
					else
						System.out.println("Check your username and password");
					    System.out.println("*----------------------------------------*");
					break;
				
				case 2:
					System.out.print("Enter your username : ");
				    username = sc.next();
					System.out.print("Enter you password :");
					password = sc.next();
					if(validate.employeelogin(username,password) ){
						System.out.println("Login Successfull!");
						System.out.println("*----------------------------------------*");
						fc.employee();
					}
					else
						System.out.println("Check your username and password");
					    System.out.println("*----------------------------------------*");
					break;
				case 3:
					System.out.println("THANK YOU!");
					System.exit(0);
					break;
				default:
					System.out.println("Wrong Choice!!");
					break;
				}
	        }
		}
	}




