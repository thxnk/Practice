public class TestClasses {
    public static void main(String[] args) {
        BookOfContacts book = new BookOfContacts("Dima","Prokop","Pushkina 13");
        book.setId(1);
        System.out.println("\n"+book+"\n");


        Order order = new Order(1,"Pizza","Petrenko");
        order.setDateTime("23.03.2021, 12:30");
        order.setType(2);
        System.out.println(order+"\n");

        Students students = new Students(123124,"Grudin", "Sergiy", "34", "121");
        students.setDiscipline("OOP");
        students.setMark(4.92);
        students.setTeacherName("Babich");
        System.out.println(students);
    }
}

