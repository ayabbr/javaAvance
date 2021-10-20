package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import model.Shape;
import model.Circle;
import model.Point;
import model.Model;

public class MouseController implements MouseMotionListener{

	public Model m;
	public JFrame frame;
	
	
	public MouseController(Model m, JFrame frame) {
		// TODO Auto-generated constructor stub
		this.m = m;
		this.frame = frame;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
		Point p = new Point(e.getX(), e.getY());
		int i = 0;
		for (Shape s : m.getShapes()) {
			if (s.contains(p)) {
				m.getShapes().get(i).translate(e.getX(), e.getY());
				frame.repaint();
				return;
			}
			i++;
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		m.getShapes().get(m.getShapes().size()-1).translate(e.getX(), e.getY());
		frame.repaint();
		
	}

}
