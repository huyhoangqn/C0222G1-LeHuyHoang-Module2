package _11_stack_queue.demerging_using_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MainApplication {
    private static ArrayList createNewList(Queue<Person> maleQueue, Queue<Person> femaleQueue) {
        ArrayList newListPerson = new ArrayList();
        for (Person p : femaleQueue) {
            newListPerson.add(p);
        }
        for (Person p : maleQueue) {
            newListPerson.add(p);
        }
        return newListPerson;
    }

    private static void processOldList(Queue<Person> maleQueue, Queue<Person> femaleQueue, ArrayList listPerson) {
        for (int i = 0; i < listPerson.size(); i++) {
            Person holder = (Person) listPerson.get(i);
            if (holder.getGender().equals("male")) {
                maleQueue.add(holder);
            } else femaleQueue.add(holder);
        }
    }

    private static void showList(ArrayList listPerson) {
        System.out.println("===LIST===");
        System.out.printf("%-20s%-7s%-5S\n", "Name", "Gender", "DOB");
        for (int i = 0; i < listPerson.size(); i++) {
            Person holder = (Person) listPerson.get(i);
            holder.display();
        }
    }

    private static ArrayList inputData() {
        Person p1 = new Person("LeLai", "male", "1551");
        Person p2 = new Person("TrungNhi", "female", "1625");
        Person p3 = new Person("TonDucThang", "male", "132");
        Person p4 = new Person("ThiNo", "female", "1545");
        Person p5 = new Person("TaTo", "male", "1325");
        ArrayList listPerson = new ArrayList();

        listPerson.add(p1);
        listPerson.add(p2);
        listPerson.add(p3);
        listPerson.add(p4);
        listPerson.add(p5);
        return listPerson;
    }
    public static void main(String[] args) {
        Queue<Person> maleQueue = new LinkedList<>();
        Queue<Person> femaleQueue = new LinkedList<>();
        ArrayList listPerson = inputData();
        showList(listPerson);
        processOldList(maleQueue, femaleQueue, listPerson);
        ArrayList newListPerson = createNewList(maleQueue, femaleQueue);
        showList(newListPerson);
    }
}
