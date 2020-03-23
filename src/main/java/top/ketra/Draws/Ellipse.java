package top.ketra.Draws;

import java.awt.Graphics;

public class Ellipse extends TwoPointDraw {
    private static final long serialVersionUID = 1839156447023540468L;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(Math.min(start.x, end.x), Math.min(start.y, end.y), Math.abs(end.x - start.x),
                Math.abs(end.y - start.y));
    }
}