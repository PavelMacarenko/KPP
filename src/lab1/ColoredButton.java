package lab1;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.RenderingHints;

import javax.swing.JButton;

public class ColoredButton extends JButton {
	
	 Color color1;
	 Color color2;
	 
	 public ColoredButton(String text, Color color1, Color color2)
	 {
		super(text);
		this.color1 = color1;
		this.color2 = color2;
		setOpaque(false);
		setContentAreaFilled(false);
        setFocusPainted(false);
        
	 }
	 
	 @Override
	 public void paintComponent(Graphics g)
	 {
		 final Graphics2D g2 = (Graphics2D) g.create();
         g2.setPaint(new GradientPaint(
                 new Point(0, 0), 
                 color1, 
                 new Point(0, getHeight()), 
                 color2));
         g2.fillRect(0, 0, getWidth(), getHeight());
         g2.dispose();

         super.paintComponent(g);
	  } 	
}
