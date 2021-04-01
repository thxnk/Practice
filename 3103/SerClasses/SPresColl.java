package SerClasses;

import Classes.Presid;
import SerSortingClasses.SSortLast;
import SortingClasses.SortLast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SPresColl implements Serializable {
        private ArrayList<SPresid> pCol = new ArrayList<>();

        public void addP(){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter firstname, lastname, address, country, days, party");
            SPresid presidents = new SPresid(scanner.nextLine(),
                    scanner.nextLine(),
                    scanner.nextLine(),
                    scanner.nextLine(),
                    Integer.parseInt(scanner.nextLine()),
                    scanner.nextLine());

            pCol.add(presidents);
        }

        public void sortLastName(){
            Collections.sort(pCol, new SSortLast());
        }

        @Override
        public String toString() {
            String text = new String("President collection :\n");
            for(SPresid cnt : pCol){
                text+=cnt.toString()+"\n";
            }
            return text;
        }

        public ArrayList<SPresid> getECol() {
            return pCol;
        }
    }



