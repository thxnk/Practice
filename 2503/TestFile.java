import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: name, lastName, adress, and id");
        BContacts contacts = new BContacts(sc.nextLine(),sc.nextLine(),sc.nextLine());
        contacts.setId(Integer.parseInt(sc.nextLine()));
        System.out.println(contacts);

        System.out.println("Enter: id, name of order, courier's name, date and type");
        Orders order = new Orders(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
        order.setDateTime(sc.nextLine());
        order.setType(Integer.parseInt(sc.nextLine()));
        System.out.println(order);

        System.out.println("Enter: id, familie, name, group and department, disciplin, mark and teacher name");
        Student student = new Student(Integer.parseInt(sc.nextLine()),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        student.setDiscipline(sc.nextLine());
        student.setMark(Double.parseDouble(sc.nextLine()));
        student.setTeacherName(sc.nextLine());
        System.out.println(student);
        sc.close();

        try {
            FileOutputStream fos = new FileOutputStream("WriteObject.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(contacts);
            oos.writeObject(order);
            oos.writeObject(student);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
