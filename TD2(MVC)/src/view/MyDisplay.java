package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Shape;
import model.Model;
import controller.MouseController;
import controller.ButtonShape;



public class MyDisplay extends JPanel{
	
	private Model m;
	
public MyDisplay(Model m){
		
		this.m = m;
		ButtonShape p = new ButtonShape("Point",m);
		ButtonShape c = new ButtonShape("Circle",m);
		this.add(p);
		this.add(c);
		
	}


	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.black);
		for (Shape s : m.getShapes()) {
			s.drawer.draw(g);
		}
	}
 		
	
	
	
	public static void main(String []args){
		JFrame frame = new JFrame("Java Avancé - Graphic Display");
		Model m = new Model();
		MyDisplay d = new MyDisplay(m);
		MouseController MC = new MouseController(m, frame);
		frame.add(d);
		frame.addMouseMotionListener(MC);
		frame.setSize(new Dimension(500, 500));
		frame.setVisible(true);
}
	
}
