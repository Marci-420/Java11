import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class sudoku_GUI {
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JButton ellenőrzésButton;
    private JTextField textField3;
    private JTextField textField2;

    public sudoku_GUI() {
        ellenőrzésButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        button1.addKeyListener(new KeyAdapter() {
        });
    }


}

