package SerClasses;


import java.io.Serializable;

public class SPresid extends SCont implements Serializable {
        private String country;
        private int daysOfBeingInRule;
        private String nameOfParty;

        public SPresid(String firstName, String lastName, String adress, String country, int daysOfBeingInRule, String nameOfParty) {
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

        public String getLastName(){
            return super.getLastName();
        }

        @Override
        public String toString() {
            return "Інформація про президента: " +
                    "країна = " + country +
                    ", дні при владі = " + daysOfBeingInRule +
                    ", партія = " + nameOfParty +
                    ", Id = " + super.getId() +
                    ", ім'я = " + super.getFirstName() +
                    ", фамілія = " + super.getLastName() +
                    ", адреса = " + super.getAdress();
        }
    }


