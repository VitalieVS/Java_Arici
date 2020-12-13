import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
    }
}
