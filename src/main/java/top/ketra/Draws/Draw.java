package top.ketra.Draws;

import java.io.Serializable;
import java.awt.*;

public class Draw implements Serializable {
    private static final long serialVersionUID = 7419946148499233643L;
    Color color = Color.BLACK;
    float width = 3;
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
        if (g instanceof Graphics2D) {
            ((Graphics2D) g).setStroke(new BasicStroke(width));
        }
    }

    public void setWidth(float width) {
        if (width >= 1) {
            this.width = width;
        }
    }

    public void onMouseDown(Point pt) {
    }

    public void onMouseMove(Point pt) {
    }
}