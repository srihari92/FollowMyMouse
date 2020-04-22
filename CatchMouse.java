import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<applet code=CatchMouse width=500 height=500></applet>
public class CatchMouse extends Applet implements MouseMotionListener
{
	int x[],y[],i=55,j=55,xx=0,yy=0;
	public void init()
	{
		x=new int[1000];
		y=new int[1000];
		addMouseMotionListener(this);
		for(int i=0;i<1000;i++)
		{
			x[i]=0;
			y[i]=0;
		}
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.green);
		g.fillOval(x[i-55]-25,y[j-55]-25,100,100);
		g.fillOval(x[i-53]-25,y[j-53]-25,100,100);
		g.fillOval(x[i-50]-25,y[j-50]-25,100,100);
		g.fillOval(x[i-45]-25,y[j-45]-25,100,100);
		g.fillOval(x[i-40]-25,y[j-40]-25,100,100);
		g.setColor(Color.red);
		g.fillOval(x[i-40],y[j-40]-5,15,15);
		g.fillOval(x[i-40]+30,y[j-40]-5,15,15);
		g.fill3DRect(xx-20, yy-20, 40, 40, true);
		if(i<999)
		{i++;j++;}
		else
		{
			for(int i=944,j=0;i<1000;i++,j++)
			{	x[j]=x[i];y[j]=y[i];}
			i=56;j=56;
		}
	}
	public void mouseMoved(MouseEvent me)
	{
		x[i]=xx=me.getX();
		y[j]=yy=me.getY();
		repaint();
		showStatus("x="+xx+"y="+yy);
	}
	public void mouseDragged(MouseEvent me)
	{}
}