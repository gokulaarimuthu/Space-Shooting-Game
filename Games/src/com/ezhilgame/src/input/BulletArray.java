package com.ezhilgame.src.input;
import java.awt.Graphics2D;
import java.util.LinkedList;
import com.ezhilgame.src.objects.Bullet;
public class BulletArray {
	
 static	LinkedList<Bullet> l = new LinkedList<Bullet>();
    Bullet Tempnemy;
    Bullet b;
	public int x;
	public int y;
	
	public BulletArray()
	{
	addBullet(new Bullet(-2000,-2000));
	}
	public void update()
	{
		for(int i=0;i< l.size();i++)
		{
			Tempnemy =l.get(i);
			Tempnemy.update();	
			//if(
		//	{
		//		l.remove();
			//}
		}
	}
	public void draw(Graphics2D g2d)
	{
		for(int i=0;i< l.size();i++)
		{
			Tempnemy =l.get(i);
			Tempnemy.draw(g2d);
			}
	}
	public void addBullet(Bullet block)
	{
		l.add(block);
	}
	public static LinkedList<Bullet>getBounds()
	{
		return l;
	}
}

