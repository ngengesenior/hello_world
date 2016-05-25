#Implementation of Equivalent python program fro Java how to program
class CommissionEmployee:
    def __init__(self,firstName,lastName,sSN,sales,commRate):
        self.__firstName = firstName
        self.__lastName = lastName
        self.__socialSecurityNumber = sSN
        self.__grossSales = sales
        self.__commissionRate = commRate
    def setFirstName(self,name):
        self.__firstName = name

    def setLastName(self, name):
        self.__lastName = name

    def socialSecurityNumber(self,ssn):
        self.__socialSecurityNumber = ssn

    def setCommissionRate(self,rate):
        if rate >= 0 and rate < 1:
            self.__commissionRate = rate
        else:
            print("Commission Rate cannot be < 0 or >=1")
            print("Setting commission rate to 0")
            self.__commissionRate = 0

    def setGrossSales(self, sales):
        if sales >= 0:
            self.__grossPay = sales
        else:
            print("Gross Sales must be >= 0")
            print("So I will set Sales to 0")
            self.__grossSales = 0.0

    def getGrossSales(self):
        return  self.__grossSales

    def getFirstName(self):
        return  self.__firstName

    def getLastName(self):
        return self.__lastName

    def getSocialSecurityNumber(self):
        return self.__socialSecurityNumber

    def getCommissionRate(self):
        return self.__commissionRate

    def getPay(self):
        return self.getCommissionRate() * self.getGrossSales()

    def About(self):
        return "Name: %s  %s\nCommission Rate: %.2f\nGross Sales: FCFA %.2f\nPay : FCFA %.2f" %(
            self.getFirstName(),self.getLastName(),self.getCommissionRate(),self.getGrossSales(),self.getPay()
        )


class CommissionPlusBaseEmployee(CommissionEmployee):  # Base Class of CommissionEmployee  class
    def __init__(self,firstName,lastName,sSN,sales,commRate,baseSalary):
        CommissionEmployee.__init__(self,firstName,lastName,sSN,sales,commRate,)

        self.__baseSalary = baseSalary

    def setBaseSalary(self,baseSalary):       # Function to set Base salary
        self.__baseSalary = baseSalary

    def getBaseSalary(self):
        return self.__baseSalary

    def getPayment(self):
        return  self.getCommissionRate() * self.getGrossSales() + self.getBaseSalary()

    def info(self):
        return "Name: %s  %s\nCommission Rate: %.2f\nGross Sales: FCFA %.2f\nPay : FCFA %.2f" %(
            self.getFirstName(), self.getLastName(), self.getCommissionRate(), self.getGrossSales(), self.getPay()
        )


def main():
    print("Testing CommissionEmployee class")
    print("Two  CommissionEmployees created below and displayed\n")
    comEmp1 = CommissionEmployee("Ngenge","Senior","SC14B373",50000.00,0.20)
    comEmp2 = CommissionEmployee("Molinge","Junior","SC14A750",40000.00,0.25)
    print(comEmp1.About())
    print()
    print(comEmp2.About())
    print("\n\n")

    print("Two commissionPlusBase Employees are created below and displayed\n")

    base1 = CommissionPlusBaseEmployee("Ngala","Dirane","SC14A22",50000.00,0.20,2000.00)
    base2 = CommissionPlusBaseEmployee("Ngala","Christabel","SC14A99",60000.00,0.30,2000.00)
    print(base1.info())
    print()
    print(base2.info())
    print("\nThus Inheritance verified")
main()
