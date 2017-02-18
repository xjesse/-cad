package CAD;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.util.ArrayList;
import javax.swing.JFrame;


import shape.Circle;
import shape.Shape;
import shape.Shapec;
import CAD.Cadlines;

public class window extends JFrame {
	private static final long serialVersionUID = 1L;
	private int width;
	private int height;
	public ArrayList<Shapec> cm=new ArrayList<Shapec>();
	public String DrawStyle=null;	
	public int  startX,startY,endX,endY;
	public int eex;
	public int eey;
	public String txt,tip="请选择操作";
	public Shape shapxuan=null;
	
	public void add(Shapec s)
	{
		cm.add(s);
	}

	public void Drawing(){
		
		
	}
	
	
	
	public window() {
		add(new Cadlines(cm));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setFont(new Font("宋体", Font.PLAIN, 40));
		setVisible(true);
		this.setBounds(300,50,800,650);
//		ban=new Ban(this);
//		this.add(ban,BorderLayout.SOUTH); 
//		this.add(new Tool_panel(this),BorderLayout.EAST);
//		this.pack();
//		CML=new CADMouseListener(this);
//		this.addMouseListener(CML);
//		this.addMouseMotionListener(new CADMouseMotionListener(this));
	}

	 
	
	
	
	
	
}
