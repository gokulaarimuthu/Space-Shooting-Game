package com.ezhilgame.src.input;
import java.awt.Graphics2D;
import java.util.LinkedList;
import com.ezhilgame.src.objects.Enemy;
 public class EnemyArray{
	
    static LinkedList<Enemy> e = new LinkedList<Enemy>();
	Enemy TempEnemy;
	public int x;
	public int y;
	public EnemyArray()
	{
         	e.add(new Enemy(80,20));
		    e.add(new Enemy(180,250)); 
			e.add(new Enemy(280,480));
			e.add(new Enemy(380,610));
			e.add(new Enemy(480,840));
			e.add(new Enemy(580,250));
			e.add(new Enemy(680,480));
			e.add(new Enemy(780,610));
			e.add(new Enemy(880,200));
			e.add(new Enemy(980,250));
			e.add(new Enemy(1080,80));
	}
	public void draw(Graphics2D g2d)
	{
		for(int i=0;i< e.size();i++)
		{
			TempEnemy =e.get(i);
		    TempEnemy.draw(g2d); 
		}
	}
	public void update()
	{
		for(int i=0;i< e.size();i++)
		{
			TempEnemy =e.get(i);
		    TempEnemy.update();
		}
	} 
	public void addEnemy(Enemy block)
	{
		e.add(block);
	}
	public static LinkedList<Enemy>getBounds()
	{
		return e;
	}
}
