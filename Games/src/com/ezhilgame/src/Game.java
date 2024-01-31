package com.ezhilgame.src;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.ezhilgame.src.input.BulletArray;
import com.ezhilgame.src.input.EnemyArray;
import com.ezhilgame.src.input.KeyInput;
import com.ezhilgame.src.objects.Bullet;
import com.ezhilgame.src.objects.Enemy;
import com.ezhilgame.src.objects.Player;

public class Game extends JPanel implements ActionListener
{
	Player p;
	EnemyArray c;
    BulletArray u;
    private Menu m;
    Random ex = new Random();
    Random ey = new Random();
	int q;
	int w;
	static LinkedList<Bullet>l= BulletArray.getBounds();
	static LinkedList<Enemy> e = EnemyArray.getBounds();
	
    public static int HEALTH = 200;
    public static enum STATE{
    	MENU,
    	GAME,
        HELP
    };
    static STATE state = STATE.MENU;
	private String background ="/images/maxresdefault.jpg";
	Game game;
	public int score = 0;

	 Game() 
	{ 
		setFocusable(true);
		Timer gameloop = new Timer(10,this);
	    gameloop.start();  
	     p = new Player(500,500);
	     c=  new EnemyArray();
	     u = new BulletArray();
	     m = new Menu();
	    addKeyListener(new KeyInput(this,p));
	    addMouseListener(new Button());   
	}
	public void paint(Graphics g)
	{	
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(getBackgroundImage(),0,0,null);
		if(state == STATE.GAME)
		{
		p.draw(g2d);
		c.draw(g2d);
		u.draw(g2d);
		
		g2d.setColor(Color.gray);
		g2d.fillRect(10,10, 200, 60);
		
		g2d.setColor(Color.green);
		g2d.fillRect(10,10,HEALTH, 60);
		
		g2d.setColor(Color.white);
		g2d.drawRect(10,10, 200, 60);
		
		Font fn = new Font("arial",Font.BOLD,40);
    	g2d.setFont(fn);
    	g2d.setColor(Color.ORANGE);
    	g2d.drawString("SCORE : "+ score, 1000, 60);
	  } 
	else if(state == STATE.MENU)
	{
			m.draw(g2d);
		}
	} 
	public Image getBackgroundImage()
	{
		ImageIcon i = new ImageIcon(getClass().getResource(background));
    	return i.getImage();
	}	
	
	public void actionPerformed(ActionEvent ee) {
		if(state == STATE.GAME)
		{
		repaint();
		p.update();
		c.update();
		u.update();
		PlayerEnemyCollision();
	    BulletEnemyCollosion();
	    printx();
	    printy();
		}		
	}
	public Rectangle getBounds()
	{
			return new Rectangle (p.x,p.y,150,130);
		}
	public void BulletEnemyCollosion()
	{
		for(int i = 0; i<l.size(); i++)
		{
			for(int j=0; j<e.size(); j++)
			{
			if(l.get(i).getBounds().intersects(e.get(j).getBounds()))
				{
				e.remove(j);
				score+=10;
			   c.addEnemy(new Enemy(q,w));
			}
		}
	}
	}
    public void PlayerEnemyCollision(){
		
		for(int i=0; i<e.size();i++)
    {
    	if(getBounds().intersects(e.get(i).getBounds()))
    	{	
    		//System.out.println("Collision");
        	HEALTH-=1;
        	if(HEALTH==0)
        	{
            state = STATE.MENU;
            HEALTH=200;
            score=0;
        	}
    	}
    }
    }
	public int printx()
	{
	  for(int i =0;i<=5;i++)
		{
		q = ex.nextInt(1200);
		}
		return q;
	}
	public int printy()
	{
	  for(int i =0;i<=5;i++)
		{
		w = ey.nextInt(737);
		}
		return w;
	}
	
	public void keyPressed(KeyEvent ee)
	{
	  int key = ee.getKeyCode();
	  if(state == STATE.GAME)
	{
      if(key == KeyEvent.VK_SPACE)
	{
	   u.addBullet(new Bullet(p.x+68,p.y-30));  
	}
	}	
	}
	public static void main(String[] args) 
	{
		
		JFrame frame = new JFrame("Space Shooting Game");
		frame.setSize(1000,600);
		frame.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.add(new Game());    
	}
}
