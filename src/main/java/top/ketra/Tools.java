package top.ketra;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

import top.ketra.Global.DrawsType;

import java.awt.*;
import java.util.ArrayList;
import java.awt.event.*;

public class Tools extends JFrame implements ActionListener {
    private static final long serialVersionUID = 6994575605036917489L;

    JButton setColor = new JButton("设置颜色"), setWidth = new JButton("设置宽度");
    ArrayList<JButton> drawBtns = new ArrayList<JButton>();

    Tools() {
        setTitle("工具栏");
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
        setLayout(new GridLayout(10, 1));
        initSetBtns();
        add(new JLabel("可用工具:"));
        initTools();
        setBounds(150, 400, 200, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    void initTools() {
        DrawsType[] draws = DrawsType.values();
        for (int i = 0; i < draws.length; i++) {
            JButton button = new JButton(draws[i].toString());
            button.setActionCommand(draws[i].toString());
            button.addActionListener(this);
            add(button);
            drawBtns.add(button);
        }
        drawBtns.get(0).setEnabled(false);
    }

    void initSetBtns() {
        setColor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(null, "请选择颜色", null);
                if (color != null) {
                    Global.currentColor = color;
                }
            }
        });

        setWidth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                String number = JOptionPane.showInputDialog(null, "请输入宽度");
                if (number != null) {
                    try {
                        float value = Float.parseFloat(number);
                        if (value >= 1) {
                            Global.currentWidth = value;
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "数字格式错误", "错误", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        add(setColor);
        add(setWidth);
    }

    void activeAllBtns() {
        drawBtns.forEach((btn) -> btn.setEnabled(true));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        activeAllBtns();
        btn.setEnabled(false);
        Global.currentSelectDraw = DrawsType.valueOf(e.getActionCommand());
    }
}