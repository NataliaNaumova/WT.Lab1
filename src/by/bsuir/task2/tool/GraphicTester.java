package by.bsuir.task2.tool;

import by.bsuir.task2.geometrictype.Point;

/**
 * Created by Natalia on 24.09.2016.
 */
public class GraphicTester {
    public static boolean isInFilledRegion(Point point)
    {
        if ( (point.getY()<=5) && (point.getY()>=(-3)) ){
            if (point.getY()>0) {
                if ((point.getX() >= (-4)) && (point.getY() <= 4)) {
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                if ((point.getX() >= (-6)) && (point.getY() <= 6)) {
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        else{
            return false;
        }
    }
}
