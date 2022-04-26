package models;

public class Employee extends PersonFurama {
    private String employeeCode;
    private String level;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String employeeCode, String trinhDo, String viTri, double luong) {
        this.employeeCode = employeeCode;
        this.level = trinhDo;
        this.position = viTri;
        this.salary = luong;
    }

    public Employee(String employeeCode, String name, String birthDay, String gender, String cmnd,
                    String phone, String email, String trinhDo, String viTri, double luong) {
        super(employeeCode, name, birthDay, gender, cmnd, phone, email);
        this.employeeCode = employeeCode;
        this.level = trinhDo;
        this.position = viTri;
        this.salary = luong;
    }


    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + this.employeeCode + "," + this.level + "," + this.position + "," + this.salary;
    }
}
