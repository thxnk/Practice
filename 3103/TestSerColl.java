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
            System.out.println("Введіть цифру:\n" +
                    "1 - додати до колекції\n" +
                    "2 - сортурувати колекцію\n" +
                    "3 - вивести колекції на екран\n" +
                    "4 - записати до файлу\n" +
                    "5 - дістати з файлу\n" +
                    "0 - вихід з програми");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Виберіть колекцію\n" +
                            "1 - Контакти\n" +
                            "2 - Робітники\n" +
                            "3 - Президенти");
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
                    System.out.println("Виберіть колекцію для відсортування\n" +
                            "1 - Контакти\n" +
                            "2 - Робітники\n" +
                            "3 - Президенти");
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

                        cCol = (SContColl) ois.readObject();
                        eCol = (SEmployCont) ois.readObject();
                        pCol = (SPresColl) ois.readObject();
                        ois.close();
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 0:
                    System.out.println("Вихожу....");
                    end = 1;
                    break;
                default:
                    System.out.println("Wrong enter");
            }
        }
    }
}

