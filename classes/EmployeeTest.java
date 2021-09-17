package classes;

public class EmployeeTest {
    public static void main(String args[]) {
        /* Create two objects using constructor */
        Employee emp1 = new Employee("James Smith");
        Employee emp2 = new Employee("Mary Anne");
  
        // Invoking methods for each object created
        emp1.setAge(26);
        emp1.setDesignation("Senior Software Engineer");
        emp1.setSalary(1000);
        emp1.printEmployee();

        emp2.setAge(21);
        emp2.setDesignation("Associate Software Engineer");
        emp2.setSalary(500);
        emp2.printEmployee();
     }
}
