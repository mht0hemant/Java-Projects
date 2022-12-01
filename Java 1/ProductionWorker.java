
//a subclass of the Employee superclass
public class ProductionWorker extends Employee 
{
    // private fields
    private int shift;
    private double hourlyPayRate;

//constructor 
public ProductionWorker(String employee_id,String first_name, String last_name , String hireDate, int shift, double payRate)
    {
        super(employee_id,first_name,last_name,  hireDate);
        this.shift = shift;
        this.hourlyPayRate = payRate;
    }

//pw is productionworker object 
public ProductionWorker(ProductionWorker pw) 
    {
        super( pw.getEmployeeID(),pw.getFirstName(),pw.getLastName(), pw.getHireDate());
        this.shift = pw.getShift();
        this.hourlyPayRate = pw.getPayRate();
    }
//accessor (getter)
public int getShift() 
    {
    return shift;
    }

//mutator (setter)  
public void setShift(int newShift) 
    {
    this.shift = newShift;
    }

  
public double getPayRate() 
    {
    return hourlyPayRate;
    }

  
public void setPayRate(double newPayRate) 
    {
    this.hourlyPayRate = newPayRate;
    }

//To string method 
public String toString() 
    {
        String str = super.toString();
        str += "\nEmployee Shift: " + shift +
               "\nEmployee Hourly Pay Rate: " + hourlyPayRate;
           
        return str;
    }

}