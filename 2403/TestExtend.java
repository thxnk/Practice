public class TestExtend {
    public static void main(String[] args) {
            Contacts contact = new Contacts("Dima","Prokop","Ostrovskoho 11");
            contact.setId(1);
            System.out.println("\n"+contact+"\n");

            President president = new President("Vova", "Zelenský", "Chrešt'atik", "Ukraine", 115, "Ze");
            president.setId(6);
            System.out.println(president);

            Employee employee = new Employee("Gleb","GUsak","Sinna 4", "Intel", "Designer", 543857.4);
            employee.setId(2);
            System.out.println(employee);

    }
}
