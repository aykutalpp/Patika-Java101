package week2.Homework;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aykut",9000,45,2010);

        e1.tax();
        e1.bonus();
        e1.raiseSalary();
        e1.printEmployee();
    }
}
