package src.main.java.org.task.concept;

import java.io.*;

public class SerializableDemo {

    public static void main(String[] args) {
        Account account = new Account("prithvi", "welcome");
//        Account account = new Account("vijay", "1234");

        try (FileOutputStream fos = new FileOutputStream("account.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(account);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("account.ser");
             ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            Account ac = (Account) ois.readObject();
            System.out.println(ac);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    private String user;

    /*Preserve from Serialization By transient keyword*/
    private transient String password;

    public Account(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{user = " + user + ", password = " + password + "}";
    }

    /*Custom Serialization*/
    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(password);
    }

    /*Custom De-Serialization*/
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        this.password = (String) ois.readObject();
    }

}