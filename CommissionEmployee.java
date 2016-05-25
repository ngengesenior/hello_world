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
public class CommissionEmployee {
    
    private final String firstName;
    private final  String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;
    
    public CommissionEmployee(String firstName,String lastName,String socialSecurityNumber,
            double grossSales,double commissionRate){
        if(grossSales >= 0.0)
            this.grossSales = grossSales;
        else{
            System.out.println("Gross Sales must be >= 0.0");
            System.out.println("Setting gross Sales to 0.0");
        }
        
        if(commissionRate >= 0.0)
             this.commissionRate =  commissionRate;
         else
        {
            System.out.println("Commission rate Sales must be >= 0.0");
            System.out.println("Setting commission rate to to 0.0");
        }
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
       
        
    }
    
    
    
    public String getFirstName(){
        return this.firstName;
    }
    
    
    
    public String getLastName(){
        return this.lastName;
    }
    
    
    
    public String getSocialSecurityNumber(){
        return this.socialSecurityNumber;
    }
    
    public void setGrossSales(double grossSales){
        if(grossSales >= 0.0)
            this.grossSales = grossSales;
        else{
            System.out.println("Gross Sales must be >= 0.0");
            System.out.println("Setting gross Sales to 0.0");
        }
    }
    
    
    
    public void setCommissionRate(double commissionRate){
        if(commissionRate > 0.0 && commissionRate < 1.0)
                this.commissionRate =  commissionRate;
        else
        {
            System.out.println("Commission rate Sales must be >= 0.0");
            System.out.println("Setting commission rate to to 0.0");
        }
    }
    
    
    
    public double getGrossSales(){
        return this.grossSales;
    }
    public double getCommissionRate(){
        return this.commissionRate;
    }
    
    public double earnings()
{
        return getCommissionRate() * getGrossSales();
}
    
    @Override
    public String toString()
{
    return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
    "commission employee", firstName, lastName,
    "social security number", socialSecurityNumber,"gross sales", grossSales,
    "commission rate", commissionRate);
}
    
}
