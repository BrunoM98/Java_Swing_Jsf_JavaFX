import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;

public class LogForm extends JFrame{
    private JPanel mainPanel;
    private JTextField userText;
    private JButton sendBotton;
    private JPasswordField passwordField;

    public LogForm(){
        inicializingForm();
        sendBotton.addActionListener(e -> valid());
    }
    private void inicializingForm(){
        setContentPane(mainPanel);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(600,400);
            setLocationRelativeTo(null);
    }
    private void valid(){
        String user = this.userText.getText();
        String password = new String(this.passwordField.getPassword());
        if("root".equals(user) && "admin".equals(password))
            show("Valid Data, Welcome");
        else if ("root".equals(user))
            show("Invalid Password");
        else
            show("Invalid user");
    }

    public void show(String massage){
        JOptionPane.showMessageDialog(this, massage);

    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        LogForm logForm = new LogForm();
        logForm.setVisible(true);
    }
}
