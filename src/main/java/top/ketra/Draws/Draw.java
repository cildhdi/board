package top.ketra.Draws;

import java.awt.Color;
import java.awt.Point;
import java.awt.Graphics;

public class Draw {
    Color color = Color.BLACK;
    String uuid = "";

    public void setColor(Color color) {
        this.color = color;
    }

    public void paint(Graphics g){
        g.setColor(color);
    }

    public void onMouseDown(Point pt){}

    public void onMouseMove(Point pt){}
}