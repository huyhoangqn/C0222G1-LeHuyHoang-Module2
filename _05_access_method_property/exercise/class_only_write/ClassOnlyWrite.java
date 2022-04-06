package _05_access_method_property.exercise.class_only_write;

public class ClassOnlyWrite {
    private String name = "John";
    private String classes = "CO2";

    public ClassOnlyWrite() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void disPlay() {
        System.out.println("Name: " + this.name + "\t" + "Classes: " + this.classes);
    }


}
