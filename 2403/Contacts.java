public class Contacts {

    private int id;
    private String firstName;
    private String lastName;
    private String adress;

    public Contacts(String firstName, String lastName, String adress) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
    }

    public Contacts() {

        this.firstName = "None";
        this.lastName = "None";
        this.adress = "None";
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getAdress() {

        return adress;
    }

    public void setAdress(String adress) {

        this.adress = adress;
    }

    @Override
    public String toString(){
        return "Information: id is: " + id + ", name: "+firstName+", last name: "+lastName+", adress: "+adress;
    }
}