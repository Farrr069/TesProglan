package modul2.Tugas3;

//"that day, if our positions were switched... would our fate be different?"
public class Employee extends Person implements Employeeinterface {

    public Employee(Employeeinfo employeeinfo){
        super(employeeinfo.empName(), employeeinfo.age(), employeeinfo.empSalary(), employeeinfo.jobDescription());
    }

    @Override
    public void printEmployeeInfo(){
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Age: " + employeeAge);
        System.out.println("salary: $" + salary);
        System.out.println("Job Description: " + jobDescription);
    }

    @Override
    public double calculateAnnualSalary(){
        return salary * 12;
    }

    @Override
    public void applyRaise(double raisePercentage){
        salary += (salary * raisePercentage /100);
}

}