import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("work");

        //frame
        JFrame frame = new JFrame("Hello"); // create frame / w title
        frame.setSize(new Dimension(200,200)); // set size
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //Hide_on close
        //do nothing
        //exit on close
        frame.setResizable(false); // resizible
        //icon
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("calendar.png"); //not work, path is correct
        frame.setIconImage(image.getImage());

         // make visible
    }
}
