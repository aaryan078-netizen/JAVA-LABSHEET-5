public class PharmacyEmployeeMain {
    public static void main(String[] args) {
        Employee[] employees={new Pharmacist(1,"Riya",35000,"PH-101"),new StoreManager(2,"Kunal",52000,3)};
        PharmacyEmployeeManager manager=new PharmacyEmployeeManager(); manager.displayEmployees(employees); System.out.println("Employee count: "+Employee.employeeCount);
    }
}
class Employee {
    private int employeeId; private String employeeName; private double salary; static int employeeCount=0; // Shared class variable
    protected String status="Active"; // Protected member available to child classes
    String department="Pharmacy"; // Default/package-private member
    Employee(int employeeId,String employeeName,double salary){this.employeeId=employeeId;this.employeeName=employeeName;setSalary(salary);employeeCount++;}
    public int getEmployeeId(){return employeeId;} public String getEmployeeName(){return employeeName;} public double getSalary(){return salary;}
    public void setEmployeeId(int employeeId){this.employeeId=employeeId;} public void setEmployeeName(String employeeName){this.employeeName=employeeName;} public void setSalary(double salary){if(salary>=0)this.salary=salary;else System.out.println("Negative salary rejected");}
    void displayEmployee(){System.out.println(employeeId+" | "+employeeName+" | ₹"+salary+" | "+status+" | "+department);}
}
class Pharmacist extends Employee { private String licenseNo; Pharmacist(int employeeId,String employeeName,double salary,String licenseNo){super(employeeId,employeeName,salary);this.licenseNo=licenseNo;} void displayRole(){displayEmployee();System.out.println("Role: Pharmacist, license: "+licenseNo);} }
class StoreManager extends Employee { private int storeSection; StoreManager(int employeeId,String employeeName,double salary,int storeSection){super(employeeId,employeeName,salary);this.storeSection=storeSection;} void displayRole(){displayEmployee();System.out.println("Role: Store Manager, section: "+storeSection);} }
class PharmacyEmployeeManager { void displayEmployees(Employee[] employees){double totalSalary=0;int count=0;for(Employee e:employees){if(e.getSalary()>=0){if(e instanceof Pharmacist)((Pharmacist)e).displayRole();else if(e instanceof StoreManager)((StoreManager)e).displayRole();totalSalary+=e.getSalary();count++;}}System.out.println("Processed: "+count+", total salary: ₹"+totalSalary);} }
