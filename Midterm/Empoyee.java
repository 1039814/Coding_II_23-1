package Midterm;

public class Empoyee {
    private int employee_id;
    private String employee_name; 
    private int employee_salary;
    private String formated_employee_name;
    public Empoyee(int employee_id, String employee_name, int employee_salary) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
    }
    public int getEmployee_id() {
        return employee_id;
    }
    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }
    public String getEmployee_name() {
        formated_employee_name = "\b"+employee_name.substring(employee_name.indexOf(" "),employee_name.length()) +", " + employee_name.substring(0, employee_name.indexOf(" "));
        return formated_employee_name;
    }
    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }
    public int getEmployee_salary() {
        return employee_salary;
    }
    
}
