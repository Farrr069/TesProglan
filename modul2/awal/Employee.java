package modul2.awal;

public class Employee extends Person implements Employeeinterface {

    public Employee(Employeeinfo employeeinfo){
        super(employeeinfo.employeeName(), employeeinfo.employeeAge(), employeeinfo.salary(), employeeinfo.jobDescription());
    }

    @Override
    public void printEmployeeInfo(){
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Age: " + employeeAge);
        System.out.println("Job Description: " + jobDescription);
    }

    @Override
    public double calculateAnnualSalary(){
        return salary * 12;
    }

    @Override
    public void applyRaise(double raisePercentage){
        salary += (salary * raisePercentage / 100);
    }

}