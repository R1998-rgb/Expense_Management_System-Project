package businesslogic;

public class Validation{
	//Admin login Validation
	public boolean adminlogin(String username,String password) {
		
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin@123"))
				return true;
		else 
				return false;
	}
	//Employee login Validation+
     public boolean employeelogin(String username,String password) {
    	 
    	 if(username.equalsIgnoreCase("emp")&& password.equalsIgnoreCase("emp@123"))
    		 return true;
    	 else
    		 return false;
     }
	
	
}