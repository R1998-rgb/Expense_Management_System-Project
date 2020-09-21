package model;

public class Details {
	
	
	private String id;
	private String Name;
	private String Department;
	private String Date;
	private String Amount;
	private String Purpose;
	
	
	public Details(String id, String name, String department, String date, String amount, String purpose) {
		super();
		this.id = id;
		this.Name = name;
		this.Department = department;
		this.Date = date;
		this.Amount = amount;
		this.Purpose = purpose;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		this.Name = name;
	}


	public String getDepartment() {
		return Department;
	}


	public void setDepartment(String department) {
		this.Department = department;
	}


	public String getDate() {
		return Date;
	}


	public void setDate(String date) {
		this.Date = date;
	}


	public String getAmount() {
		return Amount;
	}


	public void setAmount(String amount) {
		Amount = amount;
	}


	public String getPurpose() {
		return Purpose;
	}


	public void setPurpose(String purpose) {
		this.Purpose = purpose;
	}
	
	

}
