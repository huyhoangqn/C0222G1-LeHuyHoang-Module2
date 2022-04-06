package test.test_student;

import java.util.Arrays;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentList[] students = new StudentList[4];
        students[0] = new StudentList("John", 30, "Paris", 95);
        students[1] = new StudentList("Nick", 35, "Italy", 99);
        System.out.println(Arrays.toString(students));

        for (int i = 2; i < students.length; i++) {
            if (students[i] == null) {
                System.out.println("Name of student number " + (i + 1) + " ");
                String name = input.nextLine();

                System.out.println("Age: ");
                int age = Integer.parseInt(input.nextLine());

                System.out.println("Address: ");
                String address = input.nextLine();

                System.out.println("Mark: ");
                int mark = Integer.parseInt(input.nextLine());

                students[i] = new StudentList(name, age, address, mark);

            }
        }
        System.out.println(Arrays.toString(students));
        int n;
        do {
            System.out.println("Enter index you want to remove:");
            n = input.nextInt();
        } while (n > students.length || n < 0);
        students[n] = null;
        for (StudentList student : students) {
            if (student == null) {
                continue;
            }
            System.out.println(student.toString());
        }

    }
}
