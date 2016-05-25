/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

/**
 *
 * @author ngenge
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {
    
    private double baseSalary;
    
    public BasePlusCommissionEmployee(String firstName,String lastName,String socialSecurityNumber,
            double grossSales,double commissionRate,double baseSalary){
        
        //explicit call to super class constructor
        super(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);
        
        if(baseSalary >= 0.0)
            this.baseSalary = baseSalary;
        else{
            System.out.println("Base salary must be >= 0.0\nSetting base salary to 0.0\n");
        }
    }
    
    
    public void setBaseSalary(double baseSalary){
        if(baseSalary >= 0.0)
            this.baseSalary = baseSalary;
        else{
            System.out.println("Base salary must be >= 0.0\nSetting base salary to 0.0\n");
    }
  }
    
    public double getBaseSalary(){
        return baseSalary;
    }
    
    
    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();// instance variables of super class should be protected
                                                                       //if it is private, an error occurs
    }
    
    @Override
public String toString()
{
// not allowed: attempts to access private superclass members
return String.format(
"%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
"base-salaried commission employee", getFirstName(), getLastName(),
"social security number", getSocialSecurityNumber(),                                //get methods called in toString so that 
                                                                                    //instance variables should be left as private  
"gross sales", getGrossSales(), "commission rate", getCommissionRate(),
"base salary", getBaseSalary());
}
    
}
