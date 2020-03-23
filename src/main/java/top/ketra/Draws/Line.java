package top.ketra.Draws;

import java.awt.Graphics;

public class Line extends TwoPointDraw{
    private static final long serialVersionUID = 7639680004662908045L;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(start.x, start.y, end.x, end.y);
    }
}