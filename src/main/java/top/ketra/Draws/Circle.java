package top.ketra.Draws;

import java.awt.Graphics;
import java.awt.Point;

public class Circle extends TwoPointDraw {
    private static final long serialVersionUID = 2830051253151463778L;

    int radius = 0;

    @Override
    public void onMouseMove(Point pt) {
        radius = (int) Math.sqrt(Math.pow(start.x - pt.x, 2) + Math.pow(start.y - pt.y, 2));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(start.x - radius, start.y - radius, radius * 2, radius * 2);
    }
}