package SerClasses;

import java.io.Serializable;

public class SEmploy extends SCont implements Serializable {
        private String company;
        private String position;
        private double salary;

        public SEmploy(String firstName, String lastName, String adress, String company, String position, double salary) {
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
        public String getAdress() {
            return super.getAdress();
        }

        @Override
        public String toString() {
            return "Інформація про робітника: " +
                    "компанія = " + company +
                    ", позиція = " + position  +
                    ", заробітна плата = " + salary +
                    ", Id = " + super.getId() +
                    ", ім'я = " + super.getFirstName() +
                    ", фамілія = " + super.getLastName() +
                    ", адреса = " + super.getAdress();
        }
    }

