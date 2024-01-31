package com.ezhilgame.src.objects;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
public class Bullet{
	private String Bulletimage = "/images/bullet.png";
	int velY =-6;
	public int x;
	public int y;
	public Bullet(int x, int y) {
	     this.x = x;
		 this.y = y;
	}
   public void update() {
	   y+=velY;
	   if(y<0)
   		y=-100;
   }  
   public Rectangle getBounds()
	{
		return new Rectangle (x,y,15,40);
	}
    public void draw(Graphics2D g2d) 
    {
    	g2d.drawImage(getBulletImage(), x, y, null);
    	//g2d.draw(getBounds());
    } 
    public Image getBulletImage()
    {
		ImageIcon i = new ImageIcon(getClass().getResource(Bulletimage));
	    Image img1 = i.getImage();
	    Image img2 = img1.getScaledInstance(15, 40, java.awt.Image.SCALE_SMOOTH);
	    i = new ImageIcon(img2);
    	return i.getImage();
   }		
	}
