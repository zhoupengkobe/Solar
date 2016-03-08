package cn.bjsxt.solar;

import java.awt.Graphics;
import java.awt.Image;

import cn.bjsxt.util.Constant;
import cn.bjsxt.util.GameUtil;
import cn.bjsxt.util.MyFrame;

/**
 * 太阳系的主窗口
 * @author ko
 *
 */
public class SolarFrame extends MyFrame {
	Image bg=GameUtil.getImage("images/bg.jpg");
	Star sun=new Star("images/sun.jpg", Constant.GAME_WIDTH/2, Constant.GAME_HEIGHT/2);
	Planet earth=new Planet("images/earth.jpg", 150, 100, 0.1, sun);
	
	Planet moon=new Planet("images/moon.jpg", 30, 20, 0.4, earth,true);
	
	Planet Mars=new Planet("images/Mars.jpg", 200, 130, 0.3, sun);
	
	Planet Mercury=new Planet("images/Mercury.jpg", 300, 180, 0.1, sun);
	
	Planet Neptune=new Planet("images/Neptune.jpg", 400, 210, 0.3, sun);

	Planet Uranus=new Planet("images/Uranus.jpg", 500, 280, 0.6, sun);

	Planet Saturn=new Planet("images/Saturn.jpg", 450, 250, 0.5, sun);

	Planet Venus=new Planet("images/Venus.jpg", 500, 300, 0.7, sun);
	
	Planet Jupiter=new Planet("images/Jupiter.jpg", 600, 400, 0.7, sun);

	
    private Image iBuffer;  
    private Graphics gBuffer; 
	
	public void paint(Graphics g){
		g.drawImage(bg, 0, 0, null);
		sun.draw(g);
		earth.draw(g);
		Mars.draw(g);
		moon.draw(g);
		Mercury.draw(g);
		Neptune.draw(g);
		Saturn.draw(g);
		Venus.draw(g);
		Uranus.draw(g);
		Jupiter.draw(g);
		
		
		
	}
	/**
	 * 解决闪烁的问题
	 */
	  public void update(Graphics g)  
	    {  
	        if(iBuffer==null)  
	        {  
	           iBuffer=createImage(this.getSize().width,this.getSize().height);  
	           gBuffer=iBuffer.getGraphics();  
	        }  
	           gBuffer.setColor(getBackground());  
	           gBuffer.fillRect(0,0,this.getSize().width,this.getSize().height);  
	           paint(gBuffer);  
	           g.drawImage(iBuffer,0,0,this);  
	    } 
	
	
	public static void main(String[] args) {
		new SolarFrame().launchFrame();
	}

}
