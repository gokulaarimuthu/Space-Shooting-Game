package com.ezhilgame.src.input;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import com.ezhilgame.src.Game;
import com.ezhilgame.src.objects.Player;

public class KeyInput extends KeyAdapter{	
	Player p;
	private Game game;
    public KeyInput(Game game,Player p) {
	 this.game = game;
	 this.p=p;
	}
    public void keyPressed(KeyEvent e)
	{
	     game.keyPressed(e);
         p.keyPressed(e);
	}
	public void keyReleased(KeyEvent e)
	{
		p.keyReleased(e);
	}
}

