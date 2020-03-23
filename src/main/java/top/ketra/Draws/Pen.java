package top.ketra.Draws;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Pen extends Draw {
    private static final long serialVersionUID = -5456271976093070749L;

    ArrayList<Point> points;

    @Override
    public void onMouseDown(Point pt) {
        points = new ArrayList<Point>();
        points.add(pt);
    }

    @Override
    public void onMouseMove(Point pt) {
        points.add(pt);
    }

    @Override
    public void paint(Graphics g) {
        int[] x = new int[points.size()];
        int[] y = new int[points.size()];
        for (int i = 0; i < points.size(); i++) {
            x[i] = points.get(i).x;
            y[i] = points.get(i).y;
        }
        super.paint(g);
        g.drawPolyline(x, y, x.length);
    }
}