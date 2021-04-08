package SerClasses;

import SerSortingClasses.SSortAdress;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SEmployCont implements Serializable {
        private ArrayList<SEmploy> eCol = new ArrayList<>();

        public void addE(){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введіть ім'я, призвище, адресу, компанію, позицію, заробітну плату");
            SEmploy employer = new SEmploy(scanner.nextLine(),
                    scanner.nextLine(),
                    scanner.nextLine(),
                    scanner.nextLine(),
                    scanner.nextLine(),
                    Double.parseDouble(scanner.nextLine()));

            eCol.add(employer);
        }

        public void sortAdress(){
            Collections.sort(eCol,new SSortAdress());
        }

        @Override
        public String toString() {
            String text = new String("Колекція робітників:\n");
            for(SEmploy cnt : eCol){
                text+=cnt.toString()+"\n";
            }
            return text;
        }

        public ArrayList<SEmploy> getECol() {
            return eCol;
        }
    }


