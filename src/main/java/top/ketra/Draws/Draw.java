package top.ketra.Draws;

import java.awt.Color;
import java.awt.Point;
import java.io.Serializable;
import java.awt.Graphics;

public class Draw implements Serializable {
    private static final long serialVersionUID = 7419946148499233643L;
    Color color = Color.BLACK;
    String uuid = "";

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void paint(Graphics g) {
        g.setColor(color);
    }

    public void onMouseDown(Point pt) {
    }

    public void onMouseMove(Point pt) {
    }
}