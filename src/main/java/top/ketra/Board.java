package top.ketra;

import java.awt.AWTEvent;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;

import javax.swing.JFrame;

import top.ketra.Draws.Draw;

public class Board extends JFrame implements MouseMotionListener, MouseListener {
    private static final long serialVersionUID = 2L;

    private HashMap<String, Draw> draws = new HashMap<String, Draw>();

    public Board() {
        setBounds(400, 400, 500, 350);
        setTitle("画板主界面");
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);
        addMouseMotionListener(this);
        addMouseListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        draws.forEach((k, v) -> v.paint(g));
        if (Global.currentDraw != null) {
            Global.currentDraw.paint(g);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (Global.currentDraw != null) {
            Global.currentDraw.onMouseMove(e.getPoint());
            repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Global.currentDraw.onMouseDown(e.getPoint());
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
    }
}