package top.ketra.Draws;

import java.awt.Graphics;
import java.awt.Point;
import java.io.Serializable;

public class Line extends Draw implements Serializable {
    private static final long serialVersionUID = 7639680004662908045L;
    Point start, end;

    @Override
    public void onMouseDown(Point pt) {
        start = pt;
    }

    @Override
    public void onMouseMove(Point pt) {
        end = pt;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine((int) start.getX(), (int) start.getY(), (int) end.getX(), (int) end.getY());
    }
}