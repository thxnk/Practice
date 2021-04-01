package Classes;

import SortingClasses.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ContColl {
        private ArrayList<Cont> cCol = new ArrayList<>();

        public void addC(){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter id, firstname, lastname, address");
            Cont contact = new Cont(Integer.parseInt(scanner.nextLine()),
                    scanner.nextLine(),
                    scanner.nextLine(),
                    scanner.nextLine());

            cCol.add(contact);
        }

        public void sortFirstName(){
            Collections.sort(cCol, new SortName());
        }

        public void sortId(){
            Collections.sort(cCol,new Sortid());
        }

        @Override
        public String toString() {
            String text = new String("Contact collection :\n");
            for(Cont cnt : cCol){
                text+=cnt.toString()+"\n";
            }
            return text;
        }

        public ArrayList<Cont> getCCol() {
            return cCol;
        }
    }
