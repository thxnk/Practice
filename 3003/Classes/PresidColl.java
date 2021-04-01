package Classes;

import SortingClasses.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PresidColl {
    private ArrayList<Presid> pCol = new ArrayList<>();

    public void addP(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter firstname, lastname, address, country, days, party");
        Presid presidents = new Presid(scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine(),
                Integer.parseInt(scanner.nextLine()),
                scanner.nextLine());

        pCol.add(presidents);
    }

    public void sortLastName(){
        Collections.sort(pCol, new SortLast());
    }

    @Override
    public String toString() {
        String text = new String("President collection :\n");
        for(Presid cnt : pCol){
            text+=cnt.toString()+"\n";
        }
        return text;
    }

    public ArrayList<Presid> getECol() {
        return pCol;
    }
}

