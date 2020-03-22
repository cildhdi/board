package top.ketra;

import java.awt.Point;
import java.util.UUID;

import top.ketra.Draws.Draw;
import top.ketra.Draws.Line;

public class Global {
    enum DrawsType {
        LINE
    }

    static String address = "129.211.11.59";
    static final String port = ":8001";
    static DrawsType currentSelectDraw = DrawsType.LINE;

    static public void createDraw(Point pt) {
        switch (currentSelectDraw) {
            case LINE:
                currentDraw = new Line();
                break;
            default:
                currentDraw = new Line();
                break;
        }
        currentDraw.setUuid(UUID.randomUUID().toString());
        currentDraw.onMouseDown(pt);
    }

    static Draw currentDraw;
}