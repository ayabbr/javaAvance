package view;

import java.awt.Graphics;
import model.Circle;

public class CircleDrawer extends Drawer{
	
	public Circle c;
	public CircleDrawer(Circle c) {
		// TODO Auto-generated constructor stub
		this.c=c;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
g.drawOval(c.getCenter().getX(),c.getCenter().getY(),c.getRadius(), c.getRadius());
		
	}
	

}
