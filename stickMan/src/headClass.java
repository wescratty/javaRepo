import java.awt.Graphics;


public class headClass {
	 int rotate = 0;
	 int degrease = 0;
	 double theta = 0;
	 double rad = 0;
	 int num = 0;
	

	 int x = 0;
	 int y = 0;
	 int xs = 0;
	
	 int ys = 0;
	 int hight = 0;
	 int width = 0;
	

	 int boneLength = 0;
	public headClass()
	{
		
}

public void move() {

}

public void math() {
	theta = (((rad) * Math.PI) / 24);
	x = boneLength-4;//(int) ((boneLength) * Math.cos(theta));
	y = boneLength+4;//(int) ((boneLength) * Math.sin(theta));
}
public void connectPart()
{
	xs=xs-(width/2);
	ys=ys-(hight);
//	System.out.println("head\nxs: "+xs+"\nys: "+ys+"\nx: "+x+"\ny :"+y);
}
//public void paintComponent(Graphics g) {
//
//	g.drawLine(xs, ys, x, y);
//}

public void setRad(double rad) {
	this.rad = rad;
}
public int getHight() {
	return hight;
}
public int getWidth() {
	return width;
}
public void setBoneLength(int hight,int width) {
	this.hight = hight;
	this.width = width;
}
public void setnum(int x,int y) {
	xs = x;
	ys = y;
}
public int getBoneLength() {
	return boneLength;
}
public int getXs() {
	return xs;
}

public void setXs(int xs) {
	this.xs = xs;
}

public int getYs() {
	return ys;
}

public void setYs(int ys) {
	this.ys = ys;
}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

}
