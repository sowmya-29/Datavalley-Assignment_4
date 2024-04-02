import java.util.*;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;
    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDesignation() {
        return designation;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return  "Employee ID : "+id+", "+"NAME : "+name+ ", "+"DESIGNATION : "+ designation+ ", "+"SALARY : "+salary;
            }
}
public class SortLL {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(2000, "Ramya", "Doctor", 80000));
        employees.add(new Employee(2001, "Tejaswi", "Creator", 53000));
        employees.add(new Employee(2002, "Srinija", "Influencer",100000));
        employees.add(new Employee(2003, "Vasavi", "Teacher", 55000));
        Collections.sort(employees, Comparator.comparing(Employee::getName));
        System.out.println("Sort by Name:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        Collections.sort(employees, Comparator.comparing(Employee::getSalary));
        System.out.println("\nSort by Salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
