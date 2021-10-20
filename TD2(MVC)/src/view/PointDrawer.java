package view;
import java.awt.Graphics;
import model.Point;
public class PointDrawer extends Drawer {

    private Point point;
    
    public PointDrawer(Point p){
        this.point = p;
    }
    
    @Override
    public void draw(Graphics g) {
        g.drawOval(point.getX(), point.getY(), 2, 2);
    }
}
