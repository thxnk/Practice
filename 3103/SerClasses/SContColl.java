package SerClasses;

import SerSortingClasses.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SContColl implements Serializable {
        private ArrayList<SCont> cCol = new ArrayList<>();

        public void addC(){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введіть id, ім'я, прізвище, адресу");
            SCont contact = new SCont(Integer.parseInt(scanner.nextLine()),
                    scanner.nextLine(),
                    scanner.nextLine(),
                    scanner.nextLine());

            cCol.add(contact);
        }

        public void sortFirstName(){
            Collections.sort(cCol, new SSortName());
        }

        public void sortId(){
            Collections.sort(cCol,new SSortId());
        }

        @Override
        public String toString() {
            String text = new String("Колекція контактів:\n");
            for(SCont cnt : cCol){
                text+=cnt.toString()+"\n";
            }
            return text;
        }

        public ArrayList<SCont> getCCol() {
            return cCol;
        }
    }

