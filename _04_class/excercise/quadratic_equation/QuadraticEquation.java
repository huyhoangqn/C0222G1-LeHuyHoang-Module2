package _04_class.excercise.quadratic_equation;

public class QuadraticEquation {
    private double para1;
    private double para2;
    private double para3;


    public QuadraticEquation(double para1, double para2, double para3) {
        this.para1 = para1;
        this.para2 = para2;
        this.para3 = para3;
    }

    public double getPara1() {
        return this.para1;
    }

    public double getPara2() {
        return this.para2;
    }

    public double getPara3() {
        return this.para3;
    }

    public double getDiscriminant() {
        return Math.pow(para2, 2) - (4 * para1 * para3);
    }

    public double getRoot1() {
        return (-para2 + Math.pow((Math.pow(para2, 2) - 4 * para1 * para3), 0.5)) / (2 * para1);
    }

    public double getRoot2() {
        return (-para2 - Math.pow((Math.pow(para2, 2) - 4 * para1 * para3), 0.5)) / (2 * para1);
    }

    public double getRoot3() {
        return -para2 / (2 * para1);
    }

}
