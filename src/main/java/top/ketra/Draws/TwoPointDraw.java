package top.ketra.Draws;

import java.awt.Point;

public class TwoPointDraw extends Draw {

    private static final long serialVersionUID = -8196820441040334765L;

    Point start, end;

    @Override
    public void onMouseDown(Point pt) {
        start = pt;
        end = pt;
    }

    @Override
    public void onMouseMove(Point pt) {
        end = pt;
    }

}