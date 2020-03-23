package top.ketra;

import java.awt.*;
import java.util.UUID;

import top.ketra.Draws.Draw;
import top.ketra.Draws.Line;
import top.ketra.Draws.Rect;

public class Global {
    enum DrawsType {
        直线,
        矩形
    }

    static String address = "129.211.11.59";
    static final String port = ":8001";
    static DrawsType currentSelectDraw = DrawsType.直线;
    static Color currentColor = Color.BLACK;
    static float currentWidth = 1;

    static public void createDraw(Point pt) {
        switch (currentSelectDraw) {
            case 直线:
                currentDraw = new Line();
                break;
            case 矩形:
                currentDraw=new Rect();
                break;
            default:
                currentDraw = new Line();
                break;
        }
        currentDraw.setUuid(UUID.randomUUID().toString());
        currentDraw.setColor(currentColor);
        currentDraw.setWidth(currentWidth);
        currentDraw.onMouseDown(pt);
    }

    static Draw currentDraw;
}