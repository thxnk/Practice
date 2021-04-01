import Classes.ContColl;
import Classes.EmployCont;
import Classes.Presid;
import Classes.PresidColl;

import java.io.IOException;
import java.util.Scanner;


public class TestCollections {
    public static void main(String[] args) throws IOException {

        ContColl cCol = new ContColl();
        EmployCont eCol = new EmployCont();
        PresidColl pCol = new PresidColl();

        Scanner sc = new Scanner(System.in);
        int end = 0;
        int choice;
        int choiceCol;
        while(end == 0) {
            System.out.println("Choose:\n" +
                    "1 - add a col\n" +
                    "2 - sort a col\n" +
                    "3 - display all collections\n" +
                    "0 - end run");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Choice a coll\n" +
                            "1 - Contact\n" +
                            "2 - Employ\n" +
                            "3 - President");
                    choiceCol = sc.nextInt();
                    if(choiceCol == 1){
                        cCol.addC();
                    }
                    else if(choiceCol == 2){
                        eCol.addE();
                    }
                    else if(choiceCol == 3){
                        pCol.addP();
                    }
                    else System.out.println("Wrong enter");
                    break;
                case 2:
                    System.out.println("Choice a coll to sort\n" +
                            "1 - Contact\n" +
                            "2 - Employ\n" +
                            "3 - President");
                    choiceCol = sc.nextInt();
                    if(choiceCol == 1){
                        cCol.sortFirstName();
                        System.out.println(cCol);
                    }
                    else if(choiceCol == 2){
                        eCol.sortAdress();
                        System.out.println(eCol);
                    }
                    else if(choiceCol == 3){
                        pCol.sortLastName();
                        System.out.println(pCol);
                    }
                    else System.out.println("Wrong enter");
                    break;
                case 3:
                    System.out.println(cCol);
                    System.out.println(eCol);
                    System.out.println(pCol);
                break;
                case 0:
                    System.out.println("End");
                    end = 1;
                break;
                default:
                    System.out.println("Wrong enter");
            }
        }
    }
}
