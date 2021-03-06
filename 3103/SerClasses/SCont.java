package SerClasses;

import java.io.Serializable;

public class SCont implements Serializable {

        private int id;
        private String firstName;
        private String lastName;
        private String adress;

        public SCont(int id, String firstName, String lastName, String adress) {
            setId(id);
            this.firstName = firstName;
            this.lastName = lastName;
            this.adress = adress;
        }
        public SCont(String firstName, String lastName, String adress) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.adress = adress;
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
        public String toString() {
            return "Інформація про контакт: " +
                    "Id = " + id +
                    ", ім'я = " + firstName +
                    ", фамілія = " + lastName +
                    ", адреса = " + adress;
        }
    }
