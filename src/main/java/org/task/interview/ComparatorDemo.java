package src.main.java.org.task.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Comparator
 * Multiple sorting sequence
 * doesn't affect the original class
 * java.util package
 */
public class ComparatorDemo {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(102, "vijay", 25),
                new Student(142, "mani", 21),
                new Student(132, "swetha", 15),
                new Student(109, "arul", 29),
                new Student(122, "renu", 11)
        );

        Collections.sort(students, new NameComparator());
        System.out.println("=============== NAME COMPARATOR =============== ");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();

        Collections.sort(students, new AgeComparator());
        System.out.println("=============== AGE COMPARATOR =============== ");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();


    }

}

class Student {

    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + "', age=" + age + '}';
    }
}

class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }

}

class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.age == o2.age) return 0;
        else if (o1.age > o2.age) return 1;
        else return -1;
    }

}