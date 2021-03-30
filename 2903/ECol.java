import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ECol {
    private ArrayList<Employer> eCol = new ArrayList<Employer>();

    public void addE(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter firstname, lastname, address, company, position, salary");
        Employer employer = new Employer(scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine(),
                Double.parseDouble(scanner.nextLine()));

        eCol.add(employer);
    }

    public void sortFirstName(){
        Collections.sort(eCol, new SortFirstName());
    }

    public void sortId(){
        Collections.sort(eCol,new SortId());
    }

    @Override
    public String toString() {
        String text = new String("Employer collection :\n");
        for(CollContact cnt : eCol){
            text+=cnt.toString()+"\n";
        }
        return text;
    }

    public ArrayList<Employer> getECol() {
        return eCol;
    }
}
