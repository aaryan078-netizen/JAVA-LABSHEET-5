public class PrivateAccessMain {
    public static void main(String[] args) { Employee e=new Employee(501,"Meera",45000); System.out.println(e.getEmployeeId()); System.out.println(e.getEmployeeName()); System.out.println(e.getSalary()); e.displayEmployee();
        // System.out.println(e.salary); // Not allowed: salary is private.
    }
}
class Employee { private int employeeId; private String employeeName; private double salary; Employee(int employeeId,String employeeName,double salary){this.employeeId=employeeId;this.employeeName=employeeName;this.salary=salary;} public int getEmployeeId(){return employeeId;} public String getEmployeeName(){return employeeName;} public double getSalary(){return salary;} public void displayEmployee(){System.out.println(employeeId+" | "+employeeName+" | ₹"+salary);} }
