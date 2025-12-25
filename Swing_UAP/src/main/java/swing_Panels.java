import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class swing_Panels extends JFrame {
    private JPanel mainPanel;
    private JPanel panel1;
    private JPanel panel2;
    private JTextField textField;
    private JLabel replicatorLabel;

    public swing_Panels(){

        inicializingForm();
//        textField.addActionListener(e -> {
//            replicateText();
//        });
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                replicateText();
            }
        });
    }

    private void inicializingForm(){
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
    }

    private void replicateText(){
        this.replicatorLabel.setText(this.textField.getText());
    }

    public static void main(String[] args) {

        FlatDarculaLaf.setup();
        swing_Panels swing_panels = new swing_Panels();
        swing_panels.setVisible(true);
    }
}

