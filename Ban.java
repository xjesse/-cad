package CAD;
//操作提示面板
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import shape.Shape;

public class Ban extends JPanel{
	private static final long serialVersionUID = -5258995676212660595L;
	private  window win;
	private ArrayList<Shape> cm=new ArrayList<Shape>();
	public Ban(window window){
		this.win=window;
		setLayout(null);
		add(new Cadlines(cm));
	    setPreferredSize(new Dimension(400, 30));
		setBackground(Color.DARK_GRAY);
	    setFont(new Font("宋体",Font.PLAIN,20));
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.LIGHT_GRAY);
		g.drawString(win.tip,50,20);		
	}
	
}
