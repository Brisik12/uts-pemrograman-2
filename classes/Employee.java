package classes;

public class Employee {
    
    String name;
    int age;
    String designation;
    double salary;
 
    // This is the constructor of the class Employee
    public Employee(String name) {
       this.name = name;
    }
 
    // Assign the age of the Employee  to the variable age.
    public void setAge(int empAge) {
       age = empAge;
    }
 
    /* Assign the designation to the variable designation.*/
    public void setDesignation(String empDesign) {
       designation = empDesign;
    }
 
    /* Assign the salary to the variable	salary.*/
    public void setSalary(double empSalary) {
       salary = empSalary;
    }
 
    /* Print the Employee details */
    public void printEmployee() {
       System.out.println("=====================================");
       System.out.println("Name:"+ name );
       System.out.println("Age:" + age );
       System.out.println("Designation:" + designation );
       System.out.println("Salary:" + salary);
       System.out.println("=====================================");
    }
}
