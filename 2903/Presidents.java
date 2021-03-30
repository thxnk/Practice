public class Presidents extends CollContact{

    private String country;
    private int daysOfBeingInRule;
    private String nameOfParty;

    public Presidents(String firstName, String lastName, String adress, String country, int daysOfBeingInRule, String nameOfParty) {
        super(firstName, lastName, adress);
        this.country = country;
        this.daysOfBeingInRule = daysOfBeingInRule;
        this.nameOfParty = nameOfParty;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDaysOfBeingInRule() {
        return daysOfBeingInRule;
    }

    public void setDaysOfBeingInRule(int daysOfBeingInRule) {
        this.daysOfBeingInRule = daysOfBeingInRule;
    }

    public String getNameOfParty() {
        return nameOfParty;
    }

    public void setNameOfParty(String nameOfParty) {
        this.nameOfParty = nameOfParty;
    }

    @Override
    public String toString() {
        return "Presidents " +
                "country='" + country + '\'' +
                ", daysOfBeingInRule=" + daysOfBeingInRule +
                ", nameOfParty='" + nameOfParty + '\''
                +" " + super.toString();
    }
}
