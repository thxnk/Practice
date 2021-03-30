import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CCol {
    private ArrayList<CollContact> cCol = new ArrayList<CollContact>();

    public void addC(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter id, firstname, lastname, address");
        CollContact contact = new CollContact(Integer.parseInt(scanner.nextLine()),
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine());

        cCol.add(contact);
    }

    public void sortFirstName(){
        Collections.sort(cCol, new SortFirstName());
    }

    public void sortId(){
        Collections.sort(cCol,new SortId());
    }

    public void sortLastName(){
        Collections.sort(cCol,new SortLastName());
    }

    public void sortAdress(){
        Collections.sort(cCol,new SortAdress());
    }
    @Override
    public String toString() {
        String text = new String("Contact collection :\n");
        for(CollContact cnt : cCol){
            text+=cnt.toString()+"\n";
        }
        return text;
    }

    public ArrayList<CollContact> getCCol() {
        return cCol;
    }
}
