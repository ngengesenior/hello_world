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
public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args){
        
        BasePlusCommissionEmployee Emp1 = new BasePlusCommissionEmployee("Jeremy","Diaz","GHQQ4",50000.0,0.09,3000.0);
        
        System.out.println("Emp1  information\n");
        System.out.println(Emp1);
        System.out.printf("Emp1 Salary: %.2f\n",Emp1.earnings());
        
        Emp1.setBaseSalary(4000.0);
        
        System.out.println("\n\nEmp1's salary has been updated to 4000.0");
        
        System.out.println("Updated info");
        
        System.out.println(Emp1);
        System.out.printf("Emp1 Salary: %.2f\n",Emp1.earnings());
        
        
    }
    
   
    
}
