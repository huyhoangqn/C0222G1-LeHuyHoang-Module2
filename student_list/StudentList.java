package test.student_list;

public class StudentList {

    private String name;
    private int age;
    private String address;
    private double mark;
    public static int count;

    public StudentList(String name, int age, String address, double mark) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mark = mark;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + " \t Age: " + this.getAge() + "" +
                " \t Address: " + this.getAddress() + "\t Mark: " + this.getMark() +
                " \n";

    }
}
