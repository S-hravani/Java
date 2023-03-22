import javax.swing.*;
import java.awt.*;

public class Panel {
    Panel()
    {
        JFrame f = new JFrame();
        f.setSize(500,600);;
        f.setLayout(null);
        JPanel p = new JPanel();
        p.setBounds(50,50,300,300);
        p.setBackground(Color.GRAY);
        JButton b = new JButton("Submit");
        b.setBounds(60,60,50,30);
        p.add(b);
        f.add(p);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Panel p1 = new Panel();
    }

}
