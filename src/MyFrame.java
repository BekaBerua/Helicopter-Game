import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements KeyListener{
	
	
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	ImageIcon icon;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.addKeyListener(this);
		
		icon = new ImageIcon("Helicopter.png");
		
		label1 = new JLabel();
		label1.setBounds(0, 380, 100, 100);
		label1.setIcon(icon);
		
		label2 = new JLabel();
		label2.setBounds(80,150,400,60);
		label2.setBackground(new Color(0x7289da));
		label2.setForeground(new Color(0x000000));
		label2.setOpaque(true);
		label2.setText("W,A,S,D for horizontal and vertical movement");
		label2.setFont(new Font("Georgia",Font.BOLD,16));
		
		label3 = new JLabel();
		label3.setBounds(80,190,400,60);
		label3.setBackground(new Color(0x7289da));
		label3.setForeground(new Color(0x000000));
		label3.setOpaque(true);
		label3.setText("Q,E,Z,F for diagonal movement");
		label3.setFont(new Font("Georgia",Font.BOLD,16));
		
		label4 = new JLabel();
		label4.setBounds(100,0,400,60);
		label4.setBackground(new Color(0x7289da));
		label4.setForeground(new Color(0xdd0ef0));
		label4.setOpaque(true);
		label4.setText("Helicopter Game!");
		label4.setFont(new Font("Georgia",Font.BOLD,35));
		
		this.getContentPane().setBackground(new Color(0x7289da));
		this.setTitle("Helicopter Game!");
		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(label4);
		this.setVisible(true);
	
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//keyTyped = Invoked when a key is typed. Uses KeyChar, char output
		switch(e.getKeyChar()) {
			case 'a': label1.setLocation(label1.getX()-8, label1.getY());
				break;
			case 'w': label1.setLocation(label1.getX(), label1.getY()-8);
				break;
			case 's': label1.setLocation(label1.getX(), label1.getY()+8);
				break;
			case 'd': label1.setLocation(label1.getX()+8, label1.getY());
				break;
			case 'f': label1.setLocation(label1.getX()+8, label1.getY()+8);
				break;
			case 'q': label1.setLocation(label1.getX()-8, label1.getY()-8);
				break;
			case 'e': label1.setLocation(label1.getX()+8, label1.getY()-8);
				break;
			case 'z': label1.setLocation(label1.getX()-8, label1.getY()+8);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
		switch(e.getKeyCode()) {
			case 37: label1.setLocation(label1.getX()-8, label1.getY());
				break;
			case 38: label1.setLocation(label1.getX(), label1.getY()-8);
				break;
			case 39: label1.setLocation(label1.getX()+8, label1.getY());
				break;
			case 40: label1.setLocation(label1.getX(), label1.getY()+8);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//keyReleased = called whenever a button is released
		System.out.println("You released key character: "+ e.getKeyChar());
		System.out.println("You released key code: "+ e.getKeyCode());
	}
	
}

