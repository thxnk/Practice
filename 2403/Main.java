import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SomeThing");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        JLabel label = new JLabel("Test");
        frame.add(label);
    }
}
