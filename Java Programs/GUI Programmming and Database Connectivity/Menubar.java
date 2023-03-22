import javax.swing.*;

public class Menubar {
    Menubar()
    {
        JFrame f = new JFrame("Menubar");
        f.setSize(500,800);
        f.setLayout(null);

        JMenuBar mb = new JMenuBar();

        JMenu m = new JMenu("File");

        JMenuItem m1 = new JMenuItem("save");
        JMenuItem m2 = new JMenuItem("exit");
        m.add(m1);
        m.add(m2);
        mb.add(m);
        f.setJMenuBar(mb);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        Menubar mn = new Menubar();
    }

}
