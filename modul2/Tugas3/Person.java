package modul2.Tugas3;

public class Person {
    protected String employeeName;
    protected int employeeAge;
    protected double salary;
    protected String jobDescription;

    public Person(String empName, int age, double empSalary, String jobDescription) {
        employeeName = empName;
        employeeAge = age;
        salary = empSalary;
        this.jobDescription = jobDescription;
    }
}
