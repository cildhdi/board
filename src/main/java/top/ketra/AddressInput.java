package top.ketra;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * AddressInput
 */
public class AddressInput extends JFrame implements ActionListener, KeyListener {

    private static final long serialVersionUID = 1L;

    JTextField textField;
    JButton confirm;

    Pattern pattern = Pattern.compile(
            "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])");

    public AddressInput() {
        setTitle("请输入服务器地址");
        setBounds(100, 100, 360, 100);
        setLayout(new FlowLayout());
        textField = new JTextField(30);
        textField.addKeyListener(this);
        textField.addActionListener(this);
        textField.setText("129.211.11.59");
        confirm = new JButton("确定");
        confirm.addActionListener(this);
        add(textField);
        add(confirm);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        Global.address = textField.getText();
        setVisible(false);
        Board board = new Board();
        board.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        Matcher matcher = pattern.matcher(textField.getText());
        confirm.setVisible(matcher.matches());
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}