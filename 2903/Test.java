import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CCol ccol = new CCol();
        for(int i = 0; i <= 2; i++)
            ccol.addC();
        ccol.sortFirstName();
        System.out.println(ccol);
        ccol.sortId();
        System.out.println(ccol);
        ccol.sortLastName();
        System.out.println(ccol);
        ccol.sortAdress();
        System.out.println(ccol);
    }
}