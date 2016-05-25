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
public class CommissionEmployeeTest {
    public static void main(String[] args){
        CommissionEmployee Emp1 = new CommissionEmployee("Ngenge","Senior","SC14B373",50000.0,0.3);
        
        CommissionEmployee Emp2 = new CommissionEmployee("Molinge","Junior","SC14A750",30000.0,0.3);
        
        
        
        System.out.println("Printing info for Emp1\n");
        
        System.out.println(Emp1.toString());
        System.out.printf("Emp1's earnings: %.2f\n\n",Emp1.earnings());
        
        
        System.out.println("Printing info for Emp2\n");
        
        System.out.println(Emp2.toString());
        System.out.printf("Emp2's earnings: %.2f\n\n",Emp2.earnings());
        
        System.out.println("Test when wrong input is gotten for grossSales and commissionRate\n");
        
        CommissionEmployee Emp3 = new CommissionEmployee("James","Johnson","SC14A332",-30000.0,-0.3);
        System.out.println("Printing info for Emp3\n");
        
        System.out.println(Emp3.toString());
        System.out.printf("Emp3's earnings: %.2f\n\n",Emp3.earnings());
        
        
        
        
    }
    
}
