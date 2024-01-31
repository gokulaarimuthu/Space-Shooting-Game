package com.ezhilgame.src.objects;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import com.ezhilgame.src.GlobalPos;
  public class Enemy extends GlobalPos
   {
	  int velY =9;
	  private String image = "/images/spaceenemy.png";
	  public Enemy(int x,int y)
	  {
		 super(x,y);
		}
	   public void update() {
	    	y+=velY;
	        if(y<0)
	    	{
	        	y=0;
	    	} 
	    	if(y>1000)
	    	{
	    		y=-900;
	    	}  
	   }  
	    public Image getEnemyImage()
	    {
			ImageIcon i = new ImageIcon(getClass().getResource(image));
		    Image img1 = i.getImage();
		    Image img2 = img1.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
		    i = new ImageIcon(img2);
	    	return i.getImage();			
		}
	    public void draw(Graphics2D g2d) 
	    {
	    	g2d.drawImage(getEnemyImage(), x, y, null);
	    	//g2d.draw(getBounds());
	    }
	    public Rectangle getBounds()
		{
			return new Rectangle (x,y,70,70);
		} 
       }
