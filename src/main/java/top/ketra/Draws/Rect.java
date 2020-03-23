package top.ketra.Draws;

import java.awt.Graphics;

public class Rect extends TwoPointDraw {

    private static final long serialVersionUID = 1116989549025190628L;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(Math.min(start.x, end.x), Math.min(start.y, end.y), Math.abs(end.x - start.x),
                Math.abs(end.y - start.y));
    }
}