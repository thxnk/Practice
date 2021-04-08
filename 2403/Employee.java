public class Employee extends Contacts {
    private String company;
    private String position;
    private double salary;

    public Employee(String firstName, String lastName, String adress, String company, String position, double salary) {
        super(firstName, lastName, adress);
        this.company = company;
        this.position = position;
        this.salary = salary;
    }

    public String getCompany() {

        return company;
    }

    public void setCompany(String company) {

        this.company = company;
    }

    public String getPosition() {

        return position;
    }

    public void setPosition(String position) {

        this.position = position;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+", company: "+company+", position: "+position+", salary: "+salary+"$";
    }
}
