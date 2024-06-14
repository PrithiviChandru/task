package src.main.java.org.task.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Comparable
 * Single sort sequence
 * affect the original class
 * java.lang package
 */
public class ComparableDemo {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User(1, "vijay", 25),
                new User(2, "vicky", 21),
                new User(3, "vishnu", 18),
                new User(4, "mani", 27),
                new User(5, "parveen", 26)
        );

        Collections.sort(users);

        for (User u : users) {
            System.out.println(u);
        }
    }

}

class User implements Comparable<User> {

    int id;
    String name;
    int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + "', age=" + age + '}';
    }

    @Override
    public int compareTo(User o) {
        if (age == o.age) return 0;
        else if (age > o.age) return 1;
        else return -1;
    }

}