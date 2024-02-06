import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFirstGUI {
    private JButton szamolj;
    private JPanel cim;
    private JTextField textField1;
    private JCheckBox elfogadomAFeltételeketCheckBox;
    private JLabel Jlabel2;

    public MyFirstGUI() {
        szamolj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(textField1.getText());
                double b = 3 * a;

                if (elfogadomAFeltételeketCheckBox.isSelected()) {
                    szamolj.setEnabled(true);
                }else{
                    szamolj.setEnabled(false);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyFirstGUI");
        frame.setContentPane(new MyFirstGUI().cim);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
