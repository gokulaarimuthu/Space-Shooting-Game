package com.ezhilgame.src;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Menu {

	public Rectangle playbutn = new Rectangle(550,200,200,80);
	public Rectangle helpbutn = new Rectangle(550,350,200,80);
	public Rectangle quitbutn = new Rectangle(550,500,200,80);

	 public void draw(Graphics2D g2d) 
	 {
         	Font fn = new Font("arial",Font.BOLD,50);
	    	g2d.setFont(fn);
	    	g2d.setColor(Color.red);
	    	g2d.drawString("SPACE SHOOTING GAME", 330, 100);
	    
	    	g2d.setColor(Color.CYAN);
	    	Font fb = new Font("arial",Font.BOLD,30);
	    	g2d.setFont(fb);
	    	 
	    	g2d.drawString("Play", playbutn.x+70, playbutn.y+50);
	    	g2d.draw(playbutn);
	    	
	    	g2d.setColor(Color.CYAN);
	    	g2d.drawString("Help",helpbutn.x+70 , helpbutn.y+50);
	    	g2d.draw(helpbutn);
	  
	    	g2d.setColor(Color.CYAN);
	    	g2d.drawString("Quit",quitbutn.x +70, quitbutn.y+50 );
	    	g2d.draw(quitbutn);
	 }	    
}
