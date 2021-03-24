public class President extends Contacts{

    private String country;
    private int daysOfBeingInRule;
    private String nameOfParty;

    public President(String firstName, String lastName, String adress, String country, int daysOfBeingInRule, String nameOfParty) {
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
        return super.toString()+", country: "+country+", days of presidenting: "+daysOfBeingInRule+", name of his Party: "+nameOfParty;
    }
}
