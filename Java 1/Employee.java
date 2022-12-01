public class Employee 
{
    // private fields
    private String first_name;
    private String last_name; 
    private String employee_id;
    private String hireDate;

  //constructor
public Employee(String employee_id,String first_name, String last_name,  String hireDate) 
    {
        this.first_name = new String(first_name);
        this.last_name = new String(last_name);
        this.employee_id = new String(employee_id);
        this.hireDate = new String(hireDate);
    }

  
public String getFirstName() 
    {
        return first_name;
    }

  
public void setFirstName(String first_name) 
    {
        this.first_name = first_name;
    }
  
public String getLastName() 
    {
       return last_name;
    }

  
public void setLastName(String last_name) 
    {
        this.last_name = last_name;
    }

public String getEmployeeID() 
    {
        return employee_id;
    }

  
public void setEmployeeID(String employee_id) 
    {
        this.employee_id = employee_id;
    }

public String getHireDate() 
    {
        return hireDate;
    }

  
public void setHireDate(String hireDate) 
    {
        this.hireDate = hireDate;
    }

public boolean isSameFirstName(String n)
    {
        String lowerString = n.toLowerCase().trim();
                if(n.equals(first_name.toLowerCase().trim()))
                    {
                        return true;
                    }
                else 
                    {
                        return false;
                    }
    }
            


public boolean isSameLastName(String n)
    {
        String lowerString = n.toLowerCase().trim();
            if(n.equals(last_name.toLowerCase().trim()))
                {
                    return true;
                }
            else 
                {
                    return false;
                }
    }
  
//To string method
public String toString() 
    {
        String str = "\nEmployee FirstName: " + first_name +
                     "\nEmployee LastName: " + last_name +
                     "\nEmployee Number: " + employee_id +
                     "\nEmployee Hire Date: " + hireDate;
        return str;
    }

 

    
    
   
}

