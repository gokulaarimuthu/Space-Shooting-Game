package com.ezhilgame.src;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Button implements MouseListener{

public void mousePressed(MouseEvent e) {
int mx = e.getX();
int my = e.getY();

if(mx>550 && mx<750 ) 
		{
	if(my>200 && my<280)		
{
	 Game.state = Game.STATE.GAME;	
}
	}
if(mx>550 && mx<750 )
{
	if(my>350 && my<430)
{
	    Jfame();    
}
}        
if(mx>550 && mx<750)
{
	if(my>500 && my<580)
{
   System.exit(0);
}
	}
}
JFrame fram;
JLabel lab1;
JLabel lab2;
JLabel lab3;
public void Jfame() 
{
fram = new JFrame("Space Shooting Game");
fram.setSize(1000,600);
fram.setVisible(true);

Font f= new Font("Arial",Font.BOLD,45);
Font f1= new Font("Arial",Font.PLAIN,25);
lab1 = new JLabel();
lab1.setText("SPACE SHOOTING GAME(CONTROLS)");
lab1.setBounds(250, 30, 1000, 50);

fram.add(lab1);

lab1.setFont(f);
lab1.setForeground(Color.blue);

lab2 = new JLabel();
lab2.setText("<html><body> <br>This  is  a  Basic  Shooting  Game, Inspired  by  Space  Invaders. "
		+ "The  Player  can  control  the  ship  using  Keyboard"
	+ "<br>Left, Right, Up  and  Down  Keys. Make  sure  the  ship  is  not  colliding  with the "
	+ "Enemies, if it does then the ship health <br>get reduced Which leads to Gameover."
		+ "The  Player  can  also  shoot  the  Ship  using  SPACE  key, and  then  the  score  get  "
		+ "<br> increased.<br><br>"
		+ "CREATORS : EZHILARASAN, GOKUL, CHIDAMBARA THANU</body></html> ");
 lab2.setFont(f1);
 lab2.setBounds(40, 100, 2500,250);
 fram.add(lab2);

 lab3 = new JLabel();
 lab3.setText("");
 lab3.setFont(f1);
 lab3.setBounds(50, 70, 250, 50);
 fram.add(lab3);    
} 
@Override
public void mouseClicked(MouseEvent e) {
}
@Override
public void mouseReleased(MouseEvent e) {
}
@Override
public void mouseEntered(MouseEvent e) {
}
@Override
public void mouseExited(MouseEvent e) {
}   

}
