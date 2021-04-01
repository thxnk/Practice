import SerClasses.*;

import java.io.*;
import java.util.Scanner;

public class TestSerColl implements Serializable{
    public static void main(String[] args) throws IOException {

        SContColl cCol = new SContColl();
        SEmployCont eCol = new SEmployCont();
        SPresColl pCol = new SPresColl();

        Scanner sc = new Scanner(System.in);
        int end = 0;
        int choice;
        int choiceCol;
        while(end == 0) {
            System.out.println("Choose:\n" +
                    "1 - add a col\n" +
                    "2 - sort a col\n" +
                    "3 - display all collections\n" +
                    "4 - write to a file\n" +
                    "5 - get from file\n" +
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
                case 4:
                    try {
                        FileOutputStream fos = new FileOutputStream("WriteObject.bin");
                        ObjectOutputStream oos = new ObjectOutputStream(fos);

                        oos.writeObject(cCol);
                        oos.writeObject(eCol);
                        oos.writeObject(pCol);
                        oos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    try {
                        FileInputStream fis = new FileInputStream("WriteObject.bin");
                        ObjectInputStream ois = new ObjectInputStream(fis);

                        SContColl contColl = (SContColl) ois.readObject();
                        SEmployCont employCont1 = (SEmployCont) ois.readObject();
                        SPresColl sPresColl = (SPresColl) ois.readObject();
                        System.out.println(contColl);
                        System.out.println(employCont1);
                        System.out.println(sPresColl);
                        ois.close();
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }
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

