package chapter9;

public class Employee extends Person {

    private String employeeId;
    private String employeeTitle;

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeTitle(String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeTitle() {
        return employeeTitle;
    }

        public Employee () {
            System.out.println("I am the default constructor for Employee");
        }
}
