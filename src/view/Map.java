package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Map extends JPanel {
	
	public Map(int height, int width){
		this.setBackground(Color.RED);
		this.setPreferredSize(new Dimension(200,200));
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(new ImageIcon("img/poulet.png").getImage(), 0, 0, null);
	}
}
