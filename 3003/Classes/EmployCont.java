package Classes;

import SortingClasses.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployCont {
    private ArrayList<Employ> eCol = new ArrayList<>();

    public void addE(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter firstname, lastname, address, company, position, salary");
        Employ employer = new Employ(scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine(),
                Double.parseDouble(scanner.nextLine()));

        eCol.add(employer);
    }

    public void sortAdress(){
        Collections.sort(eCol,new SortAdres());
    }

    @Override
    public String toString() {
        String text = new String("Employer collection :\n");
        for(Employ cnt : eCol){
            text+=cnt.toString()+"\n";
        }
        return text;
    }

    public ArrayList<Employ> getECol() {
        return eCol;
    }
}
