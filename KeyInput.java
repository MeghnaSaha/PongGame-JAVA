package PongGame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
	
	private Paddle p1;
	private boolean up1 = false;
	private boolean down1 = false;
	
	private Paddle p2;
	private boolean up2 = false;
	private boolean down2 = false;

	public KeyInput(Paddle p1, Paddle p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public void keyPressed(KeyEvent e) {
		
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_UP) {
			p2.switchDirection(-1);
			up2 = true;
		}
		if(key == KeyEvent.VK_DOWN) {
			p2.switchDirection(1);
			down2 = true;
		}
		if(key == KeyEvent.VK_W) {
			p1.switchDirection(-1);
			up1 = true;
		}
		if(key == KeyEvent.VK_S) {
			p1.switchDirection(1);
			down1 = true;
		}
		
		/*if(key == KeyEvent.VK_ENTER) {
			Game.running = true;
		}*/
	}
	
public void keyReleased(KeyEvent e) {
		
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_UP) {
			up2 = false;
		}
		if(key == KeyEvent.VK_DOWN) {
			down2 = false;
		}
		if(key == KeyEvent.VK_W) {
			up1 = false;
		}
		if(key == KeyEvent.VK_S) {
			down1 = false;
		}
		
		if(!up1 && !down1) {
			p1.stop();
		}
		if(!up2 && !down2) {
			p2.stop();
		}
		
	}
}
