import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PCol {
    private ArrayList<Presidents> pCol = new ArrayList<Presidents>();

    public void addP(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter firstname, lastname, address, country, days, party");
        Presidents presidents = new Presidents(scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine(),
                Integer.parseInt(scanner.nextLine()),
                scanner.nextLine());

        pCol.add(presidents);
    }

    public void sortFirstName(){
        Collections.sort(pCol, new SortFirstName());
    }

    public void sortId(){
        Collections.sort(pCol,new SortId());
    }

    @Override
    public String toString() {
        String text = new String("Employer collection :\n");
        for(CollContact cnt : pCol){
            text+=cnt.toString()+"\n";
        }
        return text;
    }

    public ArrayList<Presidents> getECol() {
        return pCol;
    }
}
