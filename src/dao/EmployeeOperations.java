package dao;
import java.util.*;


import model.*;
public class EmployeeOperations {
	Excelfile excel=new Excelfile();
	static List<Details> list1 = new ArrayList<Details>();
//Insert Expense Details	
	public List<Details> insert(Details details) throws Exception {
			list1.add(details);
			excel.excelgenerator(details,list1); 
		
			return list1;
		}
//Delete Expense Details
	public List<Details> delete(Details details) {
		list1.remove(details);
			return list1;
	}


//Get all Expense details	
	public void getAllDetails(){
		excel.excelreader("C:\\Users\\RANJITH JS\\Desktop\\New folder\\Employee-Expense-Management-System\\docs\\ExpenseDetails.xlsx");
	}



}




