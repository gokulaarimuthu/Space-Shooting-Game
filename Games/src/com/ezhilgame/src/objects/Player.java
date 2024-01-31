package com.ezhilgame.src.objects;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import com.ezhilgame.src.GlobalPos;
 
 public class Player extends GlobalPos{
	
 private String playerimage = "/images/34632-ship.png";
	int velX = 0;
	int velY = 0;

	public Player(int x, int y) {
		super(x,y);
	}
    public void update()
    {
    	x+=velX;
    	y+=velY;
    	if(x<=-30)
    		x=-30;
    	if(x>=1186)
        	x=1186;
        if(y<=0)
    		y=0;
    	if(y>540)
    		y=540;	
   }

    public Image getPlayerImage()
    {
		ImageIcon i = new ImageIcon(getClass().getResource(playerimage));
	    Image img1 = i.getImage();
	    Image img2 = img1.getScaledInstance(150, 130, java.awt.Image.SCALE_SMOOTH);
	    i = new ImageIcon(img2);
    	return i.getImage();
    }
    public void draw(Graphics2D g2d) 
    {
    	g2d.drawImage(getPlayerImage(), x, y, null);
    	//g2d.draw(getBounds());
    } 
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_RIGHT)
		{
			velX = 8;
		}
		else if(key == KeyEvent.VK_LEFT)
		{
			velX =-6;
		}
		else if(key == KeyEvent.VK_UP)
		{
			velY =-8;
		}
		else if(key == KeyEvent.VK_DOWN)
		{
			 velY =8;
		}
	}
	public void keyReleased(KeyEvent e)
	{
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_RIGHT)
		{
			velX = 3;
		}
		else if(key == KeyEvent.VK_LEFT)
		{
			velX = -3;
		}
		else if(key == KeyEvent.VK_UP)
		{
			velY = 0;
		}
		else if(key == KeyEvent.VK_DOWN)
		{
			velY = 0;
		}
	}
	public Rectangle getBounds()
	{
		return new Rectangle (x,y,123,130);
	}
	
}

