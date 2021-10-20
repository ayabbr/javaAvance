package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.Model;
import model.Point;
import model.Circle;

public class ButtonShape extends JButton {
	
	
	
	private Model m;
	private String name;
	public ButtonShape(String n,Model model) {
		super(n);
		this.name=n;
		this.m=model;
		super.setBounds(50, 100, 95, 30);
		super.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				m.getShapes().remove(m.getShapes().size()-1);
				if(name=="Circle") m.getShapes().add(new Circle(new Point(50,50),100));
				else if (name=="Point") m.getShapes().add(new Point(50,50));
			}
		});
	}

}
