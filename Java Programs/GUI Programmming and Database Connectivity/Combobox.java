import javax.swing.*;

public class Combobox {
    Combobox()
    {
        JFrame f= new JFrame();
        f.setSize(500,600);
        f.setLayout(null);
        String list[] = {"India","Asia"};
        JComboBox b = new JComboBox(list);
        b.setBounds(30,30,100,40);
        f.add(b);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Combobox c = new Combobox();
    }
}
